package com.granthutchison.stifdev_tap.Model;

import java.lang.reflect.Constructor;

/**
 * The Controller object manages the interaction between the application view and the implementation model.
 * It's role is to prevent the view from having access to the objects in the model, thus avoiding the
 * chance of the application ending in an invalid state.
 * Created by Stifler on 08/06/2016.
 */
public class Controller {
    //Implement the controller as a singleton to prevent the View from creating multiple controllers
    private static Controller ourInstance;

    public static void initInstance(){
        if(ourInstance == null){
            ourInstance = new Controller();
        }
    }

    public static Controller getInstance() {
        return ourInstance;
    }

    //Hide the constructor to prevent other objects creating instances of Controller
    private Controller(){};

    private Scenario currentGame = new Scenario();

    //Variables to store info about the current room to pass to the GUI
    private String roomTitle;
    private String roomDescription;
    //Variables to hold info about the direction buttons and map
    //Button text
    private String topBtnTxt;
    private String bottomBtnTxt;
    private String leftBtnTxt;
    private String rightBtnTxt;

    //No need for the Constructor to know the adjacent rooms - the scenario and room know these.
    //Just need button text to be consistant, e.g. empty string if no adjacent rooms exist.

    //Door locked status
    private boolean topLocked;
    private boolean bottomLocked;
    private boolean leftLocked;
    private boolean rightLocked;

    public boolean startGame(String scenario){

        boolean result = currentGame.startGame(scenario);
        //Set the title and description of the room
        this.setRoomTitle(currentGame.getCurrentRoom().getTitle());
        this.setRoomDescription(currentGame.getCurrentRoom().getRoomDescription());
        //Set the button text values
        this.setTopBtnTxt(currentGame.getCurrentRoom().getTopBtnText());
        this.setBottomBtnTxt(currentGame.getCurrentRoom().getBottomBtnText());
        this.setLeftBtnTxt(currentGame.getCurrentRoom().getLeftBtnText());
        this.setRightBtnTxt(currentGame.getCurrentRoom().getRightBtnText());
        //Set the door locked statuses
        this.setTopLocked(currentGame.getCurrentRoom().isTopLocked());
        this.setBottomLocked(currentGame.getCurrentRoom().isBottomLocked());
        this.setLeftLocked(currentGame.getCurrentRoom().isLeftLocked());
        this.setRightLocked(currentGame.getCurrentRoom().isRightLocked());

        return result;
    }

    /**
     * The moveRoom() method is used to navigate the 'game map' of the text adventure.
     * This first calls on the currentGame Scenario object to amend it's currentRoom (if it can).
     * Once the room has changed this method pulls all of the updated details of the room object
     * and stores them in parameters local to the Controller class (such that these can be returned
     * to the GUI without exposing the objects within the model.
     *
     * @param direction - this should always be either "Top", "Bottom", "Left" or "Right".
     */
    public boolean moveRoom(String direction){
        if(currentGame.moveRoom(direction)){
            this.setRoomTitle(currentGame.getCurrentRoom().getTitle());
            this.setRoomDescription(currentGame.getCurrentRoom().getRoomDescription());
            //Set the button text values
            this.setTopBtnTxt(currentGame.getCurrentRoom().getTopBtnText());
            this.setBottomBtnTxt(currentGame.getCurrentRoom().getBottomBtnText());
            this.setLeftBtnTxt(currentGame.getCurrentRoom().getLeftBtnText());
            this.setRightBtnTxt(currentGame.getCurrentRoom().getRightBtnText());
            //Set the door locked statuses
            this.setTopLocked(currentGame.getCurrentRoom().isTopLocked());
            this.setBottomLocked(currentGame.getCurrentRoom().isBottomLocked());
            this.setLeftLocked(currentGame.getCurrentRoom().isLeftLocked());
            this.setRightLocked(currentGame.getCurrentRoom().isRightLocked());

            return true;
        }
        else {
            return false;
        }

    }



    /**
     * checkRoomForItem() is used to determine if the currentRoom object has an item in it,
     * and whether or not the user already holds this item.
     * @return - Text to be displayed if an item is found. An empty string is returned if no item
     * was found in the room
     */
    public String checkRoomForItem(){
        return this.currentGame.checkRoomForItem();
    }


    /**
     * Setter method for the Controller objects roomTitle attribute.
     * @param roomTitle - the new title for the room
     */
    protected void setRoomTitle(String roomTitle) {
        this.roomTitle = roomTitle;
    }

    /**
     * Setter method for the Controller objects roomDescription attribute.
     * @param description - the new description of the room
     */
    protected void setRoomDescription(String description){
        this.roomDescription = description;
    }

    //Setters for the room buttons


    protected void setTopBtnTxt(String topBtnTxt) {
        this.topBtnTxt = topBtnTxt;
    }

    protected void setBottomBtnTxt(String bottomBtnTxt) {
        this.bottomBtnTxt = bottomBtnTxt;
    }

    protected void setLeftBtnTxt(String leftBtnTxt) {
        this.leftBtnTxt = leftBtnTxt;
    }

    protected void setRightBtnTxt(String rightBtnTxt) {
        this.rightBtnTxt = rightBtnTxt;
    }


    //Setters for the door locked statuses
    protected void setTopLocked(boolean topLocked) {
        this.topLocked = topLocked;
    }

    protected void setBottomLocked(boolean bottomLocked) {
        this.bottomLocked = bottomLocked;
    }

    protected void setLeftLocked(boolean leftLocked) {
        this.leftLocked = leftLocked;
    }

    protected void setRightLocked(boolean rightLocked) {
        this.rightLocked = rightLocked;
    }

    //public getters
    public String getRoomTitle() {
        return roomTitle;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public String getTopBtnTxt() {
        return topBtnTxt;
    }

    public String getBottomBtnTxt() {
        return bottomBtnTxt;
    }

    public String getLeftBtnTxt() {
        return leftBtnTxt;
    }

    public String getRightBtnTxt() {
        return rightBtnTxt;
    }

    public boolean isTopLocked() {
        return topLocked;
    }

    public boolean isBottomLocked() {
        return bottomLocked;
    }

    public boolean isLeftLocked() {
        return leftLocked;
    }

    public boolean isRightLocked() {
        return rightLocked;
    }
}
