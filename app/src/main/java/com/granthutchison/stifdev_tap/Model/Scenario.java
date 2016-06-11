package com.granthutchison.stifdev_tap.Model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * The Scenario class represents a current Game of the text adventure.
 * This class is responsible for creating all of the room and item objects to be used in the game
 * and maintains the games inventory.
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

    public Boolean moveRoom(String direction){
        String newRoomTitle;
        switch (direction.toLowerCase()){
            case "top":
                newRoomTitle = currentRoom.getTop();
                if(!currentRoom.isTopLocked()){
                    this.setCurrentRoom(newRoomTitle);
                    return true;
                }else{
                    return false;
                }

            case "bottom":
                newRoomTitle = currentRoom.getBottom();
                if(!currentRoom.isTopLocked()){
                    this.setCurrentRoom(newRoomTitle);
                    return true;
                }else{
                    return false;
                }
            case "left":
                newRoomTitle = currentRoom.getLeft();
                if(!currentRoom.isTopLocked()){
                    this.setCurrentRoom(newRoomTitle);
                    return true;
                }else{
                    return false;
                }
            case "right":
                newRoomTitle = currentRoom.getRight();
                if(!currentRoom.isTopLocked()){
                    this.setCurrentRoom(newRoomTitle);
                    return true;
                }else{
                    return false;
                }

            default:
                return false;

        }



    }

    protected String checkRoomForItem(){
        String itemID = currentRoom.getContainsItem();
        String emptyString = "";
        if(itemID.length() <1){
            return emptyString;
        }else{
            Item roomItem = this.gameItems.get(itemID);
            inventory.add(roomItem);
            return roomItem.getName() + " found!";
        }

    }

    protected Room getCurrentRoom() {
        return currentRoom;
    }

    /**
     * The setter method for the Scenarios currentRoom takes a String as an arguement.
     * This should be the name of the room to be set as the current room of the map.
     * The map is then searched for the new Room object and this is assigned as the new currentRoom.
     * @param newRoomTitle - the title of the room which is to be set as the current room
     */
    protected void setCurrentRoom(String newRoomTitle) {
        Room newCurrentRoom = this.map.get(newRoomTitle);
        this.currentRoom = newCurrentRoom;
    }
}
