package com.wynncraft.benchmarks;

import com.wynncraft.AlgorithmRegistry;
import com.wynncraft.JMHEntry;
import com.wynncraft.core.interfaces.IAlgorithm;
import com.wynncraft.core.interfaces.IEquipment;
import com.wynncraft.core.interfaces.IPlayerBuilder;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * Server-side load simulator. Per benchmark invocation:
 *   • {@value NUM_EQUIP_SEQUENCES} equip sequences
 *     (each = {@value NUM_PERMUTATIONS} seeded permutations, items added one-by-one)
 *   • {@value NUM_SP_CHANGES} SP-change sequences (1 SP at a time, zero → full allocation)
 *   • {@value NUM_WEAPON_SWAPS} weapon swaps (single full-build {@code run()} per swap)
 *
 * Builds are picked from {@link JMHEntry#SYNTHETIC_FULL_BUILD_IDS} via seeded RNG
 * ({@code BASE_SEED ^ runIndex}) so runs are deterministic. {@code clearCache()} is
 * called once at trial start; the cache then persists across the whole simulation.
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 1, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@State(Scope.Thread)
public class ServerSimBenchmark {

    private static final int NUM_EQUIP_SEQUENCES = 10;
    private static final int NUM_PERMUTATIONS = 8;
    private static final int NUM_SP_CHANGES = 10;
    private static final int NUM_WEAPON_SWAPS = 4000;
    private static final long BASE_SEED = 0xCAFE_BABEL;

    @Param("__ignore__")
    public String algorithm;

    @Param({ "0", "1", "2", "3", "4" })
    public int runIndex;

    private IAlgorithm<?> _algorithm;
    private Supplier<IPlayerBuilder> _builderSupplier;

    private IEquipment[][][][] equipPermSteps;
    private int[][] equipAssignedSP;

    private IEquipment[][] spChangeItems;
    private int[][][] spChangeSteps;

    private IEquipment[][] swapItems;
    private int[][] swapAssignedSP;

    @Setup(Level.Trial)
    public void prepare() {
        AlgorithmRegistry.Entry entry = AlgorithmRegistry.registry()
            .stream()
            .filter(e -> e.name().equals(algorithm))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Unknown algorithm: " + algorithm));

        _algorithm = entry.algorithm();
        _builderSupplier = entry::builder;

        List<String> pool = new ArrayList<>(JMHEntry.SYNTHETIC_FULL_BUILD_IDS);
        Random rng = new Random(BASE_SEED ^ runIndex);

        equipPermSteps = new IEquipment[NUM_EQUIP_SEQUENCES][][][];
        equipAssignedSP = new int[NUM_EQUIP_SEQUENCES][];
        for (int i = 0; i < NUM_EQUIP_SEQUENCES; i++) {
            BuildSpec spec = JMHEntry.spec(pool.get(rng.nextInt(pool.size())));
            equipAssignedSP[i] = spec.assignedSkillpoints();
            equipPermSteps[i] = BenchOps.buildEquipPermutations(spec.equipment(), rng.nextLong(), NUM_PERMUTATIONS);
        }

        spChangeItems = new IEquipment[NUM_SP_CHANGES][];
        spChangeSteps = new int[NUM_SP_CHANGES][][];
        for (int i = 0; i < NUM_SP_CHANGES; i++) {
            BuildSpec spec = JMHEntry.spec(pool.get(rng.nextInt(pool.size())));
            spChangeItems[i] = spec.equipment();
            spChangeSteps[i] = BenchOps.buildSpIncrements(spec.assignedSkillpoints());
        }

        swapItems = new IEquipment[NUM_WEAPON_SWAPS][];
        swapAssignedSP = new int[NUM_WEAPON_SWAPS][];
        for (int i = 0; i < NUM_WEAPON_SWAPS; i++) {
            BuildSpec spec = JMHEntry.spec(pool.get(rng.nextInt(pool.size())));
            swapItems[i] = spec.equipment();
            swapAssignedSP[i] = spec.assignedSkillpoints();
        }
    }

    @Benchmark
    public void server_sim(Blackhole bh) {
        _algorithm.clearCache();

        for (int i = 0; i < NUM_EQUIP_SEQUENCES; i++) {
            BenchOps.runEquipSequence(_algorithm, _builderSupplier, equipPermSteps[i],
                equipAssignedSP[i], false, bh);
        }
        for (int i = 0; i < NUM_SP_CHANGES; i++) {
            BenchOps.runSpChange(_algorithm, _builderSupplier, spChangeItems[i],
                spChangeSteps[i], false, bh);
        }
        for (int i = 0; i < NUM_WEAPON_SWAPS; i++) {
            BenchOps.runWeaponSwap(_algorithm, _builderSupplier, swapItems[i],
                swapAssignedSP[i], false, bh);
        }
    }
}
