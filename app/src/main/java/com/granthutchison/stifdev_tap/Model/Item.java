package com.granthutchison.stifdev_tap.Model;

/**
 * Created by Stifler on 08/06/2016.
 */
public class Item {

    private String name;
    private Boolean used;
    private String unlocks; //The String title of the room it unlocks

    public Item(String name) {
        this.name = name;
        this.used = false;
    }
}
