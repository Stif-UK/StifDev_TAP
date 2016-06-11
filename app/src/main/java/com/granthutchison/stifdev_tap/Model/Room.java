/**
 * Room objects represent rooms/areas in the text adventure.
 * Each Room has a title (e.g. "Entrance Hall") and description (e.g. "You are standing in a large entrance hallway").
 * Each room can have up to four exits ((Top, Bottom, Right, Left) any of which can be locked.
 * If all exits of a room are unlocked then an updated description is held to display (the current
 * solution only really allows for one locked door).
 * Created by Stifler on 08/06/2016.
 */

package com.granthutchison.stifdev_tap.Model;

public class Room {


    private String title;
    private String containsItem = "";
    //Do we need this attribute?

    //Room descriptions
    private String roomLockedDescription; //An initial description displayed for the room.
    private String itemCollectedDescription; //An updated description if an item is picked up in the room. - may not be required.
    private String roomsUnlockedDescription; //An updated description if all adjacent rooms have been unlocked.

    //Adjacent Rooms and the lock status of the 'door'.
    private String top;
    private boolean topLocked;

    private String bottom;
    private boolean bottomLocked;

    private String left;
    private boolean leftLocked;

    private String right;
    private boolean rightLocked;

    public Room(String title, String containsItem, String roomLockedDescription, String itemCollectedDescription, String roomsUnlockedDescription, String top, boolean topLocked, String bottom, boolean bottomLocked, String left, boolean leftLocked, String right, boolean rightLocked) {
        this.title = title;
        this.containsItem = containsItem;
        this.roomLockedDescription = roomLockedDescription;
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

    /**
     * getRoomDescription determines if any of the exits in the room are locked.
     * If any are locked then the roomLockedDescription is returned
     * If all rooms are unlocked then the roomUnlockedDescription is returned.
     * @return The current valid description of the room
     */

    protected String getRoomDescription(){
        if(topLocked || bottomLocked || leftLocked || rightLocked){
            return this.roomLockedDescription;
        }else{
            return this.roomsUnlockedDescription;
        }

    }

    //Getters for the directions/exits
    protected String getTop() {
        return top;
    }

    protected String getBottom() {
        return bottom;
    }

    protected String getLeft() {
        return left;
    }

    protected String getRight() {
        return right;
    }

    //Getters for the locked status of the exits
    protected boolean isTopLocked() {
        return topLocked;
    }

    protected boolean isBottomLocked() {
        return bottomLocked;
    }

    protected boolean isLeftLocked() {
        return leftLocked;
    }

    protected boolean isRightLocked() {
        return rightLocked;
    }


    protected String getContainsItem() {
        return containsItem;
    }

    /**
     * The toString method of the Room class simply returns the rooms title.
     * @return - The title of the room
     */
    @Override
    public String toString() {
        return this.getTitle();
    }


}
