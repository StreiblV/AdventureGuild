package at.rylicx.adventureguild.constant;

public enum Races {
    NONE("Undefined"),
    DRAGONBORN("Dragonborn"),
    DWARF("Dwarf"),
    ELF("Elf"),
    GNOME("Gnome"),
    HALFELF("Half-Elf"),
    HALFING("Halfling"),
    HALFORC("Half-Orc"),
    HUMAN("Human"),
    TIEFLING("Tiefling");

    private final String displayName;

    Races(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}