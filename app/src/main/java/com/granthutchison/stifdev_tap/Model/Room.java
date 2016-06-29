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
    private String itemPickupText;


    //Adjacent Rooms and the lock status of the 'door'.
    private String topBtnText;
    private String topRoomName;
    private boolean topLocked;

    private String bottomBtnText;
    private String bottomRoomName;
    private boolean bottomLocked;

    private String leftBtnText;
    private String leftRoomName;
    private boolean leftLocked;

    private String rightBtnText;
    private String rightRoomName;
    private boolean rightLocked;

    public Room(String title, String containsItem, String itemPickupText, String roomLockedDescription, String itemCollectedDescription, String roomsUnlockedDescription, String topBtnText, String topRoomName, boolean topLocked, String bottomBtnText, String bottomRoomName, boolean bottomLocked, String leftBtnText, String leftRoomName, boolean leftLocked, String rightBtnText, String rightRoomName, boolean rightLocked) {
        this.title = title;
        this.containsItem = containsItem;
        this.itemPickupText = itemPickupText;
        this.roomLockedDescription = roomLockedDescription;
        this.itemCollectedDescription = itemCollectedDescription;
        this.roomsUnlockedDescription = roomsUnlockedDescription;
        //Top room info
        this.topBtnText = topBtnText;
        this.topRoomName = topRoomName;
        this.topLocked = topLocked;
        //Bottom room info
        this.bottomBtnText = bottomBtnText;
        this.bottomRoomName = bottomRoomName;
        this.bottomLocked = bottomLocked;
        //Left room info
        this.leftBtnText = leftBtnText;
        this.leftRoomName = leftRoomName;
        this.leftLocked = leftLocked;
        //Right room info
        this.rightBtnText = rightBtnText;
        this.rightRoomName = rightRoomName;
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
    protected String getTopBtnText() {
        return topBtnText;
    }
    protected String getTopRoomName(){
        return topRoomName;
    }

    protected String getBottomBtnText() {
        return bottomBtnText;
    }

    protected String getBottomRoomName(){
        return bottomRoomName;
    }

    public String getLeftBtnText() {
        return leftBtnText;
    }

    public String getLeftRoomName() {
        return leftRoomName;
    }

    public String getRightBtnText() {
        return rightBtnText;
    }

    public String getRightRoomName() {
        return rightRoomName;
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

    protected String getItemPickupText() { return itemPickupText;}

    //Setters for all of the locked statuses


    public void setRightLocked(boolean rightLocked) {
        this.rightLocked = rightLocked;
    }

    public void setLeftLocked(boolean leftLocked) {
        this.leftLocked = leftLocked;
    }

    public void setBottomLocked(boolean bottomLocked) {
        this.bottomLocked = bottomLocked;
    }

    public void setTopLocked(boolean topLocked) {
        this.topLocked = topLocked;
    }

    /**
     * The unlock() method sets all exits in a room to an 'unlocked' status.
     * A room can have up to 4 locked doors, but at present they must all be unlocked together.
     */
    protected void unlock(){
        setBottomLocked(false);
        setLeftLocked(false);
        setRightLocked(false);
        setTopLocked(false);
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
