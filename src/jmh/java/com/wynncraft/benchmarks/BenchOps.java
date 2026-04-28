package com.wynncraft.benchmarks;

import com.wynncraft.core.SyntheticEquipment;
import com.wynncraft.core.interfaces.IAlgorithm;
import com.wynncraft.core.interfaces.IEquipment;
import com.wynncraft.core.interfaces.IPlayerBuilder;
import com.wynncraft.enums.SkillPoint;
import org.openjdk.jmh.infra.Blackhole;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Shared building blocks for benchmarks that drive the algorithm through a
 * sequence of states (incremental equip, incremental SP allocation, weapon
 * swap). Each {@code run*} helper takes an {@link IAlgorithm} and a fresh
 * {@link IPlayerBuilder} supplier, builds a new player per check, and
 * dispatches to {@code algorithm.run(player)}.
 */
public final class BenchOps {

    private static final SkillPoint[] SKILL_POINTS = SkillPoint.values();

    private BenchOps() { }

    private static IEquipment[] deepClone(IEquipment[] items) {
        IEquipment[] out = new IEquipment[items.length];
        for (int i = 0; i < items.length; i++) {
            IEquipment src = items[i];
            if (src instanceof SyntheticEquipment se) {
                out[i] = new SyntheticEquipment(se.requirements().clone(), se.bonuses().clone(), se.type());
            } else {
                // Real Equipment enum values are immutable singletons; safe to share.
                out[i] = src;
            }
        }
        return out;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private static void check(IAlgorithm<?> algorithm,
                              Supplier<IPlayerBuilder> builderSupplier,
                              IEquipment[] items,
                              int[] assignedSP,
                              Blackhole bh) {
        IPlayerBuilder builder = builderSupplier.get();
        for (int i = 0; i < SKILL_POINTS.length; i++) {
            builder.allocate(SKILL_POINTS[i], assignedSP[i]);
        }
        builder.equipment(items);
        IAlgorithm.Result result = ((IAlgorithm) algorithm).run(builder.build());
        bh.consume(result);
    }

    /**
     * Build incremental equip-step arrays for {@code numPerms} seeded random
     * permutations of the given items. Result indexed as {@code out[perm][step]}
     * where step k contains items 0..k of permutation {@code perm}.
     */
    public static IEquipment[][][] buildEquipPermutations(IEquipment[] items, long seed, int numPerms) {
        int n = items.length;
        Random rng = new Random(seed);
        IEquipment[][][] out = new IEquipment[numPerms][][];

        for (int p = 0; p < numPerms; p++) {
            int[] order = new int[n];
            for (int i = 0; i < n; i++) order[i] = i;
            for (int i = n - 1; i > 0; i--) {
                int j = rng.nextInt(i + 1);
                int tmp = order[i]; order[i] = order[j]; order[j] = tmp;
            }

            out[p] = new IEquipment[n][];
            for (int step = 0; step < n; step++) {
                IEquipment[] stepItems = new IEquipment[step + 1];
                for (int k = 0; k <= step; k++) {
                    IEquipment src = items[order[k]];
                    stepItems[k] = (src instanceof SyntheticEquipment se)
                        ? new SyntheticEquipment(se.requirements().clone(), se.bonuses().clone(), se.type())
                        : src;
                }
                out[p][step] = stepItems;
            }
        }
        return out;
    }

    /**
     * Run one full equip-sequence workload (all permutations, all steps).
     *
     * @param clearCache if true, cache is cleared between permutations
     */
    public static void runEquipSequence(IAlgorithm<?> algorithm,
                                        Supplier<IPlayerBuilder> builderSupplier,
                                        IEquipment[][][] permSteps,
                                        int[] assignedSP,
                                        boolean needsClone,
                                        boolean clearCache,
                                        Blackhole bh) {
        for (IEquipment[][] steps : permSteps) {
            if (clearCache) algorithm.clearCache();
            for (IEquipment[] stepItems : steps) {
                IEquipment[] items = needsClone ? deepClone(stepItems) : stepItems;
                check(algorithm, builderSupplier, items, assignedSP, bh);
            }
        }
    }

    /**
     * Build an array of incremental SP allocations from {@code [0,0,0,0,0]}
     * to {@code targetSP}, adding 1 point per step in round-robin order.
     */
    public static int[][] buildSpIncrements(int[] targetSP) {
        int total = 0;
        for (int v : targetSP) total += v;

        int[][] steps = new int[total][];
        int[] current = new int[SKILL_POINTS.length];
        int idx = 0;

        while (idx < total) {
            for (int attr = 0; attr < SKILL_POINTS.length && idx < total; attr++) {
                if (current[attr] < targetSP[attr]) {
                    current[attr]++;
                    steps[idx] = current.clone();
                    idx++;
                }
            }
        }
        return steps;
    }

    /**
     * Run one full SP-change workload: check() at every incremental SP step.
     */
    public static void runSpChange(IAlgorithm<?> algorithm,
                                   Supplier<IPlayerBuilder> builderSupplier,
                                   IEquipment[] items,
                                   int[][] spSteps,
                                   boolean needsClone,
                                   boolean clearCache,
                                   Blackhole bh) {
        if (clearCache) algorithm.clearCache();
        for (int[] sp : spSteps) {
            IEquipment[] runItems = needsClone ? deepClone(items) : items;
            check(algorithm, builderSupplier, runItems, sp, bh);
        }
    }

    /**
     * Run one weapon-swap: a single check() with the full build.
     */
    public static void runWeaponSwap(IAlgorithm<?> algorithm,
                                     Supplier<IPlayerBuilder> builderSupplier,
                                     IEquipment[] items,
                                     int[] assignedSP,
                                     boolean needsClone,
                                     boolean clearCache,
                                     Blackhole bh) {
        if (clearCache) algorithm.clearCache();
        IEquipment[] runItems = needsClone ? deepClone(items) : items;
        check(algorithm, builderSupplier, runItems, assignedSP, bh);
    }
}
