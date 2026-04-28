package com.wynncraft.algorithms;

import com.wynncraft.core.NegativeMaskCache;
import com.wynncraft.core.WynnPlayer;
import com.wynncraft.core.interfaces.IAlgorithm;
import com.wynncraft.core.interfaces.IEquipment;
import com.wynncraft.core.interfaces.Information;
import com.wynncraft.enums.SkillPoint;
import speiger.src.collections.ints.lists.IntArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Information(name = "WynnAlgorithm", version = 1, authors = {"hppeng"})
public class WynnAlgorithm implements IAlgorithm<WynnPlayer> {

    private static final SkillPoint[] SKILL_POINTS = SkillPoint.values();
    private static final int NUM_SKILLPOINTS = 5;

    private NegativeMaskCache maskCache = new NegativeMaskCache();

    @Override
    public Result run(WynnPlayer player) {
        IEquipment[] items = player.equipment().toArray(new IEquipment[0]);
        int[] assignedSP = new int[SKILL_POINTS.length];
        for (int i = 0; i < SKILL_POINTS.length; i++) {
            assignedSP[i] = player.allocated(SKILL_POINTS[i]);
        }

        boolean[] keep = check(items, assignedSP);

        List<IEquipment> valid = new ArrayList<>();
        List<IEquipment> invalid = new ArrayList<>();
        for (int i = 0; i < items.length; i++) {
            if (keep[i]) {
                valid.add(items[i]);
                player.modify(items[i].bonuses(), true);
            } else {
                invalid.add(items[i]);
            }
        }
        return new Result(valid, invalid);
    }

    @Override
    public void clearCache() {
        maskCache = new NegativeMaskCache();
    }

