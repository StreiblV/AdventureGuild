package at.rylicx.adventureguild;

import java.util.ArrayList;
import java.util.List;

public class AdventureGuild {

    private final String name;
    private List<Person> persons;

    public AdventureGuild(String name){
        this.name = name;
        persons = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public List<Person> getPersons(){
        return persons;
    }
}
