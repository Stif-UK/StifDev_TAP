package com.granthutchison.stifdev_tap.Model;

/**
 * The FinalRoom class is a subclass of Room. It is essentially identical, but with a simplified
 * constructor, which pre-populates several of the variables with default values.
 * Essentially a FinalRoom only has a title, description text and a single button which holds
 * the name of the adjacent room as "Credits".
 * The View should then know to call the games credits when this button is clicked.
 * Created by Stifler on 03/07/2016.
 */
public class FinalRoom extends Room {

    /**
     * The constructor for the FinalRoom class only takes three parameters, for the title,
     * room description and text to display on the rooms only button.
     * All other instance variables of the standard room class are given default values (empty
     * strings or false) with the exception of the title for the adjacent room to the bottom,
     * which has the value defaulted as "Credits". When the view identifies this it should act on it
     * to call the end credits of the game.
     * @param title - the Title of the FinalRoom
     * @param roomsUnlockedDescription - The description text to display for the room
     * @param bottomBtnText - The text to display on the only button in the room
     */
    protected FinalRoom(String title,
                     String roomsUnlockedDescription,
                     String bottomBtnText) {

        super(title, "", "", "", roomsUnlockedDescription,
                "", "", false, bottomBtnText,
                /*The bottom room name will always be "Credits" to enable a FinalRoom
                 * to trigger the end credits */ "Credits", false, "", "", false, "", "", false);
    }
}
