package com.wynncraft.benchmarks;

import com.wynncraft.core.interfaces.IEquipment;
import com.wynncraft.core.interfaces.IPlayerBuilder;
import com.wynncraft.enums.SkillPoint;

/**
 * Structured description of a player build for benchmarks.
 *
 * Replaces the opaque {@code Consumer<IPlayerBuilder>} pattern: benchmarks that
 * need only to materialize a player use {@link #apply(IPlayerBuilder)}, while
 * benchmarks that need to manipulate items or skill points individually
 * (sequence permutations, incremental SP allocation) read {@link #equipment()}
 * and {@link #assignedSkillpoints()} directly.
 *
 * @param equipment full list of equipment to install
 * @param assignedSkillpoints assigned SP indexed by {@link SkillPoint#ordinal()}
 *                            (length must equal {@code SkillPoint.values().length})
 */
public record BuildSpec(IEquipment[] equipment, int[] assignedSkillpoints) {

    private static final SkillPoint[] SKILL_POINTS = SkillPoint.values();

    public BuildSpec {
        if (assignedSkillpoints.length != SKILL_POINTS.length) {
            throw new IllegalArgumentException(
                "assignedSkillpoints must have length " + SKILL_POINTS.length
                + " (one per SkillPoint), got " + assignedSkillpoints.length);
        }
    }

    /**
     * Apply this spec to a fresh builder: allocate skill points, then install
     * equipment. Equivalent to the consumer-style registration upstream uses.
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void apply(IPlayerBuilder builder) {
        for (int i = 0; i < SKILL_POINTS.length; i++) {
            int amount = assignedSkillpoints[i];
            if (amount != 0) {
                builder.allocate(SKILL_POINTS[i], amount);
            }
        }
        builder.equipment(equipment);
    }
}
