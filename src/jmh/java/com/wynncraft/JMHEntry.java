package com.wynncraft;

import com.wynncraft.benchmarks.BuildSpec;
import com.wynncraft.benchmarks.FullEquipBenchmark;
import com.wynncraft.benchmarks.OneByOneBenchmark;
import com.wynncraft.benchmarks.ServerSimBenchmark;
import com.wynncraft.core.SyntheticEquipment;
import com.wynncraft.core.interfaces.IEquipment;
import com.wynncraft.core.interfaces.IPlayer;
import com.wynncraft.core.interfaces.IPlayerBuilder;
import com.wynncraft.testdata.SyntheticCases;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.CommandLineOptionException;
import org.openjdk.jmh.runner.options.ChainedOptionsBuilder;
import org.openjdk.jmh.runner.options.CommandLineOptions;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import static com.wynncraft.enums.Equipment.*;

public final class JMHEntry {

    /**
     * The 9 full-build (8-item) synthetic cases — used as the workload pool by
     * benchmarks that cycle through builds at runtime (e.g. {@link ServerSimBenchmark}).
     */
    public static final Set<String> SYNTHETIC_FULL_BUILD_IDS = Set.of(
        "case8_fullBuild_8items",
        "case9_dexIntAgiBuild",
        "case10_intAgiHeavyMageBuild",
        "case11_strDexDefWarriorBuild",
        "case12_strStackingBuildWithNegativeAgi",
        "case13_intAgiMageBuildWithMoontowersLargeNegatives",
        "case14_strIntMeleeBuild",
        "case16_strStackingWithCascadingBonuses",
        "case18_multiStatAllEquip"
    );

    private static final Map<String, BuildSpec> BUILD_REGISTRY = new LinkedHashMap<>();
    static {
        // ── Hand-written canonical builds ────────────────────────────────
        // SP indices: STRENGTH=0, DEXTERITY=1, INTELLIGENCE=2, DEFENCE=3, AGILITY=4

        // Complete player build (weapon, armour, tomes); all requirements met.
        register("complete_best_case", new BuildSpec(
            new IEquipment[] {
                SPRING,
                APHOTIC, TIME_RIFT, TAO,
                MOONTOWER, XEBEC, DIAMOND_HYDRO_BRACELET,
                MOON_POOL_CIRCLET, YANG,
                MASTERMINDS_TOME_OF_ALLEGIANCE_3,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III
            },
            new int[] { 60, 0, 60, 0, 80 }
        ));

        // Complete player build with no SP allocated; almost nothing should pass.
        register("complete_worst_case", new BuildSpec(
            new IEquipment[] {
                SPRING,
                APHOTIC, TIME_RIFT, TAO,
                MOONTOWER, XEBEC, DIAMOND_HYDRO_BRACELET,
                MOON_POOL_CIRCLET, YANG,
                MASTERMINDS_TOME_OF_ALLEGIANCE_3,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III
            },
            new int[] { 0, 0, 0, 0, 0 }
        ));

        // Builds adapted from Sugo's forum thread.
        register("warrior_convergence", new BuildSpec(
            new IEquipment[] {
                CONVERGENCE,
                CAESURA, DELIRIUM, CHAMPIONS_VALIANCE,
                SYMPHONIE_FANTASTIQUE, LODESTONE, LODESTONE,
                PROWESS, METAMORPHOSIS,
                MASTERMINDS_TOME_OF_ALLEGIANCE_3,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III
            },
            new int[] { 41, 57, 41, 61, 0 }
        ));

        register("warrior_ascendancy", new BuildSpec(
            new IEquipment[] {
                ASCENDANCY,
                XIUHTECUHTLI, FIDELIUS, EDEN_BLESSED_GUARDS,
                BOREAL, CISTERN_CIRCLET, CISTERN_CIRCLET,
                BREAKTHROUGH, AMBIVALENCE,
                MASTERMINDS_TOME_OF_ALLEGIANCE_3,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III
            },
            new int[] { 0, 0, 65, 75, 55 }
        ));

        register("shaman_resonance", new BuildSpec(
            new IEquipment[] {
                RESONANCE,
                PISCES, DROWN, CHAMPIONS_VALIANCE,
                CRUSADE_SABATONS, OLIVE, OLIVE,
                PROWESS, SIMULACRUM,
                MASTERMINDS_TOME_OF_ALLEGIANCE_3,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III
            },
            new int[] { 56, 37, 46, 61, 0 }
        ));

        register("assassin_vengeance", new BuildSpec(
            new IEquipment[] {
                VENGEANCE,
                OBSIDIAN_FRAMED_HELMET, TAURUS, BABEL,
                DAWNBREAK, BEATDOWN, BEATDOWN,
                ETERNAL_TOIL, BLASTCRYSTAL_CHAIN,
                MASTERMINDS_TOME_OF_ALLEGIANCE_3,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III, VOLTAIC_TOME_OF_COMBAT_MASTERY_III,
                VOLTAIC_TOME_OF_COMBAT_MASTERY_III
            },
            new int[] { 81, 65, 0, 56, 0 }
        ));

        // ── Auto-registered synthetic cases ──────────────────────────────
        // Every full-build synthetic test case is exposed under its case name
        // so benchmarks can address it the same way as hand-written builds.
        for (var entry : SyntheticCases.ALL.entrySet()) {
            String id = entry.getKey();
            SyntheticCases.TestCase tc = entry.getValue();
            register(id, new BuildSpec(cloneEquipment(tc.items()), tc.assignedSkillpoints().clone()));
        }
    }

