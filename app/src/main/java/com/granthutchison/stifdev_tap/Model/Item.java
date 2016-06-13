package com.granthutchison.stifdev_tap.Model;

/**
 * The Item class represents an item which can be used in the game.
 * It holds details of whether it has already been used, along with details of text to display if
 * it is successfully used, or an unsuccessful attempt is made. Copies of the Item object will be
 * made available to the GUI by way of the Scenario classes inventory attribute, therefore getter
 * methods are made public.
 * Created by Stifler on 08/06/2016.
 */
public class Item {

    private String name;
    private Boolean used;
    private String unlocks; //The String title of the room it unlocks
    private String description;

    private String usedText; //The description to be displayed when the item is used - perhaps should be a parameter in Room?
    private String failText; //The text to be displayed when an attempt is made to use the item but fails.
    private String pickupText; //Text to display when the item is collected.


    public Item(String name, String unlocks, String description,String usedText, String failText) {
        this.name = name;
        this.used = false;
        this.unlocks = unlocks;
        this.description = description;
        this.usedText = usedText;
        this.failText = failText;
    }

    protected String getName(){
        return this.name;
    }

    protected String getPickupText(){
        return this.pickupText;
    }



}
