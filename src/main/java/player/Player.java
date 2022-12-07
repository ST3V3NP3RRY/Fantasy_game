package player;

import inventory.Item;

import java.util.ArrayList;

public abstract class Player {
    private String name;
    private int health;
    private ArrayList<Item> inventory;
    private int level;

    public Player(String name, int health, ArrayList<Item> inventory, int level) {
        this.name = name;
        this.health = health;
        this.inventory = inventory;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public int getLevel() {
        return level;
    }
}
