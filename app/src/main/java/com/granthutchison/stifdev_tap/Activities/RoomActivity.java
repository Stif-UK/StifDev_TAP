package com.granthutchison.stifdev_tap.Activities;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.ArraySet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.granthutchison.stifdev_tap.Model.Controller;
import com.granthutchison.stifdev_tap.R;

import java.util.HashSet;
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

    protected void refreshView(){
        roomTitle.setText(myCont.getRoomTitle());
        roomDesc.setText(myCont.getRoomDescription());

        btnTopTxt = myCont.getTopBtnTxt();
        btnBottomTxt = myCont.getBottomBtnTxt();
        btnLeftTxt = myCont.getLeftBtnTxt();
        btnRightTxt = myCont.getRightBtnTxt();

        btnTop.setText(btnTopTxt);
        btnBottom.setText(btnBottomTxt);
        btnLeft.setText(btnLeftTxt);
        btnRight.setText(btnRightTxt);


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
}
