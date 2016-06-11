package com.granthutchison.stifdev_tap;

import com.granthutchison.stifdev_tap.Model.Room;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A junit test file for unit testing the Room class.
 * Created by Stifler on 11/06/2016.
 */
public class RoomUnitTests {
    Room unlockedRoom = new Room("Hall", "Hammer", "The door is locked", "You picked up the Hammer","The doors are unlocked", "Room1", false, "Room2", false, "Room3", false, "Room4", false);
    Room lockedRoom = new Room("Hall", "Hammer", "The door is locked", "You picked up the Hammer","The doors are unlocked", "Room1", false, "Room2", true, "Room3", false, "Room4", false);

    @Test
    public void roomToString(){
        assertEquals("Hall", unlockedRoom.toString());
    }
    //To test room description tests first make that method public
    @Test
    public void roomGetDescription1(){
        assertEquals("Hall", unlockedRoom.toString());
        assertEquals("The doors are unlocked", unlockedRoom.getRoomDescription());
    }
    @Test
    public void roomGetDescription2(){
        assertEquals("Hall", lockedRoom.toString());
        assertEquals("The door is locked", lockedRoom.getRoomDescription());
    }
}
