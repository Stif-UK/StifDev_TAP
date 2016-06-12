package com.granthutchison.stifdev_tap.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.granthutchison.stifdev_tap.Model.Controller;
import com.granthutchison.stifdev_tap.R;

public class RoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Controller myCont = Controller.getInstance();
        setContentView(R.layout.activity_room);
        //Link the elements of the view.
        TextView roomTitle = (TextView) findViewById(R.id.roomTitle);
        TextView roomDesc = (TextView) findViewById(R.id.roomText);
        Button btnTop = (Button) findViewById(R.id.btnTop);
        Button btnBottom = (Button) findViewById(R.id.btnBottom);
        Button btnLeft = (Button) findViewById(R.id.btnLeft);
        Button btnRight = (Button) findViewById(R.id.btnRight);

        roomTitle.setText(myCont.getRoomTitle());
        roomDesc.setText(myCont.getRoomDescription());

        //Get the button text values and store as variables
        String btnTopTxt = myCont.getTopBtnTxt();
        String btnBottomTxt = myCont.getBottomBtnTxt();
        String btnLeftTxt = myCont.getLeftBtnTxt();
        String btnRightTxt = myCont.getRightBtnTxt();

        btnTop.setText(btnTopTxt);
        btnBottom.setText(btnBottomTxt);
        btnLeft.setText(btnLeftTxt);
        btnRight.setText(btnRightTxt);

    }
}
