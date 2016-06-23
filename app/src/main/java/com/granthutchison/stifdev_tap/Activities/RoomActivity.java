package com.granthutchison.stifdev_tap.Activities;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.ArraySet;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.granthutchison.stifdev_tap.Model.Controller;
import com.granthutchison.stifdev_tap.Model.Item;
import com.granthutchison.stifdev_tap.R;
import com.granthutchison.stifdev_tap.Util.FontManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class RoomActivity extends AppCompatActivity {

    private Controller myCont;
    private TextView roomTitle;
    private TextView roomDesc;
    private Button btnTop;
    private Button btnBottom;
    private Button btnLeft;
    private Button btnRight;
    private String btnTopTxt;
    private String btnBottomTxt;
    private String btnLeftTxt;
    private String btnRightTxt;
    private Button btnInventory;
    //Elements for the inventory drawer
    private List<Item> inventoryList;
    private DrawerLayout inventoryDrawerLayout;
    private ListView inventoryListView;
    private Button btnInventoryClose;
    ArrayAdapter<Item> itemArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myCont = Controller.getInstance();
        setContentView(R.layout.activity_room);
        //Link the elements of the view.
        roomTitle = (TextView) findViewById(R.id.roomTitle);
        roomDesc = (TextView) findViewById(R.id.roomText);
        btnTop = (Button) findViewById(R.id.btnTop);
        btnBottom = (Button) findViewById(R.id.btnBottom);
        btnLeft = (Button) findViewById(R.id.btnLeft);
        btnRight = (Button) findViewById(R.id.btnRight);
        btnInventory = (Button) findViewById(R.id.btnInventory);
        roomTitle.setText(myCont.getRoomTitle());
        roomDesc.setText(myCont.getRoomDescription());

        //Get the button text values and store as variables
        btnTopTxt = myCont.getTopBtnTxt();
        btnBottomTxt = myCont.getBottomBtnTxt();
        btnLeftTxt = myCont.getLeftBtnTxt();
        btnRightTxt = myCont.getRightBtnTxt();

        btnTop.setText(btnTopTxt);
        btnBottom.setText(btnBottomTxt);
        btnLeft.setText(btnLeftTxt);
        btnRight.setText(btnRightTxt);

        //Get the elements for the inventory
        inventoryDrawerLayout = (DrawerLayout) findViewById(R.id.DrawerLayout);
        inventoryListView = (ListView) findViewById(R.id.inventory_drawer);
        //Convert the inventory Set to a List to allow it to be displayed in order
        inventoryList = new ArrayList<Item>();
        inventoryList.addAll(myCont.getInventory());
        Collections.sort(inventoryList);

        //Add header to the view before creating the adapter - this implements the drawers
        //title and close button.
        View header = getLayoutInflater().inflate(R.layout.inventorytitle, null);
        inventoryListView.addHeaderView(header);
        //Create an adapter for the view
        itemArrayAdapter= new ArrayAdapter<Item>(inventoryDrawerLayout.getContext(), R.layout.inventoryliststyle, inventoryList);
        inventoryListView.setAdapter(itemArrayAdapter);
        btnInventoryClose = (Button) findViewById(R.id.btnInventoryClose);




        //Set a DrawerListener to listen for open and close events for the inventory view
        inventoryDrawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

                //Set up the inventory drawer close button
                btnInventoryClose.setTypeface(FontManager.getTypeface(btnInventoryClose.getContext(),FontManager.FONTAWESOME));
                btnInventoryClose.setText(R.string.fa_icon_folder_open);
                btnInventoryClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        inventoryDrawerLayout.closeDrawer(Gravity.RIGHT);
                    }
                });
            }

            @Override
            public void onDrawerOpened(View drawerView) {


            }

            @Override
            public void onDrawerClosed(View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });

        //Implement listeners for the inventory drawer
        inventoryListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                inventoryDrawerLayout.closeDrawer(Gravity.RIGHT);

                Snackbar.make(roomTitle, "You clicked on " + itemArrayAdapter.getItem(position-1).toString(), Snackbar.LENGTH_LONG).show();

            }
        });






        //Set listeners for the various navigation buttons and implement code to
        //traverse rooms
        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!btnTopTxt.equals("")) {
                    Log.d("MovingRoom","TopButton clicked in "+myCont.getRoomTitle());
                    if (myCont.moveRoom("Top")) {
                        refreshView();
                        Log.d("MovingRoom","View refreshed");
                    }
                }


            }
        });

        btnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!btnBottomTxt.equals("")) {
                    Log.d("MovingRoom","BottomButton clicked in "+myCont.getRoomTitle());
                    if (myCont.moveRoom("bottom")) {
                        refreshView();
                        Log.d("MovingRoom","View refreshed");
                    }
                }
            }
        });

        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!btnLeftTxt.equals("")) {
                    Log.d("MovingRoom","LeftButton clicked in "+myCont.getRoomTitle());
                    if (myCont.moveRoom("left")) {
                        refreshView();
                        Log.d("MovingRoom","View refreshed");
                    }
                }
            }
        });

        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!btnRightTxt.equals("")) {
                    Log.d("MovingRoom","RightButton clicked in "+myCont.getRoomTitle());
                    if (myCont.moveRoom("right")) {
                        refreshView();
                        Log.d("MovingRoom","View refreshed");
                    }
                }
            }
        });

    }

    /**
     * The refreshView method is called whenever the information displayed in the RoomActivity
     * should be changed (i.e. when the user navigates to a new room.
     * It sets the room title and text (including any applicable item pickup text) and sets the
     * text and active status for any required map navigation buttons.
     * It also ensures that if items are collected that the inventory is populated and an
     * icon is displayed onscreen to trigger it.
     */
    protected void refreshView(){
        String itemText = myCont.checkRoom();
        String eol = System.getProperty("line.separator");
        String surround = "****";
        roomTitle.setText(myCont.getRoomTitle());
        roomDesc.setText(myCont.getRoomDescription());

        if(itemText.length() > 1){
            roomDesc.append(eol + eol + surround +" "+itemText + " " + surround);
        }

        btnTopTxt = myCont.getTopBtnTxt();
        btnBottomTxt = myCont.getBottomBtnTxt();
        btnLeftTxt = myCont.getLeftBtnTxt();
        btnRightTxt = myCont.getRightBtnTxt();

        btnTop.setText(btnTopTxt);
        btnBottom.setText(btnBottomTxt);
        btnLeft.setText(btnLeftTxt);
        btnRight.setText(btnRightTxt);
        //Get the inventory again Convert the inventory Set to a List to allow it to be displayed in order
        inventoryList = new ArrayList<Item>();
        inventoryList.addAll(myCont.getInventory());
        Collections.sort(inventoryList);
        int itemCount = inventoryList.size();

        //Set FontAwesome icon font
        btnInventory.setTypeface(FontManager.getTypeface(btnInventory.getContext(),FontManager.FONTAWESOME));

        if(itemCount > 0){
            btnInventory.setText(R.string.fa_icon_folder);
            btnInventory.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inventoryDrawerLayout.openDrawer(Gravity.RIGHT);
                }
            });
        }
        //Refresh the inventory view
        try {
            itemArrayAdapter.clear();
            itemArrayAdapter.addAll(inventoryList);
        } catch (Exception e) {
            Log.d("RefreshInventory", "An exception was thrown");
            e.printStackTrace();
        }


    }

    @Override
    public void onBackPressed() {
        HashSet<String> backComments = new HashSet<>();
        backComments.add("You can't navigate using the back button");
        backComments.add("When we get to 88mph, you're going to see some serious shit!");
        backComments.add("Oh, no no no!");
        backComments.add("Something tells you that you should press onwards");
        backComments.add("I think I'll just keep going forwards...");
        backComments.add("Aww, please stay a while longer!");
        backComments.add("What's the matter, not l33t enough?");

        int size = backComments.size();
        int item = new Random().nextInt(size); // In real life, the Random object should be rather more shared than this
        int i = 0;
        String backComment = "You should never see this! My code is broken!";
        for(String str : backComments)
        {
            if (i == item)
                backComment = str;
            i = i + 1;
        }


        Snackbar.make(roomTitle, backComment, Snackbar.LENGTH_LONG).show();
    }

    //Create a discrete class to handle the drawer clicks:
//    private class DrawerItemClickListener implements ListView.OnItemClickListener {
//        @Override
//        public void onItemClick(AdapterView parent, View view, int position, long id) {
//            //selectItem(position);
//            Snackbar.make(roomTitle, "You pressed a button!", Snackbar.LENGTH_LONG).show();
//        }
//    }
}
