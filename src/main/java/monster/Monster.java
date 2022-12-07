package monster;

import behaviours.IAttack;
import behaviours.IDefend;

public class Monster implements IAttack, IDefend {

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


    public void attack(IDefend defender) {
        defender.takeDamage(this.attackStrength);
    }

    public int takeDamage(int damage) {
        return this.health -= damage;
    }
}
