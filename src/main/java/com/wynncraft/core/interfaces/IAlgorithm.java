package com.wynncraft.core.interfaces;

import java.util.List;

public interface IAlgorithm<T extends IPlayer> {

    /**
     * Runs and calculates the best equipment combination
     * for the provided player.
     *
     * When marking an equipment as valid make sure to run
     * {@link IPlayer#modify(int[], boolean)} to apply their
     * bonuses accordingly
     *
     * @param player the player to run for
     * @return the resulting item combination
     */
    Result run(T player);

    /**
     * Clears any cross-call caches the algorithm maintains so the next
     * {@link #run(IPlayer)} starts cold. No-op by default; overridden by
     * algorithms that memoize state across invocations (e.g. mask caches).
     */
    default void clearCache() { }

    /**
     * Whether {@link #run(IPlayer)} mutates the equipment array passed in via
     * the player. Algorithms that modify shared equipment state must return
     * true so benchmarks defensively clone inputs across calls; pure algorithms
     * leave the default {@code false} and benefit from input-identity caching.
     */
    default boolean mutatesEquipment() { return false; }

    /**
     * Holds the final combinatory result of the algorithm
     *
     * @param valid the equipment that should be marked as valid
     * @param invalid the equipment that should be marked as invalid
     */
    record Result(List<IEquipment> valid, List<IEquipment> invalid) {

    }

}
