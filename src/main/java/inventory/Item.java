package inventory;

import java.util.ArrayList;

public class Item {

    private String name; // magic potions, coins, etc

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
