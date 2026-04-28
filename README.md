## 🏆 Skill Point Algorithm Bounty
Wynncraft is seeking an **optimized skill point allocation algorithm** capable of efficiently validating and maximizing equipment combinations under strict performance constraints.

A bounty reward of **up to 100 in-game shares** will be granted for a successful solution.</br>
Exceptional implementations may qualify for a higher reward.

## 📌 Objective
Design an algorithm that:

- Accepts a given set of equipment items
- Evaluates viable combinations
- Returns the **combination containing the highest number of valid items**

## ⚙️ Requirements
Your solution must be written in Java 21 so we can evaluate it in a real scenario.

### Functional Constraints
- Each piece of equipment has **skill point requirements** that must be validated.
- Equipment may add or **subtract skill points** when equipped.
- Skill points from equipment must **not recursively enable other equipment**; no bootstrapping between items is allowed.

### Validation Rules
- A piece of equipment is considered **valid** only if all of its requirements are met at the time of evaluation.
- The algorithm must determine validity across the full combination; **the order of items should not matter**.
- In the event of a tie, the combination with the **highest total** given skill points should win.

## 🧑‍💻 Implementation
This repository provides a base structure similar to our real usage, including testing and benchmarking.

### Instructions
- Fork this repository and implement your changes under the `com.wynncraft.algorithms` package.
  - If necessary for your optimization, you may implement a custom version of `IPlayer`; otherwise, use `WynnPlayer`.
  - Every piece of equipment has an associated type. You may use these types to further optimize your algorithm as you see fit.
- Ensure your algorithm is registered under `AlgorithmRegistry`.
- Open a Pull Request to this repository with your new algorithm so we can evaluate it.
- Once we validate your PR, it will be merged and considered a valid entry in the competition.
  - If any further modification to your algorithm is necessary, you may submit another Pull Request.
  - Make sure the new version is in a separate class and registered again, even if it is only a one-line change.
- You may submit multiple algorithms as you see fit. We will choose the best one for our usage case.

### Implementing `IAlgorithm`

`IAlgorithm` has two optional hooks beyond `run()` — `clearCache()` and `mutatesEquipment()`. They look harmless but are load-bearing for benchmarking and correctness. If your algorithm uses cross-call caching or mutates inputs, you **must** declare it.

#### `clearCache()`

Override this if your algorithm holds any state across `run()` calls — memoization tables, mask caches, last-seen-player references, anything. Benchmarks invoke `clearCache()` to establish a cold baseline, and tests rely on it to isolate cases. If your cache survives a `clearCache()` call, results will be inconsistent and you may pass tests only because of stale state from a previous case.

- Reset every field your algorithm reads on a subsequent `run()`.
- It must be safe to call at any time, including before the first `run()`.
- Pure / stateless algorithms can leave the default no-op.

#### `mutatesEquipment()`

Return `true` if `run()` writes to anything reachable from the equipment array — `IEquipment` instances, their `requirements()`/`bonuses()` arrays, or the array itself. Benchmarks check this flag and deep-clone the input array per call so your mutations can't leak across invocations. If you mutate but return `false`, you will corrupt later iterations and other algorithms in the same run.

There is one inviolable rule that `mutatesEquipment` does **not** protect you from: never write to a real `Equipment` enum's `requirements()` or `bonuses()` arrays. Those are JVM-global singletons shared by every algorithm and every test case; the benchmark's deep-clone only freshens `SyntheticEquipment` instances and passes enum singletons through by reference. If you need scratch space, allocate your own arrays.

#### Quick checklist

| Your algorithm… | Override `clearCache()`? | Override `mutatesEquipment()` to `true`? |
|---|---|---|
| Pure, no state across calls | No | No |
| Caches results / masks / sorted views | **Yes** | No |
| Mutates the input equipment array or `SyntheticEquipment` fields | No | **Yes** |
| Both | **Yes** | **Yes** |

## 🧪 Combinatory Test Cases
This repository contains a few combinatory test cases for equipment.
🏆 We are also offering rewards for newly introduced test cases that break current algorithms.

### Instructions
- Fork this repository and implement your new test case in `CombinationTests`.
- Open a Pull Request to this repository with your new test case.
- If your test case breaks current algorithms in ways that are not similar to already existing tests, you will be eligible for an untradable share reward depending on the case.

### Running Test Cases
```bash
./gradlew test
```

or to execute a specific algorithm only

```bash
./gradlew test -Palgorithm='Your Algorithm Name'
```

---

## Local Workflow Notes

### Test filtering

Tag-based selection (`@Tag` on each test class):

| Class | Tag | Cases |
|---|---|---|
| `CombinationTests` | `upstream` | Hand-written upstream baseline |
| `SyntheticCombinationTests` | `curated` | Synthetic curated cases (`SyntheticEquipment`) |
| `GeneratedCombinationTests` | `generated` | Auto-generated cases |

```bash
./gradlew test -Pcases=upstream                 # one tag
./gradlew test -Pcases=curated,generated        # multiple tags
./gradlew test -Palgo='WynnSolver V1'           # algorithm filter (alias for -Palgorithm=)
./gradlew test -Palgo='WynnSolver V1' -Pcases=curated
```

### Benchmark structure

JMH lives in `src/jmh/java/com/wynncraft/`:
- `JMHEntry` — main entry; holds `BUILD_REGISTRY: Map<String, BuildSpec>`. Registers hand-written builds (the 6 sugo-thread cases) and auto-registers all `SyntheticCases.ALL` entries by name.
- `benchmarks/BuildSpec` — record of `(IEquipment[] equipment, int[] assignedSkillpoints)`. Benchmarks needing only to materialize a player call `spec.apply(builder)`; benchmarks manipulating items or SP individually read the fields directly.
- `benchmarks/BenchOps` — shared helpers (equip permutations, SP increments, sequence runners).
- `benchmarks/FullEquipBenchmark` — single full-build `run()` per invocation.
- `benchmarks/OneByOneBenchmark` — single-item incremental equip.
- `benchmarks/ServerSimBenchmark` — primary mixed workload: 10 equip sequences (8 perms each) + 10 SP-change sequences + 4000 weapon swaps. Builds drawn from the 9 full-build synthetic cases via seeded RNG.
  - ServerSim is the most representative benchmark for performance (as of writing this). - For full evaluation, run it with more time per measurement to allow for fair JIT compilation.

```bash
./gradlew jmh                                                  # all benchmarks, all algorithms
./gradlew jmh -Pbm=ServerSimBenchmark                          # one benchmark class (regex match)
./gradlew jmh -Palgo='WynnSolver V1'                           # one algorithm
./gradlew jmh -Palgo='WynnSolver V1,Pruned Mask V2'            # multiple algorithms
./gradlew jmh -Pbm=ServerSimBenchmark -Palgo='WynnSolver V1'   # combine
./gradlew jmh -PjmhArgs="-i 1 -wi 1 -f 1"                      # raw JMH CLI passthrough
```

Adding a new build:
```java
JMHEntry.register("my_build", new BuildSpec(
    new IEquipment[] { /* items */ },
    new int[] { str, dex, int_, def, agi }
));
```
