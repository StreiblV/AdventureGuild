package test;

import at.rylicx.adventureguild.constant.Races;
import org.junit.Test;

import static org.junit.Assert.*;

public class RacesTest {
    @Test
    public void getNONERace() {
        assertEquals(Races.NONE.getDisplayName(),"Undefined");
    }
    @Test
    public void getDRAGONBORNRace() {
        assertEquals(Races.DRAGONBORN.getDisplayName(),"Dragonborn");
    }
    @Test
    public void getDWARFRace() {
        assertEquals(Races.DWARF.getDisplayName(),"Dwarf");
    }
    @Test
    public void getELFRace() {
        assertEquals(Races.ELF.getDisplayName(),"Elf");
    }
    @Test
    public void getGNOMERace() {
        assertEquals(Races.GNOME.getDisplayName(),"Gnome");
    }
    @Test
    public void getHALFELFRace() {
        assertEquals(Races.HALFELF.getDisplayName(),"Half-Elf");
    }
    @Test
    public void getHALFINGRace() {
        assertEquals(Races.HALFING.getDisplayName(),"Halfling");
    }
    @Test
    public void getHALFORCRace() {
        assertEquals(Races.HALFORC.getDisplayName(),"Half-Orc");
    }
    @Test
    public void getHUMANRace() {
        assertEquals(Races.HUMAN.getDisplayName(), "Human");
    }
    @Test
    public void getTIEFLINGRace() {
        assertEquals(Races.TIEFLING.getDisplayName(), "Tiefling");
    }
}