package player;

import Weapons.Weapon;

public class Melee extends Player {

    public int strength;

    public Weapon weapon;

    public int armour;

    public Melee(int strength, Weapon weapon, int armour) {
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
}
