package com.granthutchison.stifdev_tap.Model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by Stifler on 22/07/2016.
 */
public abstract class GameScenario {

    //All concrete instances of GameScenario should have the following instance variables which
    //should be assigned in their constructors
    private HashMap<String,Room> map = new HashMap<>(); //Contains all created Room objects
    private HashMap<String,Item> gameItems = new HashMap<>();//Contains all Items in the game

    private Set<Item> inventory = new HashSet<Item>(); //No need for an Inventory object type - hold all in this set.
    private LinkedHashMap<String, String> credits = new LinkedHashMap<>();//Contains the end credits for the scenario
    //in the form key = header, value = name, e.g. ("Designer", "Grant Hutchison")

    private Room currentRoom;


    protected void setMap(HashMap<String, Room> map) {
        this.map = map;
    }

    protected void setGameItems(HashMap<String, Item> gameItems) {
        this.gameItems = gameItems;
    }

    protected void setInventory(Set<Item> inventory) {
        this.inventory = inventory;
    }

    protected void setCredits(LinkedHashMap<String, String> credits) {
        this.credits = credits;
    }

    protected void setCurrentRoom(String newRoomTitle) {
        Room newCurrentRoom = this.map.get(newRoomTitle);
        this.currentRoom = newCurrentRoom;
    }

    //All instances of GameScenario should provide the following getters
    protected HashMap<String, Room> getMap() {
        return map;
    }

    protected HashMap<String, Item> getGameItems() {
        return gameItems;
    }

    protected Set<Item> getInventory() {
        return inventory;
    }

    protected LinkedHashMap<String, String> getCredits() {
        return credits;
    }

    protected Room getCurrentRoom() {
        return currentRoom;
    }
}
