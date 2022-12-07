import monster.Monster;
import player.Melee;
import weapons.Weapon;
import inventory.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MeleeTest {

   Melee melee;

    Item item;

    Weapon weapon;

    Monster monster;

    @Before
    public void before() {
        item = new Item("horn");
        ArrayList inventory = new ArrayList<>();
        inventory.add(item);
        weapon = new Weapon("hammer", 20);
        melee = new Melee("Gimli", 100, inventory, 1, 150, weapon, 100);
        monster = new Monster("Cave Troll", 150, 25, 20);
    }

    @Test
    public void playerHasName() {
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
    public void playerLevelHasLevel() {
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

    @Test
    public void playerCanAttack() {
        melee.attack(monster);
        assertEquals(130, monster.getHealth());
    }

    @Test
    public void playerCanTakeDamage() {
        melee.takeDamage(monster.getAttackStrength());
        assertEquals(75, melee.getHealth());
    }

    @Test
    public void playerIsAlive_false() {
        melee.takeDamage(monster.getAttackStrength());
        assertEquals(true, melee.isAlive());
    }
    @Test
    public void playerIsAlive_true() {
        Monster sauron = new Monster("Sauron", 200, 200, 200);
        melee.takeDamage(sauron.getAttackStrength());
        assertEquals(false, melee.isAlive());
    }
}
