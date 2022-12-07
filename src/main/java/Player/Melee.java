package Player ;

import Weapons.Weapon;
import inventory.Item;

import java.util.ArrayList;

public class Melee extends Player {

    public int Strength;

    public Weapon weapon;

    public int Armour;


    public Melee(String name, int health, ArrayList<Item> inventory, int level, int strength, Weapon weapon, int armour) {
        super(name, health, inventory, level);
        Strength = strength;
        this.weapon = weapon;
        Armour = armour;
    }

    public int getStrength() {
        return Strength;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getArmour() {
        return Armour;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
