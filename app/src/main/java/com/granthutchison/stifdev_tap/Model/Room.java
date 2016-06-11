/**
 * Created by Stifler on 08/06/2016.
 */

package com.granthutchison.stifdev_tap.Model;

public class Room {


    private String title;
    private String containsItem = ""; //TODO: Implement Item class.
    //Do we need this attribute?

    //Room descriptions
    private String initialDescription; //An initial description displayed for the room.
    private String itemCollectedDescription; //An updated description if an item is picked up in the room.
    private String roomsUnlockedDescription; //An updated description if all adjacent rooms have been unlocked.

    //Adjacent Rooms and the lock status of the 'door'.
    private String top;
    private Boolean topLocked;

    private String bottom;
    private Boolean bottomLocked;

    private String left;
    private Boolean leftLocked;

    private String right;
    private Boolean rightLocked;

    public Room(String title, String containsItem, String initialDescription, String itemCollectedDescription, String roomsUnlockedDescription, String top, Boolean topLocked, String bottom, Boolean bottomLocked, String left, Boolean leftLocked, String right, Boolean rightLocked) {
        this.title = title;
        this.containsItem = containsItem;
        this.initialDescription = initialDescription;
        this.itemCollectedDescription = itemCollectedDescription;
        this.roomsUnlockedDescription = roomsUnlockedDescription;
        this.top = top;
        this.topLocked = topLocked;
        this.bottom = bottom;
        this.bottomLocked = bottomLocked;
        this.left = left;
        this.leftLocked = leftLocked;
        this.right = right;
        this.rightLocked = rightLocked;
    }

    /**
     * getTitle is a getter method to return the title of the Room.
     * @return String - the title of the room
     */
    protected String getTitle(){
        return this.title;
    }





    //TODO: Implement a toString method that returns the room title - this will be used to generate the Key when rooms are added to the Map.
}
