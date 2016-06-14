package com.granthutchison.stifdev_tap.Model;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * A junit test file for the Controller class
 * Created by Stifler on 11/06/2016.
 */
public class ControllerUnitTests {
    //Useless test created to allow me to mark this as a 'test' class in Gradle
    Controller myCont = Controller.getInstance();
    @Test
    public void getTitleTest(){
        assertEquals(null, myCont.getRoomTitle());
    }

    @Test
    public void getCurrentRoomTest(){
        myCont.startGame("Test");
        assertEquals("Entrance Hall",myCont.getRoomTitle());
        //Validate that the surrounding room button info is set correctly
        assertEquals("",myCont.getBottomBtnTxt());
        assertEquals("Go North",myCont.getTopBtnTxt());
        assertEquals("Go West",myCont.getLeftBtnTxt());
        assertEquals("Go East",myCont.getRightBtnTxt());
    }

    @Test
    public void moveRoomTest(){
        myCont.startGame("Test");
        myCont.moveRoom("TOP");
        assertEquals("The Pantry",myCont.getRoomTitle());
        //Validate that the surrounding room button info is set correctly
        assertEquals("Go South",myCont.getBottomBtnTxt());
        assertEquals("",myCont.getTopBtnTxt());
        assertEquals("",myCont.getLeftBtnTxt());
        assertEquals("Go East",myCont.getRightBtnTxt());
    }





}
