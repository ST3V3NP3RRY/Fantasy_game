package weapons;

public enum SpellType {
    KINESIS("Kinesis", 20),
    LIGHTNING_STRIKE("Lightning Strike", 35),
    SWORD_OF_POWER("Sword Of Power", 40);

    private final String spellName;
    private final int spellStrength;

    SpellType(String spellName, int spellstrength) {
        this.spellName = spellName;
        this.spellStrength = spellstrength;
    }

    public String getSpellName() {
        return spellName;
    }

    public int getSpellStrength() {
        return spellStrength;
    }
}
