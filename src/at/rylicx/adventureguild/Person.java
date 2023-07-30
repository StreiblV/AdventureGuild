package at.rylicx.adventureguild;

import at.rylicx.adventureguild.constant.Archetypes;
import at.rylicx.adventureguild.constant.Races;

public class Person {
    private int id;
    private String firstname;
    private String lastname;
    private int level;
    private Archetypes archetype;
    private Races race;

    public Person(int id, String firstname, String lastname, int level, Archetypes archetype, Races race)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.level = level;
        this.archetype = archetype;
        this.race = race;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public String getArchetype() {
        return archetype.getDisplayName();
    }
    public void setArchetype(Archetypes archetype) {
        this.archetype = archetype;
    }

    public String getRace() {
        return race.getDisplayName();
    }
    public void setRace(Races race) {
        this.race = race;
    }
}
