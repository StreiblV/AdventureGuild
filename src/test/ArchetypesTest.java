package test;

import at.rylicx.adventureguild.constant.Archetypes;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArchetypesTest {
    @Test
    public void getNONEArchetype() {
        assertEquals(Archetypes.NONE.getDisplayName(),"Undefined");
    }
    @Test
    public void getBARBARIANArchetype() {
        assertEquals(Archetypes.BARBARIAN.getDisplayName(),"Barbarian");
    }
    @Test
    public void getBARDArchetype() {
        assertEquals(Archetypes.BARD.getDisplayName(),"Bard");
    }
    @Test
    public void getCLERICArchetype() {
        assertEquals(Archetypes.CLERIC.getDisplayName(),"Cleric");
    }
    @Test
    public void getDRUIDArchetype() {
        assertEquals(Archetypes.DRUID.getDisplayName(),"Druid");
    }
    @Test
    public void getFIGHTERArchetype() {
        assertEquals(Archetypes.FIGHTER.getDisplayName(),"Fighter");
    }
    @Test
    public void getMONKArchetype() {
        assertEquals(Archetypes.MONK.getDisplayName(),"Monk");
    }
    @Test
    public void getPALADINArchetype() {
        assertEquals(Archetypes.PALADIN.getDisplayName(),"Paladin");
    }
    @Test
    public void getRANGERArchetype() {
        assertEquals(Archetypes.RANGER.getDisplayName(),"Ranger");
    }
    @Test
    public void getROGUEArchetype() {
        assertEquals(Archetypes.ROGUE.getDisplayName(),"Rogue");
    }
    @Test
    public void getSORCERERArchetype() {
        assertEquals(Archetypes.SORCERER.getDisplayName(),"Sorcerer");
    }
    @Test
    public void getWARLOCKArchetype() {
        assertEquals(Archetypes.WARLOCK.getDisplayName(),"Warlock");
    }
    @Test
    public void getWizardArchetype() {
        assertEquals(Archetypes.Wizard.getDisplayName(),"Wizard");
    }
}
