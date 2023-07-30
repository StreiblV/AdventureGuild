package test;

import at.rylicx.adventureguild.Person;
import at.rylicx.adventureguild.constant.Archetypes;
import at.rylicx.adventureguild.constant.Races;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    Person person = new Person(1, "Heinz", "Forster", 2, Archetypes.DRUID, Races.DWARF);

    @Test
    public void checkId() {
        assertEquals(person.getId(), 1);
    }
    @Test
    public void checkFirstname() {
        assertEquals(person.getFirstname(), "Heinz");
    }
    @Test
    public void checkLastname() {
        assertEquals(person.getLastname(), "Forster");
    }
    @Test
    public void checkLevel() {
        assertEquals(person.getLevel(), 2);
    }
    @Test
    public void checkArchetype() {
        assertEquals(person.getArchetype(), "Druid");
    }
    @Test
    public void checkRace() {
        assertEquals(person.getRace(), "Dwarf");
    }
    @Test
    public void updateId() {
        Person p = new Person(1, "Zyrka", "Whylir", 5, Archetypes.CLERIC, Races.HALFELF);
        p.setId(5);
        assertEquals(p.getId(), 5);
    }
    @Test
    public void updateFirstname() {
        Person p = new Person(1, "Zyrka", "Whylir", 5, Archetypes.CLERIC, Races.HALFELF);
        p.setFirstname("Zyrika");
        assertEquals(p.getFirstname(), "Zyrika");
    }
    @Test
    public void updateLastname() {
        Person p = new Person(1, "Zyrka", "Whylir", 5, Archetypes.CLERIC, Races.HALFELF);
        p.setLastname("Wy'lirh");
        assertEquals(p.getLastname(), "Wy'lirh");
    }
    @Test
    public void updateLevel() {
        Person p = new Person(1, "Zyrka", "Whylir", 5, Archetypes.CLERIC, Races.HALFELF);
        p.setLevel(p.getLevel()+1);
        assertEquals(p.getLevel(), 6);
    }
    @Test
    public void updateArchetype() {
        Person p = new Person(1, "Zyrka", "Whylir", 5, Archetypes.CLERIC, Races.HALFELF);
        p.setArchetype(Archetypes.PALADIN);
        assertEquals(p.getArchetype(), "Paladin");
    }
    @Test
    public void updateRace() {
        Person p = new Person(1, "Zyrka", "Whylir", 5, Archetypes.CLERIC, Races.HALFELF);
        p.setRace(Races.ELF);
        assertEquals(p.getRace(), "Elf");
    }
}