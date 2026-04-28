package com.wynncraft.benchmarks;

import com.wynncraft.AlgorithmRegistry;
import com.wynncraft.JMHEntry;
import com.wynncraft.core.interfaces.IAlgorithm;
import com.wynncraft.core.interfaces.IEquipment;
import com.wynncraft.core.interfaces.IPlayer;
import com.wynncraft.core.interfaces.IPlayerBuilder;
import com.wynncraft.enums.SkillPoint;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 100, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 5, time = 100, timeUnit = TimeUnit.MILLISECONDS)
@Fork(1)
@State(Scope.Thread)
public class FullEquipBenchmark {

    private static final SkillPoint[] SKILL_POINTS = SkillPoint.values();

    @Param("__ignore__")
    public String algorithm;

    @Param({
        "complete_best_case",
        "complete_worst_case",
        "warrior_convergence",
        "warrior_ascendancy",
        "shaman_resonance",
        "assassin_vengeance"
    })
    public String build;

    private IAlgorithm<?> _algorithm;
    private Supplier<IPlayerBuilder> _builderSupplier;
    private BuildSpec _spec;
    private boolean _needsClone;

    @Setup(value = Level.Trial)
    public void prepare() {
        // Find the correct algorithm, quite stupid but necessary since
        // JMH doesn't support proper parameters due to its structure
        AlgorithmRegistry.Entry entry = AlgorithmRegistry.registry()
            .stream()
            .filter(e -> e.name().equals(algorithm))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Unknown algorithm benchmark parameter: " + algorithm));

        _algorithm = entry.algorithm();
        _builderSupplier = entry::builder;
        _spec = JMHEntry.spec(build);
        _needsClone = _algorithm.mutatesEquipment();
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Benchmark
    public void full_equip(Blackhole blackhole) {
        // Cold cache per invocation: every algorithm starts each measurement
        // from the same baseline, regardless of whether it caches across runs.
        _algorithm.clearCache();

        // Materialize a fresh player per invocation so mutating algorithms
        // can't leak state across calls (cf. mutatesEquipment).
        IEquipment[] items = _needsClone ? BenchOps.deepClone(_spec.equipment()) : _spec.equipment();
        int[] sp = _spec.assignedSkillpoints();

        IPlayerBuilder builder = _builderSupplier.get();
        for (int i = 0; i < SKILL_POINTS.length; i++) {
            builder.allocate(SKILL_POINTS[i], sp[i]);
        }
        builder.equipment(items);
        IPlayer player = (IPlayer) builder.build();

        IAlgorithm.Result result = ((IAlgorithm) _algorithm).run(player);
        blackhole.consume(result);
    }

}
