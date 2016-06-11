package com.granthutchison.stifdev_tap.Model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Stifler on 08/06/2016.
 */
public class Scenario {

    //All rooms and all items populated at Game start.
    private HashMap<String,Room> map = new HashMap<>(); //Contains all created Room objects
    private HashMap<String,Item> gameItems = new HashMap<>();//Contains all Items in the game

    private Set<Item> inventory; //No need for an Inventory object type - hold all in this set.

    private Room currentRoom;





    /**
     * startGame() should be received from the Controller, and initialises the objects required
     * for the requested scenario (or returns false if a bad scenario was requested).
     * As part of this setup the currentRoom attribute is set as the starting room.
     * @param scenario a String denoting the requested scenario.
     * @return A Boolean confirming whether or not setup was successful.
     */
    public Boolean startGame(String scenario){
        switch (scenario){
            case "Test":
                //TODO: Construct all required Room and Item objects for a test game.

            case "Arklay":
                //TODO: Construct all required Room objects and add to the map attribute. All Item objects should be instantiated
                //and added to the gameItems Map.
                return true;
            default:
                return false;
        }

    }

    //TODO: Implement moveRoom() in Scenario
    public Boolean moveRoom(String direction){
        switch (direction){
            case "top":
                break;
            case "bottom":
                break;
            case "left":
                break;
            case "right":
                break;

            default:
                return false;

        }



    }

    protected Room getCurrentRoom() {
        return currentRoom;
    }
}
