package player;

import Weapons.Weapon;
import inventory.Item;

import java.util.ArrayList;

public class Melee extends Player {

    public int strength;

    public Weapon weapon;

    public int armour;

    public Melee(String name, int health, ArrayList<Item> inventory, int level, int strength, Weapon weapon, int armour) {
        super(name, health, inventory, level);
        this.strength = strength;
        this.weapon = weapon;
        this.armour = armour;
    }

    public int getStrength() {
        return strength;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getArmour() {
        return armour;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