    private JMHEntry() { }

    public static void main(String[] args) throws CommandLineOptionException, RunnerException {
        CommandLineOptions cli = new CommandLineOptions(args);
        ChainedOptionsBuilder builder = new OptionsBuilder().parent(cli);

        // Only seed our default include list if the CLI didn't pass one.
        // Otherwise our includes union with the CLI's, defeating filtering.
        if (cli.getIncludes().isEmpty()) {
            builder.include(FullEquipBenchmark.class.getName());
            builder.include(OneByOneBenchmark.class.getName());
            builder.include(ServerSimBenchmark.class.getName());
        }

        // Same for the algorithm parameter: defer to CLI when provided.
        if (!cli.getParameter("algorithm").hasValue()) {
            String[] algorithmNames = AlgorithmRegistry.registry()
                .stream()
                .map(AlgorithmRegistry.Entry::name)
                .toArray(String[]::new);
            builder.param("algorithm", algorithmNames);
        }

        new Runner(builder.build()).run();
    }

    /**
     * Materialize a player for the named build using the given algorithm entry's
     * player-builder factory.
     */
    public static IPlayer build(String id, AlgorithmRegistry.Entry entry) {
        BuildSpec spec = BUILD_REGISTRY.get(id);
        if (spec == null) {
            throw new IllegalArgumentException("Unknown build id: " + id);
        }
        @SuppressWarnings({"rawtypes", "unchecked"})
        IPlayerBuilder builder = entry.builder();
        spec.apply(builder);
        return (IPlayer) builder.build();
    }

    /** Look up a registered build spec by id (read-only access). */
    public static BuildSpec spec(String id) {
        BuildSpec spec = BUILD_REGISTRY.get(id);
        if (spec == null) {
            throw new IllegalArgumentException("Unknown build id: " + id);
        }
        return spec;
    }

    /** Read-only view of all registered builds. */
    public static Map<String, BuildSpec> registry() {
        return Collections.unmodifiableMap(BUILD_REGISTRY);
    }

    /**
     * Register a new build that benchmarks can address by id.
     */
    public static void register(String id, BuildSpec spec) {
        BUILD_REGISTRY.put(id, spec);
    }

    private static IEquipment[] cloneEquipment(SyntheticEquipment[] src) {
        IEquipment[] out = new IEquipment[src.length];
        for (int i = 0; i < src.length; i++) {
            SyntheticEquipment e = src[i];
            out[i] = new SyntheticEquipment(e.requirements().clone(), e.bonuses().clone(), e.type());
        }
        return out;
    }

}
