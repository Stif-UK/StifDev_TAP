package com.granthutchison.stifdev_tap.Model;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
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

    private Set<Item> inventory = new HashSet<Item>(); //No need for an Inventory object type - hold all in this set.
    private LinkedHashMap<String, String> credits = new LinkedHashMap<>();//Contains the end credits for the scenario
    //in the form key = header, value = name, e.g. ("Designer", "Grant Hutchison")
    private Set<String> backComments = new HashSet<>();

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
                TestScenario test = new TestScenario();

                //map, gameitems, inventory, currentRoom, credits
                this.setMap(test.getMap());
                this.setGameItems(test.getGameItems());
                this.setInventory(test.getInventory());
                this.setCurrentRoom(test.getCurrentRoom().toString());
                this.setCredits(test.getCredits());
                this.setBackComments(test.getBackComments());

                //Re-assign the variable to null so that it is garbage collected and frees memory
                test = null;


                return true;



            case "Arklay":
                ProjectArklayGameScenario arklay = new ProjectArklayGameScenario();
                this.setMap(arklay.getMap());
                this.setGameItems(arklay.getGameItems());
                this.setInventory(arklay.getInventory());
                this.setCurrentRoom(arklay.getCurrentRoom());
                this.setCredits(arklay.getCredits());
                this.setBackComments(arklay.getBackComments());
                arklay = null;

                return true;

            case "Tutorial":
                TutorialGameScenario tutorial = new TutorialGameScenario();
                this.setMap(tutorial.getMap());
                this.setGameItems(tutorial.getGameItems());
                this.setInventory(tutorial.getInventory());
                this.setCurrentRoom(tutorial.getCurrentRoom());
                this.setCredits(tutorial.getCredits());
                this.setBackComments(tutorial.getBackComments());
                tutorial = null;

                return true;


            default:
                return false;
        }

    }

    protected Boolean moveRoom(String direction){
        String newRoomTitle;
        switch (direction.toLowerCase()){
            case "top":
                newRoomTitle = currentRoom.getTopRoomName();
                if(!currentRoom.isTopLocked()){
                    this.setCurrentRoom(newRoomTitle);
                    return true;
                }else{
                    return false;
                }

            case "bottom":
                newRoomTitle = currentRoom.getBottomRoomName();
                if(!currentRoom.isBottomLocked()){
                    this.setCurrentRoom(newRoomTitle);
                    return true;
                }else{
                    return false;
                }
            case "left":
                newRoomTitle = currentRoom.getLeftRoomName();
                if(!currentRoom.isLeftLocked()){
                    this.setCurrentRoom(newRoomTitle);
                    return true;
                }else{
                    return false;
                }
            case "right":
                newRoomTitle = currentRoom.getRightRoomName();
                if(!currentRoom.isRightLocked()){
                    this.setCurrentRoom(newRoomTitle);
                    return true;
                }else{
                    return false;
                }

            default:
                return false;

        }



    }

    protected boolean checkRoomForItem(){
        String itemInRoom = currentRoom.getContainsItem();
        if(itemInRoom.equals("")){
            return false;
        }
        else{
            //Attempt to add the item to the inventory - if it already exists in there false is returned.
            return inventory.add(gameItems.get(itemInRoom));
        }


    }

    /**
     * Helper method - if there is an item in the room this method returns pickup text to the Controller.
     * @return - Pickup text to be displayed on item collection, or an empty String.
     */
    protected String checkRoom(){
        if(checkRoomForItem()){
            String foundName = currentRoom.getContainsItem();
            String itemPickupText = currentRoom.getItemPickupText();
            return itemPickupText;
        }else{
            return "";
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

    protected Map<String,Room> getMap(){
        return new HashMap<String, Room>(map);
    }

    protected Set<Item> getInventory() {
        return Collections.unmodifiableSet(inventory);

    }

    protected Set<String> getBackComments() {return new HashSet<String>(backComments);}

    /**
     * The getCredits method returns the game credits as an unmodifiable LinkedHashMap (thus the order
     * is retained). Each key in the map is the header/type of credits (e.g. "Game Designer") while
     * the associated value is the credits entry (e.g. "Grant Hutchison").
     * @return An unmodifiable LinkedHashMap<String, String> containing credits header/content info
     */
    protected LinkedHashMap<String,String> getCredits(){
        //Return a COPY of the credits to maintain the originals integrity
        return new LinkedHashMap<>(credits);
    }

    protected String useItem(String itemName){
        //Get the item object
        Item usedItem = gameItems.get(itemName);
        String returnText = usedItem.useItem(currentRoom);
        return returnText;

    }

    private void setMap(HashMap<String, Room> map) {
        this.map = map;
    }

    private void setGameItems(HashMap<String, Item> gameItems) {
        this.gameItems = gameItems;
    }

    private void setInventory(Set<Item> inventory) {
        this.inventory = inventory;
    }

    private void setCredits(LinkedHashMap<String, String> credits) {
        this.credits = credits;
    }

    private void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void setBackComments(HashSet<String> backComments) {
        this.backComments = backComments;
    }
}
