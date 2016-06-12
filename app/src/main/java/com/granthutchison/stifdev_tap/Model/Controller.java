package com.granthutchison.stifdev_tap.Model;

/**
 * The Controller object manages the interaction between the application view and the implementation model.
 * It's role is to prevent the view from having access to the objects in the model, thus avoiding the
 * chance of the application ending in an invalid state.
 * Created by Stifler on 08/06/2016.
 */
public class Controller {

    private Scenario currentGame = new Scenario();

    //Variables to store info about the current room to pass to the GUI
    private String roomTitle;
    private String roomDescription;

    public boolean startGame(String scenario){

        boolean result = currentGame.startGame(scenario);
        this.setRoomTitle(currentGame.getCurrentRoom().getTitle());
        this.setRoomDescription(currentGame.getCurrentRoom().getRoomDescription());
        //TODO: Implement code to set other required instance variables

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
    public void moveRoom(String direction){
        if(currentGame.moveRoom(direction)){
            this.setRoomTitle(currentGame.getCurrentRoom().getTitle());
            this.setRoomDescription(currentGame.getCurrentRoom().getRoomDescription());
            //TODO: implement updates to the other variables.
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

    public String getRoomTitle() {
        return roomTitle;
    }

    public String getRoomDescription() {
        return roomDescription;
    }
}
