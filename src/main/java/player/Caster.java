package player;

import behaviours.IAttack;
import behaviours.IDefend;
import inventory.Item;
import weapons.Spell;
import weapons.Weapon;

import java.util.ArrayList;

public class Caster extends Player implements IAttack, IDefend {

    private Weapon weapon;

    private ArrayList<Spell> spells;

    public Caster(String name, int health, ArrayList<Item> inventory, int level, Weapon weapon, ArrayList<Spell> spells) {
        super(name, health, inventory, level);
        this.weapon = weapon;
        this.spells = spells;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public void attack(IDefend defender) {
        defender.takeDamage(this.weapon.getDamage());
    }
    public int takeDamage(int damage) {
        return health -= damage;
    }
    public boolean isAlive() {
        return this.health >= 0 ? true : false;
    }
}
