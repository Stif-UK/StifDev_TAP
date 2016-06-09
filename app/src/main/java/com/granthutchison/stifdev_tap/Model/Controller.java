package com.granthutchison.stifdev_tap.Model;

/**
 * Created by Stifler on 08/06/2016.
 */
public class Controller {

    private Scenario currentGame;

    public Boolean startGame(String scenario){
       return currentGame.startGame(scenario);
    }

}
