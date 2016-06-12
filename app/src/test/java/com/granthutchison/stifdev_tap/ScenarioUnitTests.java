package com.granthutchison.stifdev_tap.Model;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * A junit test class for the Scenario class
 * Created by Stifler on 12/06/2016.
 */
public class ScenarioUnitTests {
    Scenario testScenario = new Scenario();

    @Test
    public void testStartGame1(){

        testScenario.startGame("Test");
        assertEquals("Entrance Hall",testScenario.getCurrentRoom().toString());
    }

    @Test
    public void testStartGame2(){
        testScenario.startGame("Test");
        assertEquals("Entrance Hall",testScenario.getMap().get("Entrance Hall").toString());
        assertEquals("The Pantry",testScenario.getMap().get("The Pantry").toString());
        assertEquals("The Dining Room",testScenario.getMap().get("The Dining Room").toString());
        assertEquals("The Servant's Quarters",testScenario.getMap().get("The Servant's Quarters").toString());
        assertEquals("Entertainment Room",testScenario.getMap().get("Entertainment Room").toString());
        assertEquals("The Computer Room",testScenario.getMap().get("The Computer Room").toString());
    }

    @Test
    public void testStartGame3(){
        //Negative test scenario
        assertEquals(false,testScenario.startGame("Bullshit Title"));
    }
}
