package com.granthutchison.stifdev_tap.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.granthutchison.stifdev_tap.R;
import com.granthutchison.stifdev_tap.Util.FontManager;

/**
 * The GameEndActivity class controls the activity_tyfp content view. The purpose of this view
 * is to display a 'thank you' message at the end of the game, providing a link back to the
 * main landing page, and social sharing options.
 * Created by Stifler on 16/07/2016.
 */
public class GameEndActivity extends AppCompatActivity {

    Button btnHome;
    //TODO: Implement social sharing buttons and update layout

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tyfp);
        btnHome = (Button) findViewById(R.id.homeButton);

        //Set FontAwesome icon font
        btnHome.setTypeface(FontManager.getTypeface(btnHome.getContext(),FontManager.FONTAWESOME));
        btnHome.setText(R.string.fa_icon_home);
        //TODO: Set onClickListener with a trigger to return to the app landing page
    }

    //TODO: Update back button press functionality


}
