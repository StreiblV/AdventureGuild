import at.rylicx.adventureguild.*;

public class Controller {

    private final AdventureGuild guild;
    private final DatabaseManager db;

    public Controller(){
        this.db = new DatabaseManager();
        this.guild = new AdventureGuild("Dragon Slayers");

        this.db.fillGuildWithPersonsFromDB(this.guild);

        //TODO: Add View
    }
}