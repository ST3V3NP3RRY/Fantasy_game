package Player;

import inventory.Item;

import java.util.ArrayList;

public abstract class Player {

    private String name;

    private int Health;

    private ArrayList<Item> inventory;

    private int level;


    public Player(String name, int health, ArrayList<Item> inventory, int level) {
        this.name = name;
        Health = health;
        this.inventory = inventory;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return Health;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public int getLevel() {
        return level;
    }
}
