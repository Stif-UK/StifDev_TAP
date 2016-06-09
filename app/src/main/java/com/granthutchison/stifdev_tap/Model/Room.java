/**
 * Created by Stifler on 08/06/2016.
 */

package com.granthutchison.stifdev_tap.Model;

public class Room {


    private String title;
    private Boolean isLocked;
    private Item containsItem; //TODO: Implement Item class.
    //Do we need this attribute?

    //Room descriptions
    private String initialDescription; //An initial description displayed for the room.
    private String itemCollectedDescription; //An updated description if an item is picked up in the room.
    private String roomsUnlockedDescription; //An updated description if all adjacent rooms have been unlocked.

    //Adjacent Rooms
    private Room roomNorth;
    private Room roomSouth;
    private Room roomEast;
    private Room roomWest;


//  Implement an overridden equals() method to compare room title only.
//    @Override
//    public boolean equals(Object o) {
//        if(o.getClass() == Room) {
//            return this.title.equals(o.getTitle());
//        }
//        else{
//            return false;
//        }
//    }
}
