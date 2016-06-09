package com.granthutchison.stifdev_tap.Model;

import java.util.HashSet;

/**
 * Created by Stifler on 08/06/2016.
 */
public class Inventory {
    private HashSet<Item> carriedItems = new HashSet<>();

    public Boolean addItem(Item theItem){
      return this.carriedItems.add(theItem);
    };


}
