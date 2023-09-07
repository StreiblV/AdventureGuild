package at.rylicx.adventureguild.constant;

public class Helper {

    public Archetypes getArchetype(int type) {
        return switch (type) {
            case 1 -> Archetypes.BARBARIAN;
            case 2 -> Archetypes.BARD;
            case 3 -> Archetypes.CLERIC;
            case 4 -> Archetypes.DRUID;
            case 5 -> Archetypes.FIGHTER;
            case 6 -> Archetypes.MONK;
            case 7 -> Archetypes.PALADIN;
            case 8 -> Archetypes.RANGER;
            case 9 -> Archetypes.ROGUE;
            case 10 -> Archetypes.SORCERER;
            case 11 -> Archetypes.WARLOCK;
            case 12 -> Archetypes.WIZARD;
            default -> Archetypes.NONE;
        };
    }

    public int getArchetype(Archetypes type){
        return switch (type) {
            case BARBARIAN -> 1;
            case BARD -> 2;
            case CLERIC -> 3;
            case DRUID -> 4;
            case FIGHTER -> 5;
            case MONK -> 6;
            case PALADIN -> 7;
            case RANGER -> 8;
            case ROGUE -> 9;
            case SORCERER -> 10;
            case WARLOCK -> 11;
            case WIZARD -> 12;
            default -> 0;
        };
    }

    public Races getRaces(int race) {
        return switch (race) {
            case 1 -> Races.DRAGONBORN;
            case 2 -> Races.DWARF;
            case 3 -> Races.ELF;
            case 4 -> Races.GNOME;
            case 5 -> Races.HALFELF;
            case 6 -> Races.HALFING;
            case 7 -> Races.HALFORC;
            case 8 -> Races.HUMAN;
            case 9 -> Races.TIEFLING;
            default -> Races.NONE;
        };
    }

    public int getRaces(Races race){
        return switch (race) {
            case DRAGONBORN -> 1;
            case DWARF -> 2;
            case ELF -> 3;
            case GNOME -> 4;
            case HALFELF -> 5;
            case HALFING -> 6;
            case HALFORC -> 7;
            case HUMAN -> 8;
            case TIEFLING -> 9;
            default -> 0;
        };
    }
}
