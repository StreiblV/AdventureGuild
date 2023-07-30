package at.rylicx.adventureguild;

import at.rylicx.adventureguild.constant.Archetypes;
import at.rylicx.adventureguild.constant.Helper;
import at.rylicx.adventureguild.constant.Races;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {

    private Connection connection;
    private final Helper helper = new Helper();

    public DatabaseManager(){
    }

    public void fillGuildWithPersonsFromDB(AdventureGuild guild) {
        connectToDatabase();
        List<Person> persons = getPersonsFromDB();
        for (Person person : persons) {
            guild.addPerson(person);
        }
        cleanUp();
    }

    private List<Person> getPersonsFromDB(){
        List<Person> persons = new ArrayList<>();

        String sqlQuery = "SELECT * FROM persons";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()) {
                int id = resultSet.getInt("idperson");
                String firstname = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");
                int level = resultSet.getInt("level");
                Archetypes archetype = helper.getArchetype(resultSet.getInt("archetype"));
                Races race = helper.getRaces(resultSet.getInt("race"));

                persons.add(new Person(id, firstname, lastname, level, archetype, race));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return persons;
    }

    private void connectToDatabase() {
        String url = "jdbc:mysql://localhost:3308/guild";
        String user = "root";
        String password = "Guild0Root1";

        try {
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void cleanUp(){
        try {
            this.connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
