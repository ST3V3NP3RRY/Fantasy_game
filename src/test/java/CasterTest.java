import inventory.Item;
import org.junit.Before;
import player.Caster;
import weapons.Spell;
import weapons.SpellType;
import weapons.Weapon;

import java.util.ArrayList;

public class CasterTest {

    Caster caster;

    Spell spell;

    Weapon weapon;

    Item item;

    @Before
    public void before() {
        //Sets up for spells array
        Spell kinesis = new Spell(SpellType.KINESIS);
        Spell lightningStrike = new Spell(SpellType.LIGHTNING_STRIKE);
        Spell swordOfPower = new Spell(SpellType.SWORD_OF_POWER);
        ArrayList<Spell> spells = new ArrayList();
        spells.add(swordOfPower);
        spells.add(lightningStrike);
        spells.add(kinesis);
        //item setup
        item = new Item("Palantíri");
        ArrayList inventory = new ArrayList();
        inventory.add(item);
        //Weapon setup
        weapon = new Weapon("Walking Stick", 20);
        caster = new Caster("Gandalf", 100, inventory, 1, weapon, spells);
    }
}
