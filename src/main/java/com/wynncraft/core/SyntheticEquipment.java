package com.wynncraft.core;

import com.wynncraft.core.interfaces.IEquipment;
import com.wynncraft.core.interfaces.IPlayer;
import com.wynncraft.enums.EquipmentType;
import com.wynncraft.enums.SkillPoint;

import java.util.Arrays;

/**
 * In-memory {@link IEquipment} for synthetic test cases that have no
 * real-item analog. Stores raw requirement/bonus arrays in
 * {@link SkillPoint} ordinal order.
 */
public final class SyntheticEquipment implements IEquipment {

    private static final SkillPoint[] SKILL_POINTS = SkillPoint.values();

    private final int[] requirements;
    private final int[] bonuses;
    private final EquipmentType type;
    private final boolean hasNegativeBonus;

    public SyntheticEquipment(int[] requirements, int[] bonuses) {
        this(requirements, bonuses, EquipmentType.ARMOUR);
    }

    public SyntheticEquipment(int[] requirements, int[] bonuses, EquipmentType type) {
        if (requirements.length != SKILL_POINTS.length) {
            throw new IllegalArgumentException("requirements must have length " + SKILL_POINTS.length);
        }
        if (bonuses.length != SKILL_POINTS.length) {
            throw new IllegalArgumentException("bonuses must have length " + SKILL_POINTS.length);
        }
        this.requirements = requirements;
        this.bonuses = bonuses;
        this.type = type;
        boolean negative = false;
        for (int b : bonuses) {
            if (b < 0) { negative = true; break; }
        }
        this.hasNegativeBonus = negative;
    }

    @Override
    public EquipmentType type() {
        return type;
    }

    @Override
    public int[] requirements() {
        return requirements;
    }

    @Override
    public int[] bonuses() {
        return bonuses;
    }

    @Override
    public boolean hasNegativeBonus() {
        return hasNegativeBonus;
    }

    @Override
    public boolean canEquip(IPlayer player) {
        for (int i = 0; i < SKILL_POINTS.length; i++) {
            if (requirements[i] != 0 && player.total(SKILL_POINTS[i]) < requirements[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "SyntheticEquipment{reqs=" + Arrays.toString(requirements)
            + ", bonuses=" + Arrays.toString(bonuses) + "}";
    }
}
