package com.granthutchison.stifdev_tap.Model;

/**
 * Created by Stifler on 04/08/2016.
 */
public class ProjectArklayGameScenario extends GameScenario {

    protected ProjectArklayGameScenario(){

        //Begin by creating local variables to hold room names - this ensures that the same
        //value can be passed to the Room titles, adjacent room links and item info.
        String room1_prelude = "Prelude";
        String room2_foyer = "Foyer";
        String room3_dininghall = "Dining Hall";
        String room4_hall_lower_west_one = "Lower West Hall 1";
        String room5_kitchen = "The Kitchen";
        String room6_gallery = "Gallery";
        String room7_lounge = "Lounge";
        String room8_hall_lower_west_two = "Lower West Hall 2";
        String room9_library = "Library";
        String room10_hidden = "A hidden room!";
        String room11_Statue_room = "Statue Room";
        String room12_hall_lower_east = "Lower East Hall";
        String room13_swimming = "Swimming Pool";
        String room14_garage = "Garage";
        String room15_upper_foyer = "Upstairs Foyer";
        String room16_hall_upper_east_one = "Upper East Hallway 1";
        String room17_hall_upper_east_two = "Upper East Hallway 2";
        String room18_master_bedroom = "Master Bedroom";
        String room19_en_suite = "En-Suite";
        String room20_wardrobe = "Walk-in Wardrobe";
        String room21_aquarium = "Aquarium";
        String room22_trophy_room = "Trophy Room";
        String room23_hall_upper_west = "Upper West Hallway";
        String room24_guest_bedroom = "Guest Bedroom";
        String room25_study = "Study";
        String room26_laboratory = "Laboratory";

        String item_paper = "A scrap of paper";
        String item_crowbar = "Crowbar";
        String item_book = "Book";
        String item_moose = "Moose Head";
        String item_key = "Key";

        //Next, clear the map and inventory if not already empty:
        if(!super.getMap().isEmpty()){
            super.getMap().clear();
        }
        if (!super.getInventory().isEmpty()) {
            super.getInventory().clear();
        }

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
        Room prelude = new Room(
                /*String title*/ room1_prelude,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String itemCollectedDescription*/ "",
                /*String roomsUnlockedDescription*/ "Your head hurts. You're not sure where you are, and you definitely don't know how you got here. You can hear rain thrashing the ground outside, but the only exit is locked anyway. You figure you might as well try and understand what the Hell is going on...",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"Get Started",
                /*String bottomRoomName*/"",
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room1_prelude, prelude);

                Room foyer = new Room(
                /*String title*/ room2_foyer,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String itemCollectedDescription*/ "",
                /*String roomsUnlockedDescription*/ "You are in the foyer of what appears to be a mansion. /n A vast, dimly-lit foyer, with a grand staircase and a couple of doors.",
                /*String topBtnText*/ "Upstairs",
                /*String topRoomName*/room15_upper_foyer,
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"",
                /*String bottomRoomName*/"",
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"West",
                /*String leftRoomName*/room3_dininghall,
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"East",
                /*String rightRoomName*/room11_Statue_room,
                /*boolean rightLocked*/false

        );
        super.getMap().put(room2_foyer, foyer);

                Room dining_hall = new Room(
                /*String title*/ room3_dininghall,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String itemCollectedDescription*/ "",
                /*String roomsUnlockedDescription*/ "A large dining hall. /n A grandfather clock is steadily ticking, it's sound echoing through the room.",
                /*String topBtnText*/ "North",
                /*String topRoomName*/room4_hall_lower_west_one,
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"",
                /*String bottomRoomName*/"",
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"East",
                /*String rightRoomName*/room2_foyer,
                /*boolean rightLocked*/false

        );
        super.getMap().put(room3_dininghall, dining_hall);

                Room hall_lower_west_one = new Room(
                /*String title*/ room4_hall_lower_west_one,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String itemCollectedDescription*/ "",
                /*String roomsUnlockedDescription*/ "A hallway stretches out ahead of you. /n A number of doors line the hall.",
                /*String topBtnText*/ "North",
                /*String topRoomName*/room6_gallery,
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"South",
                /*String bottomRoomName*/room3_dininghall,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"West",
                /*String leftRoomName*/room7_lounge,
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"East",
                /*String rightRoomName*/room5_kitchen,
                /*boolean rightLocked*/false

        );
        super.getMap().put(room4_hall_lower_west_one, hall_lower_west_one);

                Room kitchen = new Room(
                /*String title*/ room5_kitchen,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String itemCollectedDescription*/ "",
                /*String roomsUnlockedDescription*/ "An industrial looking kitchen. /n The walls, floor and work surfaces are stained an odd, brownish colour.",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"",
                /*String bottomRoomName*/"",
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"West",
                /*String leftRoomName*/room4_hall_lower_west_one,
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room5_kitchen, kitchen);

                Room gallery = new Room(
                /*String title*/ room6_gallery,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String itemCollectedDescription*/ "",
                /*String roomsUnlockedDescription*/ "A large room full of various pieces of art. /n There's no time to look at these now.",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"South",
                /*String bottomRoomName*/room4_hall_lower_west_one,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"West",
                /*String leftRoomName*/room8_hall_lower_west_two,
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room6_gallery, gallery);

                Room lounge = new Room(
                /*String title*/ room7_lounge,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String itemCollectedDescription*/ "",
                /*String roomsUnlockedDescription*/ "A well-used lounge area. /n There's a large fireplace that looks like it hasn't been used in quite some time, and a dusty grand piano with sheet notes for The Moonlight Sonata. /n You regret never having learned to play the piano.",
                /*String topBtnText*/ "North",
                /*String topRoomName*/room8_hall_lower_west_two,
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"",
                /*String bottomRoomName*/"",
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"East",
                /*String rightRoomName*/room4_hall_lower_west_one,
                /*boolean rightLocked*/false

        );
        super.getMap().put(room7_lounge, lounge);

                Room hall_lower_west_two = new Room(
                /*String title*/ room8_hall_lower_west_two,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String itemCollectedDescription*/ "",
                /*String roomsUnlockedDescription*/ "A large hallway, with a musty smell in the air. /n There are doors to the West, South and East.",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"South",
                /*String bottomRoomName*/room7_lounge,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"West",
                /*String leftRoomName*/room9_library,
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"East",
                /*String rightRoomName*/room6_gallery,
                /*boolean rightLocked*/false

        );
        super.getMap().put(room8_hall_lower_west_two, hall_lower_west_two);


                Room library = new Room(
                /*String title*/ room9_library,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "A small library full of useless books. /n You notice that 'Tales of the Occult Vol. 2' is missing.",
                /*String itemCollectedDescription*/ "",
                /*String roomsUnlockedDescription*/ "A small library full of useless books. /n The bookcase is full, thanks to your careful tidying up. /n The replaced book has revealed a door in the West Wall, which is an amazing feat of engineering.",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"",
                /*String bottomRoomName*/"",
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"West",
                /*String leftRoomName*/room10_hidden,
                /*boolean leftLocked*/true,
                /*String rightBtnText*/"East",
                /*String rightRoomName*/room8_hall_lower_west_two,
                /*boolean rightLocked*/false

        );
        super.getMap().put(room9_library, library);

                Room hidden = new Room(
                /*String title*/ room10_hidden,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String itemCollectedDescription*/ "The room is almost completely empty, save for a piece of paper on the floor, with a series of numbers scribbled on it.",
                /*String roomsUnlockedDescription*/ "A well hidden room.",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"",
                /*String bottomRoomName*/"",
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"East",
                /*String rightRoomName*/room9_library,
                /*boolean rightLocked*/false

        );
        super.getMap().put(room10_hidden, hidden);

                Room statue_room = new Room(
                /*String title*/ room11_Statue_room,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String itemCollectedDescription*/ "",
                /*String roomsUnlockedDescription*/ "A square room with a prominent centerpiece. /n It appears to be a statue of Zeus, throwing a bolt of lightening. /n Seems fitting for the weather outside.",
                /*String topBtnText*/ "North",
                /*String topRoomName*/room12_hall_lower_east,
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"",
                /*String bottomRoomName*/"",
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"West",
                /*String leftRoomName*/room2_foyer,
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room11_Statue_room, statue_room);

                Room hall_lower_east = new Room(
                /*String title*/ room12_hall_lower_east,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "A long hallway with large windows. /n The weather outside is terrible. You can't see very far into the distance at all. /n There's a locked door to the North.",
                /*String itemCollectedDescription*/ "",
                /*String roomsUnlockedDescription*/ "A long hallway with large windows. /n The weather outside is terrible. You can't see very far into the distance at all. /n There are doors to the North and South.",
                /*String topBtnText*/ "North",
                /*String topRoomName*/room13_swimming,
                /*boolean topLocked*/ true,
                /*String bottomBtnText*/"South",
                /*String bottomRoomName*/room11_Statue_room,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room12_hall_lower_east, hall_lower_east);

                Room swimming = new Room(
                /*String title*/ room13_swimming,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String itemCollectedDescription*/ "",
                /*String roomsUnlockedDescription*/ "An Olympic sized swimming pool. /n What kind of people live here?",
                /*String topBtnText*/ "North",
                /*String topRoomName*/room14_garage,
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"South",
                /*String bottomRoomName*/room12_hall_lower_east,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room13_swimming, swimming);

                Room garage = new Room(
                /*String title*/ room14_garage,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String itemCollectedDescription*/ "You think that crowbar could come in handy though...",
                /*String roomsUnlockedDescription*/ "A large garage. /n The garage is empty, apart from a few tools. You're not entirely sure what they're for...",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"South",
                /*String bottomRoomName*/room13_swimming,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room14_garage, garage);

                Room upper_foyer = new Room(
                /*String title*/ room15_upper_foyer,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "You are at the top of a grand staircase. /n You have a good view of the foyer from the top of the staircase. /n A door to the east has been boarded shut.",
                /*String itemCollectedDescription*/ "",
                /*String roomsUnlockedDescription*/ "You are at the top of a grand staircase. /n You have a good view of the foyer from the top of the staircase. /n There are doors to the East and West.",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"Downstairs",
                /*String bottomRoomName*/room2_foyer,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"West",
                /*String leftRoomName*/room23_hall_upper_west,
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"East",
                /*String rightRoomName*/room16_hall_upper_east_one,
                /*boolean rightLocked*/true

        );
        super.getMap().put(room15_upper_foyer, upper_foyer);

                Room hall_upper_east_one = new Room(
                /*String title*/ room16_hall_upper_east_one,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String itemCollectedDescription*/ "",
                /*String roomsUnlockedDescription*/ "You are in a hallway. /n It's very dimly lit, and there are no natural sources of light in here. Your own footsteps echo behind you, and you can't be sure that you're alone.",
                /*String topBtnText*/ "North",
                /*String topRoomName*/room17_hall_upper_east_two,
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"",
                /*String bottomRoomName*/"",
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"West",
                /*String leftRoomName*/room15_upper_foyer,
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"East",
                /*String rightRoomName*/room18_master_bedroom,
                /*boolean rightLocked*/false

        );
        super.getMap().put(room16_hall_upper_east_one, hall_upper_east_one);

                Room hall_upper_east_two = new Room(
                /*String title*/ room17_hall_upper_east_two,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String itemCollectedDescription*/ "",
                /*String roomsUnlockedDescription*/ "You are in a hallway. /n How many rooms does this place have?",
                /*String topBtnText*/ "North",
                /*String topRoomName*/room22_trophy_room,
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"South",
                /*String bottomRoomName*/room16_hall_upper_east_one,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"West",
                /*String leftRoomName*/room21_aquarium,
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room17_hall_upper_east_two, hall_upper_east_two);

                Room master_bedroom = new Room(
                /*String title*/ room18_master_bedroom,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String itemCollectedDescription*/ "",
                /*String roomsUnlockedDescription*/ "The master bedroom. A large four-poster bed is in the middle of the room. /n The carpet feels thick and plush beneath your feet. There's a set of French doors leading to a balcony, but it is locked.",
                /*String topBtnText*/ "North",
                /*String topRoomName*/room20_wardrobe,
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"",
                /*String bottomRoomName*/"",
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"West",
                /*String leftRoomName*/room16_hall_upper_east_one,
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"East",
                /*String rightRoomName*/room19_en_suite,
                /*boolean rightLocked*/false

        );
        super.getMap().put(room18_master_bedroom, master_bedroom);



    }
}
