package com.granthutchison.stifdev_tap.Model;

/**
 * Created by Stifler on 08/06/2016.
 */
public class Controller {

    private Scenario currentGame;

    //Variables to store info about the current room to pass to the GUI
    private String roomTitle;
    private String roomDescription;

    public Boolean startGame(String scenario){
       return currentGame.startGame(scenario);
    }

    public void moveRoom(String direction){
        if(currentGame.moveRoom(direction)){
            this.setRoomTitle(currentGame.getCurrentRoom().getTitle());

        };

    }


    public void setRoomTitle(String roomTitle) {
        this.roomTitle = roomTitle;
    }
}
