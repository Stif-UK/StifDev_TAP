package com.granthutchison.stifdev_tap.Model;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
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
                //Begin by creating local variables to hold room names - this ensures that the same
                //value can be passed to the Room titles, adjacent room links and item info.
                String roomName1 = "Entrance Hall";
                String roomName2 = "The Pantry";
                String roomName3 = "The Dining Room";
                String roomName4 = "The Servant's Quarters";
                String roomName5 = "Entertainment Room";
                String roomName6 = "Computer Room";

                String itemName1 = "Hammer";
                String itemName2 = "An old Nokia N95";

                //Next, clear the map and inventory if not already empty:
                if(!map.isEmpty()){
                    map.clear();
                }
                if (!inventory.isEmpty()) {
                    inventory.clear();
                }

                //Room constructor:
                // public Room(String title,
                // String containsItem,
                // String itemPickupText,
                // String roomLockedDescription,
                // String itemCollectedDescription,
                // String roomsUnlockedDescription,
                // String topBtnText, String topRoomName, boolean topLocked,
                // String bottomBtnText, String bottomRoomName, boolean bottomLocked,
                // String leftBtnText, String leftRoomName, boolean leftLocked,
                // String rightBtnText, String rightRoomName, boolean rightLocked)


                //Create objects for each room in the game and add all of these to the map.
                Room room1 = new Room(roomName1, "","", "You're in a large entrance hall. There are exits to the North and East.\n\n The door to the West is boarded up.",
                        "", "You find yourself in a large entrance hall. There are exits to the North, East and West",
                        "Go North",roomName2,false,"","",false,"Go West",roomName3,true,"Go East",roomName5,false );
                map.put(roomName1, room1);

                Room room2 = new Room(roomName2, itemName1,"You found a Hammer!", "You're in a pantry. All of the doors are locked",
                        "", "This appears to be a pantry. You wonder if there's any food here. There are exits to the South and East.",
                        "","",false,"Go South",roomName1,false,"","",false,"Go East",roomName4,false );
                map.put(roomName2, room2);

                Room room3 = new Room(roomName3, "", "","You're in a dining room. All of the doors are locked",
                        "", "What a grand dining room! The candles flicker...someone must be getting ready for dinner. There are exits to the East and North.",
                        "Go North",roomName6,false,"","",false,"","",false,"Go East",roomName1,false );
                map.put(roomName3, room3);

                Room room4 = new Room(roomName4, "", "","You're in the servant's quarters. All of the doors are locked",
                        "", "You find yourself in the servant's quarters. There are exits to the South and West.",
                        "","",false,"Go South",roomName5,false,"Go West",roomName2,false,"","",false );
                map.put(roomName4, room4);

                Room room5 = new Room(roomName5, "","", "The entertainment room. All of the doors are locked",
                        "", "I've never seen a TV that size before! Is that a Playstation Neo!. There are exits to the North and West.",
                        "Go North",roomName4,false,"","",false,"Go West",roomName1,false,"","",false );
                map.put(roomName5, room5);

                Room room6 = new Room(roomName6, itemName2, "You've found a Nokia N95!","This room is tiny. All of the doors are locked",
                        "", "This room is tiny. A small computer sits in the corner, the monitors green glow illuminating a small desk. There is an exit to the South.",
                        "","",false,"Go South",roomName3,false,"","",false,"","",false );
                map.put(roomName6, room6);

                //Set the starting room
                this.setCurrentRoom(roomName1);

                //Item constructor:
                // public Item(String name,
                // String unlocks,
                // String description,
                // String usedText,
                // String failText) {

                //Create the items
                Item item1 = new Item(itemName1,roomName6,"A claw hammer. The head is coated in dried blood...","You used the hammer to prise the boards from the door...\n\n...That was both surprisingly easy, and fun!","This item can't be used here");
                gameItems.put(itemName1, item1);
                Item item2 = new Item(itemName2, roomName4, "An old Nokia phone...the battery still holds a charge!", "You try to call for help...", "No signal...typical!");
                gameItems.put(itemName2, item2);


                return true;



            case "Arklay":
                //TODO: Construct all required Room objects and add to the map attribute. All Item objects should be instantiated
                //and added to the gameItems Map.
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
                if(!currentRoom.isTopLocked()){
                    this.setCurrentRoom(newRoomTitle);
                    return true;
                }else{
                    return false;
                }
            case "left":
                newRoomTitle = currentRoom.getLeftRoomName();
                if(!currentRoom.isTopLocked()){
                    this.setCurrentRoom(newRoomTitle);
                    return true;
                }else{
                    return false;
                }
            case "right":
                newRoomTitle = currentRoom.getRightRoomName();
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

//    protected String useItem(String itemName){
//
//    }
}
