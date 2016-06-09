package com.granthutchison.stifdev_tap.Model;

import java.util.HashSet;

/**
 * Created by Stifler on 08/06/2016.
 */
public class Scenario {

    private HashSet<Room> map = new HashSet<>();
    private Inventory inventory;
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
            case "Arklay":
                //TODO: Construct all required Room objects and add to the map attribute.
                //set the value of currentRoom to the expected starting room.
                return true;
            default:
                return false;
        }

    }
}
