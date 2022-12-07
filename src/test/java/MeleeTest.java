import Weapons.Weapon;
import inventory.Item;
import org.junit.Before;
import org.junit.Test;
import player.Melee;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MeleeTest {

    Melee melee;

    Item item;

    Weapon weapon;

    @Before
    public void before() {
        item = new Item("horn");
        ArrayList inventory = new ArrayList<>();
        inventory.add(item);
        weapon =  new Weapon("Hammer", 20);
        melee = new Melee("Gimli", 100, inventory, 1, 150, weapon, 100);
    }

    @Test
    public void playerHasName(){
        assertEquals("Gimli", melee.getName());
    }

    @Test
    public void playerHasHealth() {
        assertEquals(100, melee.getHealth());
    }

    @Test
    public void playerHasItemInInventory() {
        assertEquals(1, melee.getInventory().size());
    }

    @Test
    public void playerLevelHAsLevel() {
        assertEquals(1, melee.getLevel());
    }

    @Test
    public void playerHasStrength() {
        assertEquals(150, melee.getStrength());
    }

    @Test
    public void playerHasWeapon() {
        assertEquals(weapon, melee.getWeapon());
    }

    @Test
    public void playerCanChangeWeapon() {
        Weapon axe = new Weapon("Axe", 15);
        melee.setWeapon(axe);
        assertEquals(axe, melee.getWeapon());
    }

    @Test
    public void playerHasArmour() {
        assertEquals(100, melee.getArmour());
    }
}
