package com.granthutchison.stifdev_tap.Model;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * A junit test file for the Controller class
 * Created by Stifler on 11/06/2016.
 */
public class ControllerUnitTests {
    //Useless test created to allow me to mark this as a 'test' class in Gradle
    Controller myCont = new Controller();
    @Test
    public void getTitleTest(){
        assertEquals(null, myCont.getRoomTitle());
    }

    @Test
    public void getCurrentRoomTest(){
        myCont.startGame("Test");
        assertEquals("Entrance Hall",myCont.getRoomTitle());
    }





}
