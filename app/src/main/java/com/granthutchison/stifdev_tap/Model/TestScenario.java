package com.granthutchison.stifdev_tap.Model;

import com.granthutchison.stifdev_tap.Model.FinalRoom;
import com.granthutchison.stifdev_tap.Model.GameScenario;
import com.granthutchison.stifdev_tap.Model.Item;
import com.granthutchison.stifdev_tap.Model.Room;

/**
 * Created by Stifler on 22/07/2016.
 */
public class TestScenario extends GameScenario {




    protected TestScenario(){
        //Begin by creating local variables to hold room names - this ensures that the same
        //value can be passed to the Room titles, adjacent room links and item info.
        String roomName1 = "Entrance Hall";
        String roomName2 = "The Pantry";
        String roomName3 = "The Dining Room";
        String roomName4 = "The Servant's Quarters";
        String roomName5 = "Entertainment Room";
        String roomName6 = "Computer Room";
        String roomName7 = "A hidden room!";

        String itemName1 = "Hammer";
        String itemName2 = "An old Nokia N95";

        //Next, clear the map and inventory if not already empty:
        if(!super.getMap().isEmpty()){
            super.getMap().clear();
        }
        if (!super.getInventory().isEmpty()) {
            super.getInventory().clear();
        }

        //Well formatted constructor to support map creation

//        Room NAME_IT = new Room(
//                /*String title*/ NAME_STRING_HERE,
//                /*String contains item*/ "",
//                /*String itemPickupText*/ "",
//                /*String roomLockedDescription*/ "",
//                /*String itemCollectedDescription*/ "",
//                /*String roomsUnlockedDescription*/ "",
//                /*String topBtnText*/ "",
//                /*String topRoomName*/"",
//                /*boolean topLocked*/ false,
//                /*String bottomBtnText*/"",
//                /*String bottomRoomName*/"",
//                /*boolean bottomLocked*/false,
//                /*String leftBtnText*/"",
//                /*String leftRoomName*/"",
//                /*boolean leftLocked*/false,
//                /*String rightBtnText*/"",
//                /*String rightRoomName*/"",
//                /*boolean rightLocked*/false
//
//        );
//        super.getMap().put(NAME_STRING_HERE, NAME IT);


        //Create objects for each room in the game and add all of these to the map.
        Room room1 = new Room(roomName1, "","", "You're in a large entrance hall. There are exits to the North and East.\n\n The door to the West is boarded up.",
                "You find yourself in a large entrance hall. There are exits to the North, East and West",
                "Go North",roomName2,false,"","",false,"Go West",roomName3,true,"Go East",roomName5,false );
        super.getMap().put(roomName1, room1);

        Room room2 = new Room(roomName2, itemName1,"You found a Hammer!", "You're in a pantry. All of the doors are locked",
                "This appears to be a pantry. You wonder if there's any food here. There are exits to the South and East.",
                "","",false,"Go South",roomName1,false,"","",false,"Go East",roomName4,false );
        super.getMap().put(roomName2, room2);

        Room room3 = new Room(roomName3, "", "","You're in a dining room. All of the doors are locked",
                "What a grand dining room! The candles flicker...someone must be getting ready for dinner. There are exits to the East and North.",
                "Go North",roomName6,false,"","",false,"","",false,"Go East",roomName1,false );
        super.getMap().put(roomName3, room3);

        Room room4 = new Room(roomName4, "", "","You're in the servant's quarters. All of the doors are locked",
                "You find yourself in the servant's quarters. There are exits to the South and West.",
                "","",false,"Go South",roomName5,false,"Go West",roomName2,false,"","",false );
        super.getMap().put(roomName4, room4);

        Room room5 = new Room(roomName5, "","", "The entertainment room. All of the doors are locked",
                "I've never seen a TV that size before! Is that a Playstation Neo!. There are exits to the North and West.",
                "Go North",roomName4,false,"","",false,"Go West",roomName1,false,"","",false );
        super.getMap().put(roomName5, room5);

        Room room6 = new Room(roomName6, itemName2, "You've found a Nokia N95!","This room is tiny. A small computer sits in the corner, the monitors green glow illuminating a small desk. There is an exit to the South.",
                "This room is tiny. A small computer sits in the corner, the monitors green glow illuminating a small desk. \n \nA secret passage has been revealed to the North",
                "Go North",roomName7,true,"Go South",roomName3,false,"","",false,"","",false );
        super.getMap().put(roomName6, room6);

        FinalRoom room7 = new FinalRoom(roomName7, "Going through the door you find yourself in room the size of a small walk in wardrobe.\n \n You can't believe what you see in the corner...", "To be continued...");
        super.getMap().put(roomName7,room7);

        //Set the starting room
        this.setCurrentRoom(roomName1);

                /*Well formatted item constructor to support inventory generation*/

//        Item NAME_IT = new Item(
//                /*String name*/"",
//                /*String unlocks*/"",
//                /*String description*/"",
//                /*String usedText*/"",
//                /*String failText*/""
//        );
//        super.getGameItems().put(NAME_STRING, NAME_IT);

        //Create the items
        Item item1 = new Item(itemName1,roomName1,"A claw hammer. The head is coated in dried blood...","You used the hammer to prise the boards from the door...\n\n...That was both surprisingly easy, and fun!","This item can't be used here");
        super.getGameItems().put(itemName1, item1);
        Item item2 = new Item(itemName2, roomName6, "An old Nokia phone...the battery still holds a charge!", "You try to call for help...", "No signal...typical!");
        super.getGameItems().put(itemName2, item2);

        //Create the game credits
        super.getCredits().put("Story", "David Nimmo & Jamie Mercer");
        super.getCredits().put("Game Map", "David Nimmo & Jamie Mercer");
        super.getCredits().put("Inspired by", "Project-Arklay.com");
        super.getCredits().put("Game Engine Design","Grant Hutchison");
        super.getCredits().put("Lead Developer","Grant Hutchison");
        super.getCredits().put("Chief sounding board","Colin McCormick");
        super.getCredits().put("Alpha Testers","Colin McCormick\nGrant Hutchison");
        super.getCredits().put("Beta Testers","David Nimmo\nPaul Chisholm\nColin McCormick");
        super.getCredits().put("Proudly built using","Android Studio");
        super.getCredits().put("Special Thanks","David Nimmo\nThe Open University\nTim Buchalka\nJoanne & Caleb Hutchison");
        super.getCredits().put("END","");
    }

}
