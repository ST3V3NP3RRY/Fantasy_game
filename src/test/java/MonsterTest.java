import inventory.Item;
import monster.Monster;
import org.junit.Before;
import org.junit.Test;
import player.Melee;
import weapons.Weapon;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MonsterTest {

    Monster monster;

    Melee melee;

    Item item;

    Weapon weapon;

    @Before
    public void before() {
        monster = new Monster("Balrog", 300, 40, 20);
        item = new Item("the light of Elendil");
        ArrayList inventory = new ArrayList<>();
        inventory.add(item);
        weapon = new Weapon("Andúril", 40);
        melee = new Melee("Aragon", 150, inventory, 1, 150, weapon, 100);

    }

    @Test
    public void monsterHasName() {
        assertEquals("Balrog", monster.getName());
    }

    @Test
    public void monsterHasHealth() {
        assertEquals(300, monster.getHealth());
    }

    @Test
    public void monsterHealthDecreasesWhenAttacked() {
        assertEquals(260, monster.takeDamage(weapon.getDamage()));
    }

    @Test
    public void monsterHasAttackStrength() {
        assertEquals(40, monster.getAttackStrength());
    }

    @Test
    public void monsterHasDefence() {
        assertEquals(20, monster.getDefence());
    }
}
