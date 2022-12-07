package monster;

public class Monster {

    private String name;

    private int health;

    private int attackStrength;

    private int defence;

    public Monster(String name, int health, int attackStrength, int defence) {
        this.name = name;
        this.health = health;
        this.attackStrength = attackStrength;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public int getDefence() {
        return defence;
    }
}
