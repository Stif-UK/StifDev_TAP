package com.granthutchison.stifdev_tap.Activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.granthutchison.stifdev_tap.R;
import com.granthutchison.stifdev_tap.Util.FontManager;
import com.granthutchison.stifdev_tap.Util.HandyUtils;

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

        //Set the social sharing buttons click listeners:
        btnGplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                //TODO: Update the share text below with the app link and flavour text
                intent.putExtra(Intent.EXTRA_TEXT,
                        "Just testing, check this out: http://stackoverflow.com/questions/28212490/");
                HandyUtils.filterByPackageName(btnGplus.getContext(), intent, "com.google.android.apps.plus");
                startActivity(intent);

            }
        });

        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create intent using ACTION_VIEW and a normal Twitter url:
                String tweetUrl = String.format("https://twitter.com/intent/tweet?text=%s&url=%s",
                        //TODO: Update the Tweet text and link
                        HandyUtils.urlEncode("Tweet text"),
                        HandyUtils.urlEncode("https://www.google.fi/"));
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(tweetUrl));
                HandyUtils.filterByPackageName(btnTwitter.getContext(), intent, "com.twitter");
                startActivity(intent);
            }
        });

    }

    //TODO: Update back button press functionality
    //What do I want the back button to do here? Some kind of 'bounce' animation on the home button?
    //A snackbar asking if the user wishes to return to the homescreen?


}