    private static boolean canEquip(IEquipment item, int[] skillpoints) {
        int[] reqs = item.requirements();
        for (int i = 0; i < NUM_SKILLPOINTS; ++i) {
            // NOTE: cannot be > 0. Thanks to crafted items
            if (reqs[i] != 0) {
                if (reqs[i] > skillpoints[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(IEquipment item, int[] skillpoints) {
        int[] reqs = item.requirements();
        int[] bonuses = item.bonuses();
        for (int i = 0; i < NUM_SKILLPOINTS; ++i) {
            // NOTE: cannot be > 0. Thanks to crafted items
            if (reqs[i] != 0) {
                if (reqs[i] + bonuses[i] > skillpoints[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void apply(IEquipment item, int[] skillpoints) {
        int[] bonuses = item.bonuses();
        for (int i = 0; i < NUM_SKILLPOINTS; ++i) {
            skillpoints[i] += bonuses[i];
        }
    }

    private boolean[] check(IEquipment[] items, int[] assignedSkillpoints) {
        assert(assignedSkillpoints.length == NUM_SKILLPOINTS);

        List<IEquipment> positives = new ArrayList<IEquipment>();
        List<IEquipment> negatives = new ArrayList<IEquipment>();
        // Track the positives and negatives back to item indices
        List<Integer> positiveIndex = new ArrayList<Integer>();
        List<Integer> negativeIndex = new ArrayList<Integer>();
        for (int itemIndex = 0; itemIndex < items.length; ++itemIndex) {
            IEquipment item = items[itemIndex];
            boolean added = false;
            int[] bonuses = item.bonuses();
            for (int i = 0; i < NUM_SKILLPOINTS; ++i) {
                if (bonuses[i] < 0) {
                    negatives.add(item);
                    negativeIndex.add(itemIndex);
                    added = true;
                    break;
                }
            }
            if (!added) {
                positives.add(item);
                positiveIndex.add(itemIndex);
            }
        }

        IntArrayList cachedMasks = maskCache.get(negatives.size());
        boolean changed;


        int bestCount = 0;
        int bestWeight = 0;
        boolean[] bestResult = null;
        boolean[] baseResult = new boolean[items.length];


        // Total skillpoints. Interpreted from implicit assigned skillpoints
        // in zeer's writeup
        int[] baseSkillpoints = assignedSkillpoints.clone();

        // bonus skillpoints only.
        int[] positiveBonuses = new int[NUM_SKILLPOINTS];
        int basePositiveWeight = 0;

        boolean[] baseActivePositive = new boolean[positives.size()];

        // LABEL 1 apply positive greedy
        do {
            changed = false;
            for (int i = 0; i < positives.size(); ++i) {
                if (baseActivePositive[i]) continue;
                IEquipment item = positives.get(i);
                if (!canEquip(item, baseSkillpoints)) continue;

                baseActivePositive[i] = true;
                changed = true;
                // Save the greedy positives as valid
                baseResult[positiveIndex.get(i)] = true;

                apply(item, baseSkillpoints);
                apply(item, positiveBonuses);
                basePositiveWeight += IntStream.of(item.bonuses()).sum();

            }
        } while (changed);
        bestResult = baseResult;

        // LABEL 2 apply negative sets
        maskloop:
        for (int maskIdx = 0; maskIdx < cachedMasks.size(); ++maskIdx) {
            int mask = cachedMasks.getInt(maskIdx);
            int numNegative = Integer.bitCount(mask);
            int maxCount = numNegative + positives.size();
            if (maxCount < bestCount) continue;

            // valid/invalid not kept, just store the result as an array
            boolean[] result = baseResult.clone();
            IEquipment[] negativeSet = new IEquipment[numNegative];
            int[] negativeBonuses = new int[NUM_SKILLPOINTS];
            {
                int i = 0;
                int j = 0;
                for (int iterMask = mask; iterMask != 0; iterMask >>>= 1) {
                    if ((iterMask & 1) == 1) {
                        negativeSet[j] = negatives.get(i);
                        apply(negatives.get(i), negativeBonuses);
                        // Preemptively adding negative results here, to be cleaner
                        result[negativeIndex.get(i)] = true;
                        j += 1;
                    }
                    i += 1;
                }
            }

            int optimisticWeight = IntStream.of(negativeBonuses).sum()
                    + basePositiveWeight;
            if (maxCount == bestCount
                    && optimisticWeight <= bestWeight) continue;

            boolean[] activePositive = baseActivePositive.clone();
            boolean[] activeNegative = new boolean[negativeSet.length];
            int finalWeight = basePositiveWeight;

            // Difference: Skip the positive application loop, just clone
            int[] skillpoints = baseSkillpoints.clone();

            // LABEL 3 Apply loop
            do {
                changed = false;

                // Try applying negative items.
                negativeApplyLoop:
                for (int i = 0; i < negativeSet.length; ++i) {
                    if (activeNegative[i]) continue;
                    IEquipment item = negativeSet[i];
                    if (!canEquip(item, skillpoints)) continue;

                    // Make sure after negative item application that all
                    //   positive items are still valid.
                    int[] saveSkillpoints = skillpoints.clone();
                    apply(item, skillpoints);
                    for (int j = 0; j < activePositive.length; ++j) {
                        if (!activePositive[j]) continue;
                        if (isValid(positives.get(j), skillpoints)) continue;

                        // Compressed: inavlidatesPositive to just
                        // go to next iteration of the outer loop
                        skillpoints = saveSkillpoints;
                        continue negativeApplyLoop;
                    }

                    // applied!
                    activeNegative[i] = true;
                    changed = true;
                    finalWeight += IntStream.of(item.bonuses()).sum();
                }

                // Try applying positive items.
                for (int i = 0; i < positives.size(); ++i) {
                    if (activePositive[i]) continue;
                    IEquipment item = positives.get(i);
                    if (!canEquip(item, skillpoints)) continue;

                    // applied!
                    apply(item, skillpoints);
                    activePositive[i] = true;
                    changed = true;
                    finalWeight += IntStream.of(item.bonuses()).sum();
                }
            } while (changed);

            // LABEL 4: Final checks
            for (boolean b : activeNegative) {
                if (!b) continue maskloop;
            }

            for (int i = 0; i < positives.size(); ++i) {
                if (!activePositive[i]) continue;
                IEquipment item = positives.get(i);
                if (!isValid(item, skillpoints)) {
                    continue maskloop;
                }
            }

            for (int i = 0; i < negativeSet.length; ++i) {
                if (!isValid(negativeSet[i], skillpoints)) continue maskloop;
            }

            // LABEL 5: Clean up and present result
            int activeCount = numNegative;
            for (int i = 0; i < positives.size(); ++i) {
                if (!activePositive[i]) continue;
                result[positiveIndex.get(i)] = true;
                activeCount += 1;
            }

            if (bestCount > activeCount) continue;
            if (bestCount == activeCount && bestWeight > finalWeight) continue;

            bestCount = activeCount;
            bestWeight = finalWeight;
            bestResult = result;
        }

        return bestResult;
    }
}
