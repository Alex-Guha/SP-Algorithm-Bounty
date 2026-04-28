package com.wynncraft;

import com.wynncraft.combination.CombinationTest;
import com.wynncraft.core.interfaces.IAlgorithm;
import com.wynncraft.core.interfaces.IEquipment;
import com.wynncraft.core.interfaces.IPlayerBuilder;
import com.wynncraft.enums.Equipment;
import com.wynncraft.enums.SkillPoint;
import org.junit.jupiter.api.Tag;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Auto-generated from WynnSkillpointBench/GeneratedTestCases.java by
 * scripts/convert_generated_cases.py. Do not edit by hand; re-run the
 * script if the source cases change.
 */
@Tag("generated")
class GeneratedCombinationTests {

    @CombinationTest
    public void sugo001(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 73);
        builder.allocate(SkillPoint.INTELLIGENCE, 59);
        builder.allocate(SkillPoint.DEFENCE, 70);
        Equipment[] items = new Equipment[] {
            Equipment.TITANOMACHIA,
            Equipment.EMPYREAL_EMBERPLATE,
            Equipment.CHAIN_RULE,
            Equipment.CRUSADE_SABATONS,
            Equipment.MOON_POOL_CIRCLET,
            Equipment.INTENSITY,
            Equipment.DRAGONS_EYE_BRACELET,
            Equipment.SIMULACRUM
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo002(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 34);
        builder.allocate(SkillPoint.DEXTERITY, 42);
        builder.allocate(SkillPoint.INTELLIGENCE, 34);
        builder.allocate(SkillPoint.DEFENCE, 34);
        builder.allocate(SkillPoint.AGILITY, 57);
        Equipment[] items = new Equipment[] {
            Equipment.LOGISTICS,
            Equipment.ETIOLATION,
            Equipment.RAINBOW_SANCTUARY,
            Equipment.VIRTUOSO,
            Equipment.PHOTON,
            Equipment.PHOTON,
            Equipment.PROWESS,
            Equipment.RENDA_LANGIT
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo003(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 57);
        builder.allocate(SkillPoint.DEXTERITY, 37);
        builder.allocate(SkillPoint.INTELLIGENCE, 27);
        builder.allocate(SkillPoint.DEFENCE, 11);
        builder.allocate(SkillPoint.AGILITY, 57);
        Equipment[] items = new Equipment[] {
            Equipment.LOGISTICS,
            Equipment.DISCOVERER,
            Equipment.RINGLETS,
            Equipment.REVENANT,
            Equipment.PHOTON,
            Equipment.PHOTON,
            Equipment.PROWESS,
            Equipment.DIAMOND_FUSION_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo004(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 42);
        builder.allocate(SkillPoint.DEXTERITY, 92);
        builder.allocate(SkillPoint.INTELLIGENCE, 56);
        Equipment[] items = new Equipment[] {
            Equipment.CAESURA,
            Equipment.DELIRIUM,
            Equipment.CHAOS_WOVEN_GREAVES,
            Equipment.STARDEW,
            Equipment.HYPOXIA,
            Equipment.YANG,
            Equipment.DIAMOND_STATIC_BRACELET,
            Equipment.LIGHTNING_FLASH
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo005(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 41);
        builder.allocate(SkillPoint.DEXTERITY, 63);
        builder.allocate(SkillPoint.INTELLIGENCE, 85);
        Equipment[] items = new Equipment[] {
            Equipment.CAESURA,
            Equipment.TIME_RIFT,
            Equipment.ASPHYXIA,
            Equipment.STARDEW,
            Equipment.FINESSE,
            Equipment.FINESSE,
            Equipment.PROWESS,
            Equipment.AMANUENSIS
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo006(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 40);
        builder.allocate(SkillPoint.DEXTERITY, 65);
        builder.allocate(SkillPoint.INTELLIGENCE, 81);
        Equipment[] items = new Equipment[] {
            Equipment.DWINDLED_KNOWLEDGE,
            Equipment.TIME_RIFT,
            Equipment.CHAOS_WOVEN_GREAVES,
            Equipment.STARDEW,
            Equipment.YANG,
            Equipment.YANG,
            Equipment.DIAMOND_HYDRO_BRACELET,
            Equipment.XEBEC
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo007(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.DEXTERITY, 61);
        builder.allocate(SkillPoint.INTELLIGENCE, 102);
        Equipment[] items = new Equipment[] {
            Equipment.GNOSSIS,
            Equipment.TIME_RIFT,
            Equipment.ALEPH_NULL,
            Equipment.STARDEW,
            Equipment.YANG,
            Equipment.MOON_POOL_CIRCLET,
            Equipment.PROWESS,
            Equipment.DIAMOND_HYDRO_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo008(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 32);
        builder.allocate(SkillPoint.INTELLIGENCE, 76);
        builder.allocate(SkillPoint.DEFENCE, 72);
        Equipment[] items = new Equipment[] {
            Equipment.AQUAMARINE,
            Equipment.TIME_RIFT,
            Equipment.VAWARD,
            Equipment.RESURGENCE,
            Equipment.OLD_KEEPERS_RING,
            Equipment.YANG,
            Equipment.VINDICATOR,
            Equipment.GIGABYTE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo009(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 56);
        builder.allocate(SkillPoint.DEFENCE, 55);
        builder.allocate(SkillPoint.AGILITY, 65);
        Equipment[] items = new Equipment[] {
            Equipment.TITANOMACHIA,
            Equipment.FIREBIRD,
            Equipment.FIRE_SANCTUARY,
            Equipment.BOREAL,
            Equipment.DOWNFALL,
            Equipment.BYGG,
            Equipment.DUPLIBLAZE,
            Equipment.STROBELIGHT
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo010(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 65);
        builder.allocate(SkillPoint.AGILITY, 61);
        Equipment[] items = new Equipment[] {
            Equipment.DUNE_STORM,
            Equipment.CONDUIT_OF_SPIRIT,
            Equipment.SAGITTARIUS,
            Equipment.REVENANT,
            Equipment.DIAMOND_STEAM_RING,
            Equipment.INTENSITY,
            Equipment.VORTEX_BRACER,
            Equipment.NECKLACE_OF_A_THOUSAND_STORMS
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo011(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 85);
        builder.allocate(SkillPoint.DEXTERITY, 30);
        builder.allocate(SkillPoint.INTELLIGENCE, 18);
        builder.allocate(SkillPoint.AGILITY, 30);
        Equipment[] items = new Equipment[] {
            Equipment.THE_SIRENS_CALL,
            Equipment.GALES_FREEDOM,
            Equipment.CHAIN_RULE,
            Equipment.EARTHSKY_ECLIPSE,
            Equipment.OLIVE,
            Equipment.OLIVE,
            Equipment.THANOS_BANNER,
            Equipment.RENDA_LANGIT
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo012(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 72);
        builder.allocate(SkillPoint.DEXTERITY, 74);
        builder.allocate(SkillPoint.AGILITY, 55);
        Equipment[] items = new Equipment[] {
            Equipment.NEPHILIM,
            Equipment.TWILIGHT_GILDED_CLOAK,
            Equipment.PHYSALIS,
            Equipment.WARCHIEF,
            Equipment.BREEZEHANDS,
            Equipment.DIAMOND_FIBER_RING,
            Equipment.DIAMOND_FIBER_BRACELET,
            Equipment.DIAMOND_STATIC_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo013(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 38);
        builder.allocate(SkillPoint.DEXTERITY, 76);
        builder.allocate(SkillPoint.DEFENCE, 50);
        Equipment[] items = new Equipment[] {
            Equipment.BRAINWASH,
            Equipment.BETE_NOIRE,
            Equipment.DOOMSDAY_OMEN,
            Equipment.MANTLEWALKERS,
            Equipment.DOWNFALL,
            Equipment.DOWNFALL,
            Equipment.ENMITY,
            Equipment.CONTRAST
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo014(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 70);
        builder.allocate(SkillPoint.DEXTERITY, 66);
        builder.allocate(SkillPoint.AGILITY, 58);
        Equipment[] items = new Equipment[] {
            Equipment.LUMINIFEROUS_AETHER,
            Equipment.TWILIGHT_GILDED_CLOAK,
            Equipment.LEICTREACH_MAKANI,
            Equipment.WARCHIEF,
            Equipment.BREEZEHANDS,
            Equipment.DASHER,
            Equipment.RYCARS_BRAVADO,
            Equipment.DIAMOND_STATIC_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo015(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 20);
        builder.allocate(SkillPoint.DEXTERITY, 45);
        builder.allocate(SkillPoint.AGILITY, 80);
        Equipment[] items = new Equipment[] {
            Equipment.UNRAVEL,
            Equipment.WANDERLUST,
            Equipment.SAGITTARIUS,
            Equipment.SKIDBLADNIR,
            Equipment.INTENSITY,
            Equipment.DIAMOND_STEAM_RING,
            Equipment.BUSTER_BRACER,
            Equipment.METAMORPHOSIS
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo016(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 70);
        builder.allocate(SkillPoint.INTELLIGENCE, 54);
        builder.allocate(SkillPoint.AGILITY, 80);
        Equipment[] items = new Equipment[] {
            Equipment.APHOTIC,
            Equipment.CONDUIT_OF_SPIRIT,
            Equipment.ANAEROBIC,
            Equipment.MOONTOWER,
            Equipment.DRAOI_FAIR,
            Equipment.YANG,
            Equipment.ANYAS_PENUMBRA,
            Equipment.XEBEC
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo017(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 60);
        builder.allocate(SkillPoint.INTELLIGENCE, 61);
        builder.allocate(SkillPoint.AGILITY, 80);
        Equipment[] items = new Equipment[] {
            Equipment.APHOTIC,
            Equipment.TIME_RIFT,
            Equipment.TAO,
            Equipment.MOONTOWER,
            Equipment.YANG,
            Equipment.MOON_POOL_CIRCLET,
            Equipment.DIAMOND_HYDRO_BRACELET,
            Equipment.XEBEC
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo018(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 49);
        builder.allocate(SkillPoint.INTELLIGENCE, 56);
        builder.allocate(SkillPoint.AGILITY, 80);
        Equipment[] items = new Equipment[] {
            Equipment.APHOTIC,
            Equipment.LEVIATHAN,
            Equipment.TAO,
            Equipment.MOONTOWER,
            Equipment.YANG,
            Equipment.YANG,
            Equipment.DIAMOND_HYDRO_BRACELET,
            Equipment.DIAMOND_HYDRO_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo019(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 51);
        builder.allocate(SkillPoint.DEXTERITY, 79);
        builder.allocate(SkillPoint.INTELLIGENCE, 39);
        Equipment[] items = new Equipment[] {
            Equipment.NYCHTHEMERON,
            Equipment.DELIRIUM,
            Equipment.CHAOS_WOVEN_GREAVES,
            Equipment.ELECTRO_MAGES_BOOTS,
            Equipment.PHOTON,
            Equipment.DRAOI_FAIR,
            Equipment.DIAMOND_STATIC_BRACELET,
            Equipment.METAMORPHOSIS
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo020(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 61);
        builder.allocate(SkillPoint.DEXTERITY, 54);
        builder.allocate(SkillPoint.INTELLIGENCE, 26);
        builder.allocate(SkillPoint.DEFENCE, 46);
        Equipment[] items = new Equipment[] {
            Equipment.NUCLEAR_EMESIS,
            Equipment.BETE_NOIRE,
            Equipment.TERA,
            Equipment.NETHERS_SCAR,
            Equipment.OLIVE,
            Equipment.OLIVE,
            Equipment.PROWESS,
            Equipment.SIMULACRUM
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo021(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 60);
        builder.allocate(SkillPoint.DEFENCE, 79);
        Equipment[] items = new Equipment[] {
            Equipment.NUCLEAR_EMESIS,
            Equipment.CANNONADE,
            Equipment.CHAIN_RULE,
            Equipment.CRUSADE_SABATONS,
            Equipment.DOWNFALL,
            Equipment.DOWNFALL,
            Equipment.DUPLIBLAZE,
            Equipment.SIMULACRUM
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo022(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 30);
        builder.allocate(SkillPoint.DEXTERITY, 30);
        builder.allocate(SkillPoint.INTELLIGENCE, 65);
        builder.allocate(SkillPoint.DEFENCE, 30);
        builder.allocate(SkillPoint.AGILITY, 30);
        Equipment[] items = new Equipment[] {
            Equipment.THIRD_EYE,
            Equipment.LIBRA,
            Equipment.RAINBOW_SANCTUARY,
            Equipment.MARTINGALE,
            Equipment.INTENSITY,
            Equipment.MOON_POOL_CIRCLET,
            Equipment.SUCCESSION,
            Equipment.DIAMOND_FUSION_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo023(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 47);
        builder.allocate(SkillPoint.DEXTERITY, 75);
        builder.allocate(SkillPoint.DEFENCE, 70);
        Equipment[] items = new Equipment[] {
            Equipment.BRAINWASH,
            Equipment.BETE_NOIRE,
            Equipment.ASPHYXIA,
            Equipment.CRUSADE_SABATONS,
            Equipment.INTENSITY,
            Equipment.DOWNFALL,
            Equipment.DIAMOND_STATIC_BRACELET,
            Equipment.SIMULACRUM
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo024(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 41);
        builder.allocate(SkillPoint.DEXTERITY, 48);
        builder.allocate(SkillPoint.INTELLIGENCE, 37);
        builder.allocate(SkillPoint.AGILITY, 61);
        Equipment[] items = new Equipment[] {
            Equipment.CAESURA,
            Equipment.ETIOLATION,
            Equipment.ALEPH_NULL,
            Equipment.VIRTUOSO,
            Equipment.INGRESS,
            Equipment.INGRESS,
            Equipment.PROWESS,
            Equipment.METAMORPHOSIS
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo025(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 60);
        builder.allocate(SkillPoint.DEXTERITY, 32);
        builder.allocate(SkillPoint.INTELLIGENCE, 39);
        builder.allocate(SkillPoint.AGILITY, 70);
        Equipment[] items = new Equipment[] {
            Equipment.DUNE_STORM,
            Equipment.ECHOES_OF_THE_LOST,
            Equipment.SAGITTARIUS,
            Equipment.REVENANT,
            Equipment.FINESSE,
            Equipment.FINESSE,
            Equipment.MELANCHOLIA,
            Equipment.RECKONING
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo026(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 47);
        builder.allocate(SkillPoint.DEXTERITY, 85);
        builder.allocate(SkillPoint.DEFENCE, 70);
        Equipment[] items = new Equipment[] {
            Equipment.BRAINWASH,
            Equipment.INSIGNIA,
            Equipment.ASPHYXIA,
            Equipment.CRUSADE_SABATONS,
            Equipment.DIAMOND_STATIC_RING,
            Equipment.INTENSITY,
            Equipment.DIAMOND_STATIC_BRACELET,
            Equipment.SIMULACRUM
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo027(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 45);
        builder.allocate(SkillPoint.DEXTERITY, 84);
        builder.allocate(SkillPoint.AGILITY, 55);
        Equipment[] items = new Equipment[] {
            Equipment.BRAINWASH,
            Equipment.ETIOLATION,
            Equipment.ORNATE_SHADOW_COVER,
            Equipment.WEATHERWALKERS,
            Equipment.GLOOMSTONE,
            Equipment.GLOOMSTONE,
            Equipment.DIAMOND_STATIC_BRACELET,
            Equipment.NECKLACE_OF_A_THOUSAND_STORMS
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo028(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 70);
        builder.allocate(SkillPoint.DEXTERITY, 70);
        builder.allocate(SkillPoint.INTELLIGENCE, 57);
        Equipment[] items = new Equipment[] {
            Equipment.CAESURA,
            Equipment.BETE_NOIRE,
            Equipment.ASPHYXIA,
            Equipment.STARDEW,
            Equipment.MOON_POOL_CIRCLET,
            Equipment.COLD_WAVE,
            Equipment.DIAMOND_STATIC_BRACELET,
            Equipment.LIGHTNING_FLASH
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo029(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 41);
        builder.allocate(SkillPoint.DEXTERITY, 38);
        builder.allocate(SkillPoint.INTELLIGENCE, 33);
        builder.allocate(SkillPoint.DEFENCE, 10);
        builder.allocate(SkillPoint.AGILITY, 52);
        Equipment[] items = new Equipment[] {
            Equipment.CAESURA,
            Equipment.ETIOLATION,
            Equipment.ALEPH_NULL,
            Equipment.EARTHSKY_ECLIPSE,
            Equipment.INGRESS,
            Equipment.INGRESS,
            Equipment.PROWESS,
            Equipment.DIAMOND_FUSION_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo030(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 39);
        builder.allocate(SkillPoint.INTELLIGENCE, 39);
        builder.allocate(SkillPoint.AGILITY, 99);
        Equipment[] items = new Equipment[] {
            Equipment.AQUAMARINE,
            Equipment.CONDUIT_OF_SPIRIT,
            Equipment.WINDBORNE,
            Equipment.SKIDBLADNIR,
            Equipment.DIAMOND_STEAM_RING,
            Equipment.PHOTON,
            Equipment.VORTEX_BRACER,
            Equipment.CONTRAST
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo031(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 48);
        builder.allocate(SkillPoint.INTELLIGENCE, 63);
        builder.allocate(SkillPoint.AGILITY, 77);
        Equipment[] items = new Equipment[] {
            Equipment.AQUAMARINE,
            Equipment.DISCOVERER,
            Equipment.ELDER_OAK_ROOTS,
            Equipment.MOONTOWER,
            Equipment.OLD_KEEPERS_RING,
            Equipment.COLD_WAVE,
            Equipment.PROVENANCE,
            Equipment.CONTRAST
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo032(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 60);
        builder.allocate(SkillPoint.INTELLIGENCE, 40);
        builder.allocate(SkillPoint.DEFENCE, 78);
        Equipment[] items = new Equipment[] {
            Equipment.TITANOMACHIA,
            Equipment.CANNONADE,
            Equipment.CHAIN_RULE,
            Equipment.CRUSADE_SABATONS,
            Equipment.COLD_WAVE,
            Equipment.DOWNFALL,
            Equipment.ENMITY,
            Equipment.SIMULACRUM
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo033(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 47);
        builder.allocate(SkillPoint.DEXTERITY, 70);
        builder.allocate(SkillPoint.DEFENCE, 81);
        Equipment[] items = new Equipment[] {
            Equipment.BRAINWASH,
            Equipment.CANNONADE,
            Equipment.FLUMMOX,
            Equipment.CRUSADE_SABATONS,
            Equipment.INTENSITY,
            Equipment.DOWNFALL,
            Equipment.ENMITY,
            Equipment.SIMULACRUM
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo034(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 72);
        builder.allocate(SkillPoint.DEXTERITY, 54);
        builder.allocate(SkillPoint.INTELLIGENCE, 30);
        builder.allocate(SkillPoint.AGILITY, 35);
        Equipment[] items = new Equipment[] {
            Equipment.CAESURA,
            Equipment.DELIRIUM,
            Equipment.CHAIN_RULE,
            Equipment.EARTHSKY_ECLIPSE,
            Equipment.INTENSITY,
            Equipment.COLD_WAVE,
            Equipment.MELANCHOLIA,
            Equipment.BOTTLED_THUNDERSTORM
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo035(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.DEXTERITY, 46);
        builder.allocate(SkillPoint.INTELLIGENCE, 68);
        builder.allocate(SkillPoint.DEFENCE, 46);
        Equipment[] items = new Equipment[] {
            Equipment.TRANSPLANTED_PSYCHE,
            Equipment.SOUL_SIGNAL,
            Equipment.ALEPH_NULL,
            Equipment.STARDEW,
            Equipment.YANG,
            Equipment.YANG,
            Equipment.PROWESS,
            Equipment.DIAMOND_HYDRO_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo036(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.DEXTERITY, 43);
        builder.allocate(SkillPoint.INTELLIGENCE, 86);
        builder.allocate(SkillPoint.AGILITY, 34);
        Equipment[] items = new Equipment[] {
            Equipment.CUMULONIMBUS,
            Equipment.ETIOLATION,
            Equipment.ALEPH_NULL,
            Equipment.STARDEW,
            Equipment.STRATUS,
            Equipment.STRATUS,
            Equipment.PROWESS,
            Equipment.DIAMOND_HYDRO_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo037(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 41);
        builder.allocate(SkillPoint.DEXTERITY, 96);
        builder.allocate(SkillPoint.INTELLIGENCE, 36);
        Equipment[] items = new Equipment[] {
            Equipment.CAESURA,
            Equipment.STRATOSPHERE,
            Equipment.ALEPH_NULL,
            Equipment.GALLEON,
            Equipment.OLIVE,
            Equipment.OLIVE,
            Equipment.PROWESS,
            Equipment.DIAMOND_STATIC_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo038(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 43);
        builder.allocate(SkillPoint.DEXTERITY, 51);
        builder.allocate(SkillPoint.INTELLIGENCE, 27);
        builder.allocate(SkillPoint.DEFENCE, 60);
        builder.allocate(SkillPoint.AGILITY, 1);
        Equipment[] items = new Equipment[] {
            Equipment.TRANSPLANTED_PSYCHE,
            Equipment.AZURITE,
            Equipment.ALEPH_NULL,
            Equipment.CRUSADE_SABATONS,
            Equipment.OLIVE,
            Equipment.OLIVE,
            Equipment.PROWESS,
            Equipment.UMAMI
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo039(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 101);
        builder.allocate(SkillPoint.DEXTERITY, 31);
        builder.allocate(SkillPoint.INTELLIGENCE, 21);
        builder.allocate(SkillPoint.DEFENCE, 31);
        builder.allocate(SkillPoint.AGILITY, 46);
        Equipment[] items = new Equipment[] {
            Equipment.GREATBIRD_EYRIE,
            Equipment.ETIOLATION,
            Equipment.PERCH_OF_THE_SHROUDED_SUN,
            Equipment.BOOTS_OF_BLUE_STONE,
            Equipment.OLIVE,
            Equipment.OLIVE,
            Equipment.PROWESS,
            Equipment.TENUTO
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo040(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 47);
        builder.allocate(SkillPoint.DEXTERITY, 70);
        builder.allocate(SkillPoint.DEFENCE, 79);
        Equipment[] items = new Equipment[] {
            Equipment.BRAINWASH,
            Equipment.CANNONADE,
            Equipment.FIRE_SANCTUARY,
            Equipment.CRUSADE_SABATONS,
            Equipment.INTENSITY,
            Equipment.DOWNFALL,
            Equipment.DUPLIBLAZE,
            Equipment.SIMULACRUM
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo041(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 71);
        builder.allocate(SkillPoint.DEXTERITY, 73);
        builder.allocate(SkillPoint.AGILITY, 40);
        Equipment[] items = new Equipment[] {
            Equipment.LUMINIFEROUS_AETHER,
            Equipment.TWILIGHT_GILDED_CLOAK,
            Equipment.POST_ULTIMA,
            Equipment.WARCHIEF,
            Equipment.DIAMOND_FIBER_RING,
            Equipment.DIAMOND_FIBER_RING,
            Equipment.DIAMOND_FIBER_BRACELET,
            Equipment.DIAMOND_STATIC_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo042(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.DEXTERITY, 64);
        builder.allocate(SkillPoint.INTELLIGENCE, 88);
        builder.allocate(SkillPoint.DEFENCE, 36);
        Equipment[] items = new Equipment[] {
            Equipment.ANAMNESIS,
            Equipment.SCHADENFREUDE,
            Equipment.ALEPH_NULL,
            Equipment.REPURPOSED_VESSELS,
            Equipment.YANG,
            Equipment.YANG,
            Equipment.PROWESS,
            Equipment.DIAMOND_HYDRO_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo043(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 35);
        builder.allocate(SkillPoint.DEXTERITY, 65);
        builder.allocate(SkillPoint.INTELLIGENCE, 92);
        Equipment[] items = new Equipment[] {
            Equipment.ANAMNESIS,
            Equipment.TIME_RIFT,
            Equipment.CHAOS_WOVEN_GREAVES,
            Equipment.STARDEW,
            Equipment.MOON_POOL_CIRCLET,
            Equipment.OLIVE,
            Equipment.BUSTER_BRACER,
            Equipment.DIAMOND_HYDRO_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo044(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 70);
        builder.allocate(SkillPoint.DEFENCE, 27);
        builder.allocate(SkillPoint.AGILITY, 60);
        Equipment[] items = new Equipment[] {
            Equipment.GALES_SIGHT,
            Equipment.DISCOVERER,
            Equipment.PAIN_CYCLE,
            Equipment.REVENANT,
            Equipment.INGRESS,
            Equipment.BLOODBORNE,
            Equipment.VORTEX_BRACER,
            Equipment.CONTRAST
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo045(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 57);
        builder.allocate(SkillPoint.DEXTERITY, 59);
        builder.allocate(SkillPoint.AGILITY, 60);
        Equipment[] items = new Equipment[] {
            Equipment.BRAINWASH,
            Equipment.SOARFAE,
            Equipment.SAGITTARIUS,
            Equipment.REVENANT,
            Equipment.INGRESS,
            Equipment.INGRESS,
            Equipment.VORTEX_BRACER,
            Equipment.BOTTLED_THUNDERSTORM
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo046(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 62);
        builder.allocate(SkillPoint.DEXTERITY, 70);
        builder.allocate(SkillPoint.AGILITY, 63);
        Equipment[] items = new Equipment[] {
            Equipment.BRAINWASH,
            Equipment.SOARFAE,
            Equipment.PAIN_CYCLE,
            Equipment.REVENANT,
            Equipment.INTENSITY,
            Equipment.DIAMOND_STEAM_RING,
            Equipment.VORTEX_BRACER,
            Equipment.NECKLACE_OF_A_THOUSAND_STORMS
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo047(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 55);
        builder.allocate(SkillPoint.DEFENCE, 27);
        builder.allocate(SkillPoint.AGILITY, 77);
        Equipment[] items = new Equipment[] {
            Equipment.UNRAVEL,
            Equipment.DISCOVERER,
            Equipment.SAGITTARIUS,
            Equipment.SKIDBLADNIR,
            Equipment.INGRESS,
            Equipment.BLOODBORNE,
            Equipment.DOUBLE_VISION,
            Equipment.CONTRAST
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo048(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 66);
        builder.allocate(SkillPoint.DEXTERITY, 72);
        builder.allocate(SkillPoint.AGILITY, 55);
        Equipment[] items = new Equipment[] {
            Equipment.SCARLET_VEIL,
            Equipment.TWILIGHT_GILDED_CLOAK,
            Equipment.PHYSALIS,
            Equipment.WARCHIEF,
            Equipment.BREEZEHANDS,
            Equipment.DIAMOND_FIBER_RING,
            Equipment.DIAMOND_FIBER_BRACELET,
            Equipment.RECALCITRANCE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo049(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 36);
        builder.allocate(SkillPoint.DEXTERITY, 41);
        builder.allocate(SkillPoint.INTELLIGENCE, 58);
        builder.allocate(SkillPoint.AGILITY, 31);
        Equipment[] items = new Equipment[] {
            Equipment.GNOSSIS,
            Equipment.PHANTASMAGORIA,
            Equipment.ALEPH_NULL,
            Equipment.PRO_TEMPORE,
            Equipment.DRAOI_FAIR,
            Equipment.MOON_POOL_CIRCLET,
            Equipment.PROWESS,
            Equipment.CHARM_OF_THE_STORMS
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo050(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 32);
        builder.allocate(SkillPoint.DEXTERITY, 61);
        builder.allocate(SkillPoint.INTELLIGENCE, 62);
        Equipment[] items = new Equipment[] {
            Equipment.PROSENCEPHALON,
            Equipment.UMBRAL_MAIL,
            Equipment.CHAOS_WOVEN_GREAVES,
            Equipment.STARDEW,
            Equipment.YANG,
            Equipment.PHOTON,
            Equipment.MISALIGNMENT,
            Equipment.METAMORPHOSIS
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo051(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 39);
        builder.allocate(SkillPoint.DEXTERITY, 59);
        builder.allocate(SkillPoint.INTELLIGENCE, 59);
        builder.allocate(SkillPoint.DEFENCE, 39);
        Equipment[] items = new Equipment[] {
            Equipment.PROSENCEPHALON,
            Equipment.STRATOSPHERE,
            Equipment.ENTANGLEMENT,
            Equipment.STARDEW,
            Equipment.OLIVE,
            Equipment.PHOTON,
            Equipment.DRAGONS_EYE_BRACELET,
            Equipment.CONTRAST
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo052(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 63);
        builder.allocate(SkillPoint.DEXTERITY, 58);
        builder.allocate(SkillPoint.INTELLIGENCE, 30);
        Equipment[] items = new Equipment[] {
            Equipment.NYCHTHEMERON,
            Equipment.TAURUS,
            Equipment.POST_ULTIMA,
            Equipment.BLIND_THRUST,
            Equipment.AD_TERRAM,
            Equipment.AD_TERRAM,
            Equipment.BLISSFUL_SOLACE,
            Equipment.H_209_MINIATURE_DEFIBRILLATOR
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo053(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 60);
        builder.allocate(SkillPoint.INTELLIGENCE, 60);
        builder.allocate(SkillPoint.DEFENCE, 84);
        Equipment[] items = new Equipment[] {
            Equipment.DREADNOUGHT,
            Equipment.CANNONADE,
            Equipment.OPHIUCHUS,
            Equipment.CRUSADE_SABATONS,
            Equipment.DRAOI_FAIR,
            Equipment.INTENSITY,
            Equipment.DUPLIBLAZE,
            Equipment.SIMULACRUM
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo054(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 10);
        builder.allocate(SkillPoint.INTELLIGENCE, 60);
        builder.allocate(SkillPoint.DEFENCE, 104);
        Equipment[] items = new Equipment[] {
            Equipment.DREADNOUGHT,
            Equipment.CANNONADE,
            Equipment.OPHIUCHUS,
            Equipment.MANTLEWALKERS,
            Equipment.HELLION,
            Equipment.DRAOI_FAIR,
            Equipment.DIAMOND_SOLAR_BRACELET,
            Equipment.ABRASION
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo055(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 56);
        builder.allocate(SkillPoint.DEXTERITY, 57);
        builder.allocate(SkillPoint.DEFENCE, 47);
        Equipment[] items = new Equipment[] {
            Equipment.DARKSTEEL_FULL_HELM,
            Equipment.TAURUS,
            Equipment.EARTH_BREAKER,
            Equipment.DAWNBREAK,
            Equipment.DOWNFALL,
            Equipment.DOWNFALL,
            Equipment.MOMENTUM,
            Equipment.H_209_MINIATURE_DEFIBRILLATOR
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo056(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 45);
        builder.allocate(SkillPoint.DEXTERITY, 62);
        builder.allocate(SkillPoint.INTELLIGENCE, 82);
        Equipment[] items = new Equipment[] {
            Equipment.CAESURA,
            Equipment.AQUARIUS,
            Equipment.CHAOS_WOVEN_GREAVES,
            Equipment.STARDEW,
            Equipment.AZEOTROPE,
            Equipment.AZEOTROPE,
            Equipment.MISALIGNMENT,
            Equipment.DIAMOND_HYDRO_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo057(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 37);
        builder.allocate(SkillPoint.DEXTERITY, 62);
        builder.allocate(SkillPoint.INTELLIGENCE, 92);
        Equipment[] items = new Equipment[] {
            Equipment.RESOLUTION,
            Equipment.AQUARIUS,
            Equipment.CHAOS_WOVEN_GREAVES,
            Equipment.STARDEW,
            Equipment.YANG,
            Equipment.YANG,
            Equipment.DIAMOND_HYDRO_BRACELET,
            Equipment.DIAMOND_HYDRO_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo058(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 37);
        builder.allocate(SkillPoint.DEXTERITY, 52);
        builder.allocate(SkillPoint.INTELLIGENCE, 86);
        Equipment[] items = new Equipment[] {
            Equipment.RESOLUTION,
            Equipment.SOUL_SIGNAL,
            Equipment.CHAOS_WOVEN_GREAVES,
            Equipment.STARDEW,
            Equipment.YANG,
            Equipment.YANG,
            Equipment.DIAMOND_HYDRO_BRACELET,
            Equipment.AUXETIC_CAPACITOR
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo059(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 14);
        builder.allocate(SkillPoint.DEXTERITY, 12);
        builder.allocate(SkillPoint.INTELLIGENCE, 52);
        builder.allocate(SkillPoint.DEFENCE, 12);
        builder.allocate(SkillPoint.AGILITY, 51);
        Equipment[] items = new Equipment[] {
            Equipment.SPECTRUM,
            Equipment.DISCOVERER,
            Equipment.VAWARD,
            Equipment.CAPRICORN,
            Equipment.SUMMA,
            Equipment.OLD_KEEPERS_RING,
            Equipment.VINDICATOR,
            Equipment.DIAMOND_FUSION_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo060(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 40);
        builder.allocate(SkillPoint.DEXTERITY, 93);
        builder.allocate(SkillPoint.INTELLIGENCE, 55);
        Equipment[] items = new Equipment[] {
            Equipment.NEURON,
            Equipment.STRATOSPHERE,
            Equipment.CHAOS_WOVEN_GREAVES,
            Equipment.PRO_TEMPORE,
            Equipment.DIAMOND_STATIC_RING,
            Equipment.LODESTONE,
            Equipment.DIAMOND_STATIC_BRACELET,
            Equipment.ABRASION
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo061(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 83);
        builder.allocate(SkillPoint.DEXTERITY, 57);
        builder.allocate(SkillPoint.INTELLIGENCE, 57);
        Equipment[] items = new Equipment[] {
            Equipment.CAESURA,
            Equipment.LEVIATHAN,
            Equipment.CHAIN_RULE,
            Equipment.CONDENSATION,
            Equipment.AZEOTROPE,
            Equipment.AZEOTROPE,
            Equipment.MISALIGNMENT,
            Equipment.XEBEC
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo062(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 46);
        builder.allocate(SkillPoint.DEXTERITY, 42);
        builder.allocate(SkillPoint.INTELLIGENCE, 45);
        builder.allocate(SkillPoint.AGILITY, 63);
        Equipment[] items = new Equipment[] {
            Equipment.UNRAVEL,
            Equipment.PHANTASMAGORIA,
            Equipment.SAGITTARIUS,
            Equipment.STEAMJET_WALKERS,
            Equipment.SUMMA,
            Equipment.SUMMA,
            Equipment.BREAKTHROUGH,
            Equipment.EYES_ON_ALL
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo063(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 48);
        builder.allocate(SkillPoint.DEXTERITY, 31);
        builder.allocate(SkillPoint.INTELLIGENCE, 47);
        builder.allocate(SkillPoint.AGILITY, 35);
        Equipment[] items = new Equipment[] {
            Equipment.CUMULONIMBUS,
            Equipment.PHANTASMAGORIA,
            Equipment.APOPHENIA,
            Equipment.STEAMJET_WALKERS,
            Equipment.INTENSITY,
            Equipment.FINESSE,
            Equipment.BREAKTHROUGH,
            Equipment.BOTTLED_THUNDERSTORM
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo064(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 29);
        builder.allocate(SkillPoint.DEXTERITY, 50);
        builder.allocate(SkillPoint.INTELLIGENCE, 68);
        builder.allocate(SkillPoint.DEFENCE, 27);
        builder.allocate(SkillPoint.AGILITY, 29);
        Equipment[] items = new Equipment[] {
            Equipment.SPLINTERED_DAWN,
            Equipment.LIBRA,
            Equipment.RAINBOW_SANCTUARY,
            Equipment.STARDEW,
            Equipment.DRAOI_FAIR,
            Equipment.SUMMA,
            Equipment.PROWESS,
            Equipment.XEBEC
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo065(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 25);
        builder.allocate(SkillPoint.DEXTERITY, 25);
        builder.allocate(SkillPoint.INTELLIGENCE, 65);
        builder.allocate(SkillPoint.DEFENCE, 25);
        builder.allocate(SkillPoint.AGILITY, 25);
        Equipment[] items = new Equipment[] {
            Equipment.SPECTRUM,
            Equipment.LIBRA,
            Equipment.RAINBOW_SANCTUARY,
            Equipment.MARTINGALE,
            Equipment.MOON_POOL_CIRCLET,
            Equipment.PHOTON,
            Equipment.SUCCESSION,
            Equipment.DIAMOND_FUSION_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo066(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 29);
        builder.allocate(SkillPoint.DEXTERITY, 50);
        builder.allocate(SkillPoint.INTELLIGENCE, 68);
        builder.allocate(SkillPoint.DEFENCE, 27);
        builder.allocate(SkillPoint.AGILITY, 29);
        Equipment[] items = new Equipment[] {
            Equipment.SPLINTERED_DAWN,
            Equipment.LIBRA,
            Equipment.RAINBOW_SANCTUARY,
            Equipment.STARDEW,
            Equipment.DRAOI_FAIR,
            Equipment.SUMMA,
            Equipment.PROWESS,
            Equipment.XEBEC
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo067(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 29);
        builder.allocate(SkillPoint.DEXTERITY, 50);
        builder.allocate(SkillPoint.INTELLIGENCE, 63);
        builder.allocate(SkillPoint.DEFENCE, 27);
        builder.allocate(SkillPoint.AGILITY, 29);
        Equipment[] items = new Equipment[] {
            Equipment.SPLINTERED_DAWN,
            Equipment.LIBRA,
            Equipment.RAINBOW_SANCTUARY,
            Equipment.STARDEW,
            Equipment.AZEOTROPE,
            Equipment.SUMMA,
            Equipment.DRAGONS_EYE_BRACELET,
            Equipment.DIAMOND_FUSION_NECKLACE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo068(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 40);
        builder.allocate(SkillPoint.DEXTERITY, 50);
        builder.allocate(SkillPoint.INTELLIGENCE, 50);
        builder.allocate(SkillPoint.DEFENCE, 36);
        Equipment[] items = new Equipment[] {
            Equipment.GUILLOTINE,
            Equipment.SOUL_SIGNAL,
            Equipment.ALEPH_NULL,
            Equipment.FRENZIED_MOCKERY,
            Equipment.AZEOTROPE,
            Equipment.AZEOTROPE,
            Equipment.VENERATION,
            Equipment.TENUTO
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo069(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 77);
        builder.allocate(SkillPoint.DEXTERITY, 67);
        builder.allocate(SkillPoint.DEFENCE, 40);
        Equipment[] items = new Equipment[] {
            Equipment.OBSIDIAN_FRAMED_HELMET,
            Equipment.TAURUS,
            Equipment.WRITHING_GROWTH,
            Equipment.BLIND_THRUST,
            Equipment.AD_TERRAM,
            Equipment.AD_TERRAM,
            Equipment.MOMENTUM,
            Equipment.H_209_MINIATURE_DEFIBRILLATOR
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo070(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 61);
        builder.allocate(SkillPoint.DEXTERITY, 54);
        builder.allocate(SkillPoint.INTELLIGENCE, 26);
        builder.allocate(SkillPoint.DEFENCE, 46);
        Equipment[] items = new Equipment[] {
            Equipment.NUCLEAR_EMESIS,
            Equipment.BETE_NOIRE,
            Equipment.TERA,
            Equipment.NETHERS_SCAR,
            Equipment.OLIVE,
            Equipment.SUPPRESSION,
            Equipment.PROWESS,
            Equipment.SIMULACRUM
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo071(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 45);
        builder.allocate(SkillPoint.DEXTERITY, 50);
        builder.allocate(SkillPoint.DEFENCE, 41);
        builder.allocate(SkillPoint.AGILITY, 49);
        Equipment[] items = new Equipment[] {
            Equipment.KINDLED_ORCHID,
            Equipment.CALIDADE_MAIL,
            Equipment.RUNEBOUND_CHAINS,
            Equipment.NETHERS_SCAR,
            Equipment.FLASHFIRE_KNUCKLE,
            Equipment.BREEZEHANDS,
            Equipment.FLASHFIRE_GAUNTLET,
            Equipment.RECALCITRANCE
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo072(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 75);
        builder.allocate(SkillPoint.DEXTERITY, 57);
        builder.allocate(SkillPoint.DEFENCE, 45);
        Equipment[] items = new Equipment[] {
            Equipment.DARKSTEEL_FULL_HELM,
            Equipment.TAURUS,
            Equipment.WRITHING_GROWTH,
            Equipment.BLIND_THRUST,
            Equipment.LOST_SECONDS,
            Equipment.LOST_SECONDS,
            Equipment.MOMENTUM,
            Equipment.H_209_MINIATURE_DEFIBRILLATOR
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo073(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 58);
        builder.allocate(SkillPoint.AGILITY, 74);
        Equipment[] items = new Equipment[] {
            Equipment.DUNE_STORM,
            Equipment.CONDUIT_OF_SPIRIT,
            Equipment.SAGITTARIUS,
            Equipment.SKIDBLADNIR,
            Equipment.PHOTON,
            Equipment.PHOTON,
            Equipment.VORTEX_BRACER,
            Equipment.RENDA_LANGIT
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo074(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 30);
        builder.allocate(SkillPoint.DEXTERITY, 30);
        builder.allocate(SkillPoint.INTELLIGENCE, 44);
        builder.allocate(SkillPoint.AGILITY, 58);
        Equipment[] items = new Equipment[] {
            Equipment.FILTER_MASK,
            Equipment.GALES_FREEDOM,
            Equipment.ALEPH_NULL,
            Equipment.SKIDBLADNIR,
            Equipment.YANG,
            Equipment.INTENSITY,
            Equipment.SYNAPSE,
            Equipment.RENDA_LANGIT
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo075(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 41);
        builder.allocate(SkillPoint.DEXTERITY, 84);
        builder.allocate(SkillPoint.DEFENCE, 64);
        Equipment[] items = new Equipment[] {
            Equipment.BRAINWASH,
            Equipment.INSIGNIA,
            Equipment.ASPHYXIA,
            Equipment.ORNATE_SHADOW_CLOUD,
            Equipment.INTENSITY,
            Equipment.PHOTON,
            Equipment.DIAMOND_STATIC_BRACELET,
            Equipment.SIMULACRUM
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo076(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 40);
        builder.allocate(SkillPoint.DEXTERITY, 54);
        builder.allocate(SkillPoint.DEFENCE, 60);
        builder.allocate(SkillPoint.AGILITY, 40);
        Equipment[] items = new Equipment[] {
            Equipment.OSSUARY,
            Equipment.FUTURE_SHOCK_PLATING,
            Equipment.RUNEBOUND_CHAINS,
            Equipment.THUNDEROUS_STEP,
            Equipment.AGAVE,
            Equipment.MICROCHIP,
            Equipment.MELANCHOLIA,
            Equipment.PULSE_STOPPER
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo077(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.AGILITY, 80);
        Equipment[] items = new Equipment[] {
            Equipment.OSSUARY,
            Equipment.ECHOES_OF_THE_LOST,
            Equipment.ORNATE_SHADOW_COVER,
            Equipment.SKIDBLADNIR,
            Equipment.RASK,
            Equipment.RASK,
            Equipment.VORTEX_BRACER,
            Equipment.CONTRAST
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

    @CombinationTest
    public void sugo078(IAlgorithm algorithm, IPlayerBuilder builder) {
        builder.allocate(SkillPoint.STRENGTH, 55);
        builder.allocate(SkillPoint.DEXTERITY, 34);
        builder.allocate(SkillPoint.DEFENCE, 34);
        builder.allocate(SkillPoint.AGILITY, 75);
        Equipment[] items = new Equipment[] {
            Equipment.UNRAVEL,
            Equipment.WANDERLUST,
            Equipment.RUNEBOUND_CHAINS,
            Equipment.SKIDBLADNIR,
            Equipment.INGRESS,
            Equipment.INGRESS,
            Equipment.VORTEX_BRACER,
            Equipment.BOTTLED_THUNDERSTORM
        };
        builder.equipment(items);
        IAlgorithm.Result result = algorithm.run(builder.build());
        List<IEquipment> expectedValid = new ArrayList<>();
        List<IEquipment> expectedInvalid = new ArrayList<>();
        expectedValid.add(items[0]);
        expectedValid.add(items[1]);
        expectedValid.add(items[2]);
        expectedValid.add(items[3]);
        expectedValid.add(items[4]);
        expectedValid.add(items[5]);
        expectedValid.add(items[6]);
        expectedValid.add(items[7]);
        assertThat(result.valid()).containsExactlyInAnyOrderElementsOf(expectedValid);
        assertThat(result.invalid()).containsExactlyInAnyOrderElementsOf(expectedInvalid);
    }

}
