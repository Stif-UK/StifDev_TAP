package com.granthutchison.stifdev_tap.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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
    Button btnFacebook;
    Button btnTwitter;
    Button btnGplus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tyfp);
        btnHome = (Button) findViewById(R.id.homeButton);
        btnFacebook = (Button) findViewById(R.id.btnFacebook);
        btnTwitter = (Button) findViewById(R.id.btnTwitter);
        btnGplus = (Button) findViewById(R.id.btnGplus);

        //Set FontAwesome icon font
        btnHome.setTypeface(FontManager.getTypeface(btnHome.getContext(),FontManager.FONTAWESOME));
        btnFacebook.setTypeface(FontManager.getTypeface(btnFacebook.getContext(), FontManager.FONTAWESOME));
        btnTwitter.setTypeface(FontManager.getTypeface(btnTwitter.getContext(), FontManager.FONTAWESOME));
        btnGplus.setTypeface(FontManager.getTypeface(btnGplus.getContext(), FontManager.FONTAWESOME));
        //Set the text of each button
        //TODO: Set onClickListener with a trigger to return to the app landing page
        btnHome.setText(R.string.fa_icon_home);
        btnFacebook.setText(R.string.fa_icon_facebook1);
        btnTwitter.setText(R.string.fa_icon_twitter);
        btnGplus.setText(R.string.fa_icon_gplus1);

        //When the home button is clicked, return to the main activity
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameEndActivity.this, MainActivity.class);
                //Clear this page from the back stack to prevent the user navigating back to it
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    //TODO: Update back button press functionality


}
