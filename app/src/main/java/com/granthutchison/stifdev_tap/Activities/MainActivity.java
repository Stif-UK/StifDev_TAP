package com.granthutchison.stifdev_tap.Activities;

import android.app.DialogFragment;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.granthutchison.stifdev_tap.Model.Controller;
import com.granthutchison.stifdev_tap.R;
import com.granthutchison.stifdev_tap.Util.FontManager;
import com.granthutchison.stifdev_tap.Util.HandyUtils;

public class MainActivity extends AppCompatActivity {

    private TextView btnPlay;
    private Button btnFB;
    private Button btnTwit;
    private Button btnGP;
    private Button btnInfo;
    private Intent intent;
    private boolean shareExpanded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Controller.initInstance();
        setContentView(R.layout.activity_main);
        btnPlay = (TextView) findViewById(R.id.playClick);
        btnFB = (Button) findViewById(R.id.btnFB);
        btnTwit = (Button) findViewById(R.id.btnTwit);
        btnGP = (Button) findViewById(R.id.btnGP);
        btnInfo = (Button) findViewById(R.id.btnInfo);

        //Use the FontAwesome utility to create icons for the page
        btnFB.setTypeface(FontManager.getTypeface(btnFB.getContext(),FontManager.FONTAWESOME));
        btnTwit.setTypeface(FontManager.getTypeface(btnTwit.getContext(),FontManager.FONTAWESOME));
        btnGP.setTypeface(FontManager.getTypeface(btnGP.getContext(),FontManager.FONTAWESOME));
        btnInfo.setTypeface(FontManager.getTypeface(btnInfo.getContext(),FontManager.FONTAWESOME));
        //Set the icons
        //info buttons
        btnInfo.setText(R.string.fa_icon_info);

        //Set the right hand 'social' button with a share icon
        hideSharing();
        shareExpanded = false;

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, ScenarioActivity.class);
                startActivity(intent);

            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment aboutDialog = new AboutDialog();
//                aboutDialog.setArguments(bundle);
                aboutDialog.show(getFragmentManager(),"about");

            }
        });
    }

    /*
     * Override the onBackPressed method - if a user clicks back when the share icons have been
     * expanded, then these should collapse first, else the app should simply exit.
     */
    @Override
    public void onBackPressed(){
        if (shareExpanded) {
            hideSharing();
        }
        else {
            super.onBackPressed();

        }
    }

    /**
     * setSharing() is a private helper method which can be used to instantiate the social share
     * buttons on the main screen
     */
    private void setSharing(){
        btnFB.setText(R.string.fa_icon_facebook1);
        btnTwit.setText(R.string.fa_icon_twitter);
        btnGP.setText(R.string.fa_icon_gplus1);
        shareExpanded = true;

        //TODO: The social share code here is repeated in the GameEndActivity.java class - pull out into a utility class instead.
        //Set the Google Plus button listener with code to post to G+
        btnGP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                //TODO: Update the share text below with the app link and flavour text
                intent.putExtra(Intent.EXTRA_TEXT,
                        "Just testing, check this out: http://stackoverflow.com/questions/28212490/");
                HandyUtils.filterByPackageName(btnGP.getContext(), intent, "com.google.android.apps.plus");
                startActivity(intent);
            }
        });

        //Set the Twitter button listener and code to post a Tweet
        btnTwit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create intent using ACTION_VIEW and a normal Twitter url:
                String tweetUrl = String.format("https://twitter.com/intent/tweet?text=%s&url=%s",
                        //TODO: Update the Tweet text and link
                        HandyUtils.urlEncode("Tweet text"),
                        HandyUtils.urlEncode("https://www.google.fi/"));
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(tweetUrl));
                // Narrow down to official Twitter app, if available:
                HandyUtils.filterByPackageName(btnTwit.getContext(), intent, "com.twitter");
                startActivity(intent);
            }
        });

        btnFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                //TODO: update the share link to the Play Store link for the app
                intent.putExtra(Intent.EXTRA_TEXT, "http://stackoverflow.com");
                HandyUtils.filterByPackageName(btnFB.getContext(), intent, "com.facebook.katana");
                startActivity(intent);
            }
        });


    }

    /**
     * hideSharing() is a private helper method that clears the social share buttons and nullifies
     * their onClickListeners, leaving the "Google plus button" with a simple share icon
     */
    private void hideSharing(){
        btnGP.setText(R.string.fa_icon_share);
        btnFB.setText("");
        btnTwit.setText("");
        shareExpanded = false;

        //If the share button is clicked, then set social icons:
        btnGP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSharing();
            }
        });

        btnFB.setOnClickListener(null);
        btnTwit.setOnClickListener(null);
    }
}
