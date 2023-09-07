package test;

import at.rylicx.adventureguild.constant.Archetypes;
import at.rylicx.adventureguild.constant.Races;
import at.rylicx.adventureguild.constant.Helper;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelperTest {
    Helper helper = new Helper();
    @Test
    public void checkIntToArchetype_None() {
        assertEquals(helper.getArchetype(0), Archetypes.NONE);
    }
    @Test
    public void checkIntToArchetype_Barbarian() {
        assertEquals(helper.getArchetype(1), Archetypes.BARBARIAN);
    }
    @Test
    public void checkIntToArchetype_Bard() {
        assertEquals(helper.getArchetype(2), Archetypes.BARD);
    }
    @Test
    public void checkIntToArchetype_Cleric() {
        assertEquals(helper.getArchetype(3), Archetypes.CLERIC);
    }
    @Test
    public void checkIntToArchetype_Druid() {
        assertEquals(helper.getArchetype(4), Archetypes.DRUID);
    }
    @Test
    public void checkIntToArchetype_Fighter() {
        assertEquals(helper.getArchetype(5), Archetypes.FIGHTER);
    }
    @Test
    public void checkIntToArchetype_Monk() {
        assertEquals(helper.getArchetype(6), Archetypes.MONK);
    }
    @Test
    public void checkIntToArchetype_Paladin() {
        assertEquals(helper.getArchetype(7), Archetypes.PALADIN);
    }
    @Test
    public void checkIntToArchetype_Ranger() {
        assertEquals(helper.getArchetype(8), Archetypes.RANGER);
    }
    @Test
    public void checkIntToArchetype_Rogue() {
        assertEquals(helper.getArchetype(9), Archetypes.ROGUE);
    }
    @Test
    public void checkIntToArchetype_Sorcerer() {
        assertEquals(helper.getArchetype(10), Archetypes.SORCERER);
    }
    @Test
    public void checkIntToArchetype_Warlock() {
        assertEquals(helper.getArchetype(11), Archetypes.WARLOCK);
    }
    @Test
    public void checkIntToArchetype_Wizard() {
        assertEquals(helper.getArchetype(12), Archetypes.WIZARD);
    }
    @Test
    public void checkIntToArchetype_Overfloat() {
        assertEquals(helper.getArchetype(13), Archetypes.NONE);
    }
    @Test
    public void checkIntToArchetype_Negative() {
        assertEquals(helper.getArchetype(-1), Archetypes.NONE);
    }

    @Test
    public void checkArchetypeToInt_None() {
        assertEquals(helper.getArchetype(Archetypes.NONE), 0);
    }
    @Test
    public void checkArchetypeToInt_Barbarian() {
        assertEquals(helper.getArchetype(Archetypes.BARBARIAN), 1);
    }
    @Test
    public void checkArchetypeToInt_Bard() {
        assertEquals(helper.getArchetype(Archetypes.BARD), 2);
    }
    @Test
    public void checkArchetypeToInt_Cleric() {
        assertEquals(helper.getArchetype(Archetypes.CLERIC), 3);
    }
    @Test
    public void checkArchetypeToInt_Druid() {
        assertEquals(helper.getArchetype(Archetypes.DRUID), 4);
    }
    @Test
    public void checkArchetypeToInt_Fighter() {
        assertEquals(helper.getArchetype(Archetypes.FIGHTER), 5);
    }
    @Test
    public void checkArchetypeToInt_Monk() {
        assertEquals(helper.getArchetype(Archetypes.MONK), 6);
    }
    @Test
    public void checkArchetypeToInt_Paladin() {
        assertEquals(helper.getArchetype(Archetypes.PALADIN), 7);
    }
    @Test
    public void checkArchetypeToInt_Ranger() {
        assertEquals(helper.getArchetype(Archetypes.RANGER), 8);
    }
    @Test
    public void checkArchetypeToInt_Rogue() {
        assertEquals(helper.getArchetype(Archetypes.ROGUE), 9);
    }
    @Test
    public void checkArchetypeToInt_Sorcerer() {
        assertEquals(helper.getArchetype(Archetypes.SORCERER), 10);
    }
    @Test
    public void checkArchetypeToInt_Warlock() {
        assertEquals(helper.getArchetype(Archetypes.WARLOCK), 11);
    }
    @Test
    public void checkArchetypeToInt_Wizard() {
        assertEquals(helper.getArchetype(Archetypes.WIZARD), 12);
    }

    @Test
    public void checkIntToRace_None() {
        assertEquals(helper.getRaces(0), Races.NONE);
    }
    @Test
    public void checkIntToRace_Dragonborn() {
        assertEquals(helper.getRaces(1), Races.DRAGONBORN);
    }
    @Test
    public void checkIntToRace_Dwarf() {
        assertEquals(helper.getRaces(2), Races.DWARF);
    }
    @Test
    public void checkIntToRace_Elf() {
        assertEquals(helper.getRaces(3), Races.ELF);
    }
    @Test
    public void checkIntToRace_Gnome() {
        assertEquals(helper.getRaces(4), Races.GNOME);
    }
    @Test
    public void checkIntToRace_Halfelf() {
        assertEquals(helper.getRaces(5), Races.HALFELF);
    }
    @Test
    public void checkIntToRace_Halfing() {
        assertEquals(helper.getRaces(6), Races.HALFING);
    }
    @Test
    public void checkIntToRace_Halforc() {
        assertEquals(helper.getRaces(7), Races.HALFORC);
    }
    @Test
    public void checkIntToRace_Human() {
        assertEquals(helper.getRaces(8), Races.HUMAN);
    }
    @Test
    public void checkIntToRace_Tiefling() {
        assertEquals(helper.getRaces(9), Races.TIEFLING);
    }
    @Test
    public void checkIntToRace_Overfloat() {
        assertEquals(helper.getRaces(10), Races.NONE);
    }
    @Test
    public void checkIntToRace_Negative() {
        assertEquals(helper.getRaces(-1), Races.NONE);
    }

    @Test
    public void checkRaceToInt_None() {
        assertEquals(helper.getRaces(Races.NONE), 0);
    }
    @Test
    public void checkRaceToInt_Dragonborn() {
        assertEquals(helper.getRaces(Races.DRAGONBORN), 1);
    }
    @Test
    public void checkRaceToInt_Dwarf() {
        assertEquals(helper.getRaces(Races.DWARF), 2);
    }
    @Test
    public void checkRaceToInt_Elf() {
        assertEquals(helper.getRaces(Races.ELF), 3);
    }
    @Test
    public void checkRaceToInt_Gnome() {
        assertEquals(helper.getRaces(Races.GNOME), 4);
    }
    @Test
    public void checkRaceToInt_Halfelf() {
        assertEquals(helper.getRaces(Races.HALFELF), 5);
    }
    @Test
    public void checkRaceToInt_Halfling() {
        assertEquals(helper.getRaces(Races.HALFING), 6);
    }
    @Test
    public void checkRaceToInt_Halforc() {
        assertEquals(helper.getRaces(Races.HALFORC), 7);
    }
    @Test
    public void checkRaceToInt_Human() {
        assertEquals(helper.getRaces(Races.HUMAN), 8);
    }
    @Test
    public void checkRaceToInt_Tiefling() {
        assertEquals(helper.getRaces(Races.TIEFLING), 9);
    }
}