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

        /*Next create Strings to hold all of the item names*/
        String item_paper = "A scrap of paper";
        String item_crowbar = "Crowbar";
        String item_book = "Book";
        String item_moose = "Moose Head";
        String item_key = "Key";

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
                /*String roomsUnlockedDescription*/ "Your head hurts. You're not sure where you are, and you definitely don't know how you got here. You can hear rain thrashing the ground outside, but the only exit is locked anyway. You figure you might as well try and understand what the Hell is going on...",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"Get Started",
                /*String bottomRoomName*/room2_foyer,
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
                /*String roomsUnlockedDescription*/ "You are in the foyer of what appears to be a mansion. \n \n A vast, dimly-lit foyer, with a grand staircase and a couple of doors.",
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
                /*String roomsUnlockedDescription*/ "A large dining hall. \n \n A grandfather clock is steadily ticking, it's sound echoing through the room.",
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
                /*String roomsUnlockedDescription*/ "A hallway stretches out ahead of you. \n \n A number of doors line the hall.",
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
                /*String roomsUnlockedDescription*/ "An industrial looking kitchen. \n \n The walls, floor and work surfaces are stained an odd, brownish colour.",
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
                /*String roomsUnlockedDescription*/ "A large room full of various pieces of art. \n \n There's no time to look at these now.",
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
                /*String roomsUnlockedDescription*/ "A well-used lounge area. \n \n There's a large fireplace that looks like it hasn't been used in quite some time, and a dusty grand piano with sheet notes for The Moonlight Sonata. \n \n You regret never having learned to play the piano.",
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
                /*String roomsUnlockedDescription*/ "A large hallway, with a musty smell in the air. \n \n There are doors to the West, South and East.",
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
                /*String roomLockedDescription*/ "A small library full of useless books. \n \n You notice that 'Tales of the Occult Vol. 2' is missing.",
                /*String roomsUnlockedDescription*/ "A small library full of useless books. \n \n The bookcase is full, thanks to your careful tidying up. \n \n The replaced book has revealed a door in the West Wall, which is an amazing feat of engineering.",
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
                /*String contains item*/ item_paper,
                /*String itemPickupText*/ "The room is almost completely empty, save for a piece of paper on the floor, with a series of numbers scribbled on it.",
                /*String roomLockedDescription*/ "",
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
                /*String roomsUnlockedDescription*/ "A square room with a prominent centerpiece. \n \n It appears to be a statue of Zeus, throwing a bolt of lightening. \n \n Seems fitting for the weather outside.",
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
                /*String roomLockedDescription*/ "A long hallway with large windows. \n \n The weather outside is terrible. You can't see very far into the distance at all. \n \n There's a locked door to the North.",
                /*String roomsUnlockedDescription*/ "A long hallway with large windows. \n \n The weather outside is terrible. You can't see very far into the distance at all. \n \n\n \n\n \n\n \n\n \n\n \n\n \n\n \n\n \n\n \n\n \n\n \n\n \n\n \n\n \n\n \n\n \n\n \n\n \n There are doors to the North and South.",
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
                /*String roomsUnlockedDescription*/ "An Olympic sized swimming pool. \n \n What kind of people live here?",
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
                /*String contains item*/ item_crowbar,
                /*String itemPickupText*/ "You think that crowbar could come in handy though...",
                /*String roomLockedDescription*/ "",
                /*String roomsUnlockedDescription*/ "A large garage. \n \n The garage is empty, apart from a few tools. You're not entirely sure what they're for...",
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
                /*String roomLockedDescription*/ "You are at the top of a grand staircase. \n \n You have a good view of the foyer from the top of the staircase. \n \n A door to the east has been boarded shut.",
                /*String roomsUnlockedDescription*/ "You are at the top of a grand staircase. \n \n You have a good view of the foyer from the top of the staircase. \n \n There are doors to the East and West.",
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
                /*String roomsUnlockedDescription*/ "You are in a hallway. \n \n It's very dimly lit, and there are no natural sources of light in here. Your own footsteps echo behind you, and you can't be sure that you're alone.",
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
                /*String roomsUnlockedDescription*/ "You are in a hallway. \n \n How many rooms does this place have?",
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
                /*String roomsUnlockedDescription*/ "The master bedroom. A large four-poster bed is in the middle of the room. \n \n The carpet feels thick and plush beneath your feet. There's a set of French doors leading to a balcony, but it is locked.",
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

                Room en_suite = new Room(
                /*String title*/ room19_en_suite,
                /*String contains item*/ item_book,
                /*String itemPickupText*/ "There's a magazine rack here, which is empty except for a single book.",
                /*String roomLockedDescription*/ "",
                /*String roomsUnlockedDescription*/ "A fancy en-suite. There's a bidet, so that's quite exciting.",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"",
                /*String bottomRoomName*/"",
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"West",
                /*String leftRoomName*/room18_master_bedroom,
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room19_en_suite, en_suite);

                Room wardrobe = new Room(
                /*String title*/ room20_wardrobe,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String roomsUnlockedDescription*/ "A fancy walk-in wardrobe. Most of the clothes in here have been eaten away at by moths. \n \n The smell of damp fills your nostrils.",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"South",
                /*String bottomRoomName*/room18_master_bedroom,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room20_wardrobe, wardrobe);

                Room aquarium = new Room(
                /*String title*/ room21_aquarium,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String roomsUnlockedDescription*/ "A large aquarium full of exotic fish. \n \n I'm not sure how they're still alive, but the dim blue lights of their tanks is very soothing. There's a faint whirring noise coming from the tank.",
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
                /*String rightRoomName*/room17_hall_upper_east_two,
                /*boolean rightLocked*/false

        );
        super.getMap().put(room21_aquarium, aquarium);

                Room trophy_room = new Room(
                /*String title*/ room22_trophy_room,
                /*String contains item*/ item_moose,
                /*String itemPickupText*/ "You notice that a moose head has fallen onto the floor, and it seems like a good idea to take it with you.",
                /*String roomLockedDescription*/ "",
                /*String roomsUnlockedDescription*/ "A large trophy room, full of animals that have been stuffed and treated. \n \n It's pretty creepy in here.",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"South",
                /*String bottomRoomName*/room17_hall_upper_east_two,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room22_trophy_room, trophy_room);

                Room hall_upper_west = new Room(
                /*String title*/ room23_hall_upper_west,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "",
                /*String roomsUnlockedDescription*/ "You are in yet another hallway. \n \n \"No wonder it's so filthy around here! I couldn't be bothered to clean these hallways either\",\n you think to yourself.",
                /*String topBtnText*/ "",
                /*String topRoomName*/"",
                /*boolean topLocked*/ false,
                /*String bottomBtnText*/"",
                /*String bottomRoomName*/"",
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"West",
                /*String leftRoomName*/room24_guest_bedroom,
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"East",
                /*String rightRoomName*/room15_upper_foyer,
                /*boolean rightLocked*/false

        );
        super.getMap().put(room23_hall_upper_west, hall_upper_west);

                Room guest_bedroom = new Room(
                /*String title*/ room24_guest_bedroom,
                /*String contains item*/ "",
                /*String itemPickupText*/ "There's a small key on a bedside table.",
                /*String roomLockedDescription*/ "A well decorated guest bedroom. \n \n There's an unusual-looking plaque on the wall. It looks like it's missing something. \n \n There's a door to the North, but it's locked.",
                /*String roomsUnlockedDescription*/ "A well decorated guest bedroom. \n \n The moose's head is staring at you from its place on the wall, and the door to the North is unlocked.",
                /*String topBtnText*/ "North",
                /*String topRoomName*/room25_study,
                /*boolean topLocked*/ true,
                /*String bottomBtnText*/"",
                /*String bottomRoomName*/"",
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"East",
                /*String rightRoomName*/room23_hall_upper_west,
                /*boolean rightLocked*/false

        );
        super.getMap().put(room24_guest_bedroom, guest_bedroom);

                Room study = new Room(
                /*String title*/ room25_study,
                /*String contains item*/ "",
                /*String itemPickupText*/ "",
                /*String roomLockedDescription*/ "You are in a study, with a desk covered in scattered papers and cut-outs from news stories. \n \n There's a computer on a desk, with a prompt for a password on the screen.",
                /*String roomsUnlockedDescription*/ "You are in a study, with a desk covered in scattered papers and cut-outs from news stories. \n \n The computer has switched itself off, but a door to the North has revealed itself.",
                /*String topBtnText*/ "North",
                /*String topRoomName*/room26_laboratory,
                /*boolean topLocked*/ true,
                /*String bottomBtnText*/"South",
                /*String bottomRoomName*/room24_guest_bedroom,
                /*boolean bottomLocked*/false,
                /*String leftBtnText*/"",
                /*String leftRoomName*/"",
                /*boolean leftLocked*/false,
                /*String rightBtnText*/"",
                /*String rightRoomName*/"",
                /*boolean rightLocked*/false

        );
        super.getMap().put(room25_study, study);


        /*The last room in the map should normally be a FinalRoom*/
        FinalRoom laboratory = new FinalRoom(
                /*String title*/room26_laboratory,
                /*String roomUnlockedDescription*/"This is unusual. There's a laboratory here! \n \n Piles of papers and folders are scattered everywhere. The information held within is terrifying. This is just the beginning...",
                /*String bottomBtnText*/ "Roll Credits"
                );
        super.getMap().put(room26_laboratory, laboratory);

        /*Set the starting room*/
        super.setCurrentRoom(room1_prelude);

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


                Item paper = new Item(
                /*String name*/item_paper,
                /*String unlocks*/room25_study,
                /*String description*/"A piece of paper with 2407 written on it.",
                /*String usedText*/"You type the code into the terminal.",
                /*String failText*/"What do these numbers mean?"
        );
        super.getGameItems().put(item_paper, paper);

                Item crowbar = new Item(
                /*String name*/item_crowbar,
                /*String unlocks*/room16_hall_upper_east_one,
                /*String description*/"A sturdy crowbar.",
                /*String usedText*/"You prise off the wooden planks.",
                /*String failText*/"Nothing to use this on in here."
        );
        super.getGameItems().put(item_crowbar, crowbar);

                Item book = new Item(
                /*String name*/item_book,
                /*String unlocks*/room9_library,
                /*String description*/"Tales of the Occult, Vol.2",
                /*String usedText*/"The missing book sits neatly between volumes 1 and 3.",
                /*String failText*/"I wonder where this came from?"
        );
        super.getGameItems().put(item_book, book);

                Item moose_head = new Item(
                /*String name*/item_moose,
                /*String unlocks*/room24_guest_bedroom,
                /*String description*/"The moose's cold, dead eyes stare into your soul",
                /*String usedText*/"You place the moose head onto the empty plaque",
                /*String failText*/"Why did I bring this with me?"
        );
        super.getGameItems().put(item_moose, moose_head);

                Item key = new Item(
                /*String name*/item_key,
                /*String unlocks*/room13_swimming,
                /*String description*/"A small key",
                /*String usedText*/"You have unlocked the door to the North",
                /*String failText*/"It doesn't look like it fits any of these doors."
        );
        super.getGameItems().put(item_key, key);

        /*Finally, create the credits for the scenario*/
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
