package com.wynncraft;

import com.wynncraft.combination.CombinationTest;
import com.wynncraft.core.SyntheticEquipment;
import com.wynncraft.core.interfaces.IAlgorithm;
import com.wynncraft.core.interfaces.IEquipment;
import com.wynncraft.core.interfaces.IPlayerBuilder;
import com.wynncraft.enums.SkillPoint;
import com.wynncraft.testdata.SyntheticCases;
import com.wynncraft.testdata.SyntheticCases.TestCase;
import org.junit.jupiter.api.Tag;

import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.fail;

@Tag("curated")
class SyntheticCombinationTests {

    private static final SkillPoint[] SP_ORDER = {
            SkillPoint.STRENGTH,
            SkillPoint.DEXTERITY,
            SkillPoint.INTELLIGENCE,
            SkillPoint.DEFENCE,
            SkillPoint.AGILITY,
    };

    @CombinationTest
    public void case1_optimal(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case1_optimal", algorithm, builder);
    }

    @CombinationTest
    public void case1_subopt_assign(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case1_subopt_assign", algorithm, builder);
    }

    @CombinationTest
    public void case1_tff(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case1_tff", algorithm, builder);
    }

    @CombinationTest
    public void case2_strictChain_abc(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case2_strictChain_abc", algorithm, builder);
    }

    @CombinationTest
    public void case2_strictChain_cab(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case2_strictChain_cab", algorithm, builder);
    }

    @CombinationTest
    public void case3_noRequirements(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case3_noRequirements", algorithm, builder);
    }

    @CombinationTest
    public void case4_impossibleRequirements(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case4_impossibleRequirements", algorithm, builder);
    }

    @CombinationTest
    public void case5_negativeInvalidatesPrior(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case5_negativeInvalidatesPrior", algorithm, builder);
    }

    @CombinationTest
    public void case6_exactRequirement(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case6_exactRequirement", algorithm, builder);
    }

    @CombinationTest
    public void case7_mutualDependency(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case7_mutualDependency", algorithm, builder);
    }

    @CombinationTest
    public void case8_fullBuild_8items(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case8_fullBuild_8items", algorithm, builder);
    }

    @CombinationTest
    public void case9_dexIntAgiBuild(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case9_dexIntAgiBuild", algorithm, builder);
    }

    @CombinationTest
    public void case10_intAgiHeavyMageBuild(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case10_intAgiHeavyMageBuild", algorithm, builder);
    }

    @CombinationTest
    public void case11_strDexDefWarriorBuild(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case11_strDexDefWarriorBuild", algorithm, builder);
    }

    @CombinationTest
    public void case12_strStackingBuildWithNegativeAgi(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case12_strStackingBuildWithNegativeAgi", algorithm, builder);
    }

    @CombinationTest
    public void case13_intAgiMageBuildWithMoontowersLargeNegatives(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case13_intAgiMageBuildWithMoontowersLargeNegatives", algorithm, builder);
    }

    @CombinationTest
    public void case14_strIntMeleeBuild(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case14_strIntMeleeBuild", algorithm, builder);
    }

    @CombinationTest
    public void case15_doubleDiamondHydroRings(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case15_doubleDiamondHydroRings", algorithm, builder);
    }

    @CombinationTest
    public void case15_doubleDiamondHydroRings_fail(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case15_doubleDiamondHydroRings_fail", algorithm, builder);
    }

    @CombinationTest
    public void case16_strStackingWithCascadingBonuses(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case16_strStackingWithCascadingBonuses", algorithm, builder);
    }

    @CombinationTest
    public void case17_negDefBlocksChain(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case17_negDefBlocksChain", algorithm, builder);
    }

    @CombinationTest
    public void case18_multiStatAllEquip(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case18_multiStatAllEquip", algorithm, builder);
    }

    @CombinationTest
    public void case19_dualRingsWithNegNecklace(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case19_dualRingsWithNegNecklace", algorithm, builder);
    }

    @CombinationTest
    public void case20_bothDisabledInsufficientStr(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case20_bothDisabledInsufficientStr", algorithm, builder);
    }

    @CombinationTest
    public void case21_repurposedVessels(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case21_repurposedVessels", algorithm, builder);
    }

    @CombinationTest
    public void case21_repurposedVessels_2(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case21_repurposedVessels_2", algorithm, builder);
    }

    @CombinationTest
    public void case22_double_tie(IAlgorithm algorithm, IPlayerBuilder builder) {
        runCase("case22_double_tie", algorithm, builder);
    }

    private static void runCase(String name, IAlgorithm algorithm, IPlayerBuilder builder) {
        TestCase tc = SyntheticCases.ALL.get(name);
        if (tc == null) {
            fail("Unknown synthetic test case: " + name);
            return;
        }

        int[] sp = tc.assignedSkillpoints();
        for (int i = 0; i < SP_ORDER.length; i++) {
            if (sp[i] != 0) {
                builder.allocate(SP_ORDER[i], sp[i]);
            }
        }

        SyntheticEquipment[] items = tc.items();
        builder.equipment((IEquipment[]) items);

        IAlgorithm.Result result = algorithm.run(builder.build());
        assertExpected(result, items, tc.acceptableResults());
    }

    /**
     * Passes if {@code result} matches any one of the {@code acceptable}
     * boolean masks (unordered). Each mask, paired with {@code items}, defines
     * the expected valid/invalid sets.
     */
    private static void assertExpected(IAlgorithm.Result result, SyntheticEquipment[] items, boolean[]... acceptable) {
        HashSet<IEquipment> actualValid = new HashSet<>(result.valid());
        HashSet<IEquipment> actualInvalid = new HashSet<>(result.invalid());

        for (boolean[] mask : acceptable) {
            HashSet<IEquipment> expectedValid = new HashSet<>();
            HashSet<IEquipment> expectedInvalid = new HashSet<>();
            for (int i = 0; i < items.length; i++) {
                if (mask[i]) {
                    expectedValid.add(items[i]);
                } else {
                    expectedInvalid.add(items[i]);
                }
            }

            if (expectedValid.size() == result.valid().size()
                    && expectedInvalid.size() == result.invalid().size()
                    && expectedValid.equals(actualValid)
                    && expectedInvalid.equals(actualInvalid)) {
                return;
            }
        }

        StringBuilder msg = new StringBuilder("result did not match any acceptable expected mask.\n");
        msg.append("  valid:   ").append(result.valid()).append('\n');
        msg.append("  invalid: ").append(result.invalid()).append('\n');
        msg.append("  acceptable masks:\n");
        for (boolean[] mask : acceptable) {
            msg.append("    ");
            for (boolean b : mask) {
                msg.append(b ? '1' : '0');
            }
            msg.append('\n');
        }
        fail(msg.toString());
    }
}
