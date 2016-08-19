package com.granthutchison.stifdev_tap.Model;

import java.util.HashSet;

/**
 * Created by Stifler on 04/08/2016.
 */
public class TutorialGameScenario extends GameScenario {

    protected TutorialGameScenario(){

        //Begin by creating local variables to hold room names - this ensures that the same
        //value can be passed to the Room titles, adjacent room links and item info.
        String room1_tutorial1 = "Tutorial l";
        String room2_tutorial2 = "Tutorial 2";
        String room3_tutorial3 = "Tutorial 3";
        String room4_tutorial4 = "Tutorial 4";
        String room5_tutorial5 = "Tutorial 5";
        String room6_tutorial6 = "Tutorial 6";
        String room7_tutorial7 = "Tutorial 7";
        String room8_tutorial8 = "Tutorial 8";
        String room9_tutorial9 = "Tutorial 9";
        String room10_tutorial10 = "Tutorial 10";


        /*Next create Strings to hold all of the item names*/
        String item_cool = "A cool item!";


        //next, clear the map and inventory if not already empty:
        if(!super.getMap().isEmpty()){
            super.getMap().clear();
        }
        if (!super.getInventory().isEmpty()) {
            super.getInventory().clear();
        }

        /*Create the rooms and populate the game map*/

        //Well formatted constructor to support map creation

//        Room NAME_IT = new Room(
//                /*String title*/ NAME_STRING_HERE,
//                /*String contains item*/ "",
//                /*String itemPickupText*/ "",
//                /*String roomLockedDescription*/ "",
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
        Room tutorial1 = new Room(
                /*String title*/ room1_tutorial1,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String roomsUnlockedDescription*/ "Hi there! \n \n" +
                "Welcome to stifDev_TAP. \n\nCan I interest you in a game tutorial?",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"Sure!",
                /*String bottomRoomName*/room2_tutorial2,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room1_tutorial1, tutorial1);

                Room tutorial2 = new Room(
                /*String title*/ room2_tutorial2,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String roomsUnlockedDescription*/ "Great! \n\nThere's nothing too complicated " +
                        "about it, but let's take a walk around the " +
                        "game engine and see what's what...",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"Okay, sounds good!",
                /*String bottomRoomName*/room3_tutorial3,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room2_tutorial2, tutorial2);

                Room tutorial3 = new Room(
                /*String title*/ room3_tutorial3,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String roomsUnlockedDescription*/ "Right now you're looking at a \"Room\" in the " +
                        "game map (or you could think of it as a page of a story). \n\n" +
                        "Every room has a title, a description (this bit!) and some " +
                        "navigation buttons.",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"I like buttons!",
                /*String bottomRoomName*/room4_tutorial4,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room3_tutorial3, tutorial3);

                Room tutorial4 = new Room(
                /*String title*/ room4_tutorial4,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String roomsUnlockedDescription*/ "Me too! I like to map them all to fierce " +
                        "punch and mash! \n \n If there are any adjacent rooms " +
                        "(and they're unlocked...) then a button for that direction is active.\n\n " +
                        "(choose any button to continue)",
                /*String topBtnText*/ "Ooh, fancy!",
                /*String topRoomName*/room5_tutorial5,
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"Awesome!",
                /*String bottomRoomName*/room5_tutorial5,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"Cool!",
                /*String leftRoomName*/room5_tutorial5,
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"Hmmm...",
                /*String rightRoomName*/room5_tutorial5,
                /*boolean rightLocked*/false

        );
        super.getMap().put(room4_tutorial4, tutorial4);

                Room tutorial5 = new Room(
                /*String title*/ room5_tutorial5,
                /*String contains item*/ item_cool,
                /*String itemPickupText*/ "When you pick up an item, some text like this " +
                        "appears on screen - cool, eh?",
                /*String roomLockedDescription*/ "",
                /*String roomsUnlockedDescription*/ "Some rooms contain items. \n\n " +
                        "If you enter a room with an item, you automatically pick it up " +
                        "and it's added to your inventory.",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"Yeah",
                /*String bottomRoomName*/room6_tutorial6,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room5_tutorial5, tutorial5);

                Room tutorial6 = new Room(
                /*String title*/ room6_tutorial6,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String roomsUnlockedDescription*/ "You might have noticed a folder icon appear in" +
                        " the top right corner - that's how you access your inventory! " +
                        "(or you can swipe in from the right at any time).\n \n" +
                        "Why not try it and check what's in there - " +
                        "click any item to see it's detail, before moving to the next room.",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"Next please!",
                /*String bottomRoomName*/room7_tutorial7,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room6_tutorial6, tutorial6);

                Room tutorial7 = new Room(
                /*String title*/ room7_tutorial7,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "Wait, this room has no exit buttons!\n\n" +
                        "Better try to use that item from before! \n\n " +
                        "Click into your inventory and give it a go.",
                /*String roomsUnlockedDescription*/ "Pretty cool eh?\n\n" +
                        "You've unlocked this room and enabled the next button! \n\n" +
                        "You're so awesome!",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"I know!",
                /*String bottomRoomName*/room8_tutorial8,
                /*boolean bottomLocked*/true,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room7_tutorial7, tutorial7);

                Room tutorial8 = new Room(
                /*String title*/ room8_tutorial8,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String roomsUnlockedDescription*/ "Once used, items leave your inventory, so " +
                        "you'll only ever see ones in there that can still help you in some way.",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"Sweet!",
                /*String bottomRoomName*/room9_tutorial9,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room8_tutorial8, tutorial8);

                Room tutorial9 = new Room(
                /*String title*/ room9_tutorial9,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String roomsUnlockedDescription*/ "Once last thing...\n" +
                        "The game doesn't have a visible map (because I haven't figured out how to " +
                        "make one yet...)\n\n" +
                        "So you should pay attention to where you're going, or y'know, draw your own" +
                        " as you go...that's how we did it in the 80s!",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"Man, you're old!",
                /*String bottomRoomName*/room10_tutorial10,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room9_tutorial9, tutorial9);

                Room tutorial10 = new Room(
                /*String title*/ room10_tutorial10,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String roomsUnlockedDescription*/ "I know, right!\n\n" +
                        "Anyway, that's us done.\n\n" +
                        "You can't navigate backwards through the map with the Android back " +
                        "button, but pressing it does provide a nice little shortcut to exit to the " +
                        "main menu.\n\n" +
                        "Why not try it now?...Have fun playing stifDev_TAP!",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"",
                /*String bottomRoomName*/"",
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room10_tutorial10, tutorial10);


        /*No need for a final room as the tutorial will not jump to credits*/
//        /*The last room in the map should normally be a FinalRoom*/
//        FinalRoom laboratory = new FinalRoom(
//                /*String title*/room26_laboratory,
//                /*String roomUnlockedDescription*/"This is unusual. There's a laboratory here! \n \n Piles of papers and folders are scattered everywhere. The information held within is terrifying. This is just the beginning...",
//                /*String bottomBtnText*/ "Roll Credits"
//                );
//        super.getMap().put(room26_laboratory, laboratory);

        /*Set the starting room*/
        super.setCurrentRoom(room1_tutorial1);

        /*Now create the game items*/


        /*Well formatted item constructor to support inventory generation*/

//        Item NAME_IT = new Item(
//                /*String name*/"",
//                /*String unlocks*/"",
//                /*String description*/"",
//                /*String usedText*/"",
//                /*String failText*/""
//        );
//        super.getGameItems().put(NAME_STRING, NAME_IT);


                Item cool_item = new Item(
                /*String name*/item_cool,
                /*String unlocks*/room7_tutorial7,
                /*String description*/"This is an item - clicking on it to get here provides a " +
                        "little more detail about it.",
                /*String usedText*/"Yay! That worked.\n Look, the next button has appeared!",
                /*String failText*/"You can't use this yet though!"
        );
        super.getGameItems().put(item_cool, cool_item);

        /*Return a collection of strings to display when the back button is pressed*/
        HashSet<String> backComments = super.getBackComments();
        backComments.add("That's it! See you soon");



        /*Finally, create the credits for the scenario*/
        //These ones are never triggered in this scenario!
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
