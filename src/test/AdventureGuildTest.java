package test;

import at.rylicx.adventureguild.AdventureGuild;
import at.rylicx.adventureguild.Person;
import at.rylicx.adventureguild.constant.Archetypes;
import at.rylicx.adventureguild.constant.Races;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class AdventureGuildTest {

    AdventureGuild guild = new AdventureGuild("Dwarf Gang");

    @Test
    public void checkName(){
        assertEquals(guild.getName(), "Dwarf Gang");
    }

    @Test
    public void getPersonList(){
        Person lucy = new Person(1, "Lucy", "Hiking", 4, Archetypes.CLERIC, Races.HALFING);
        Person max = new Person(2, "Max", "Lightfoot", 3, Archetypes.FIGHTER, Races.DWARF);
        Person moris = new Person(3, "Moris", "Redwing", 5, Archetypes.WARLOCK, Races.DRAGONBORN);

        List<Person> persons = new ArrayList<>();
        persons.add(lucy);
        persons.add(max);
        persons.add(moris);

        guild.addPerson(lucy);
        guild.addPerson(max);
        guild.addPerson(moris);

        assertEquals(guild.getPersons(), persons);
    }

    @Test
    public void getEmptyPersonList() {
        assertEquals(guild.getPersons(), new ArrayList<>());
    }
}
