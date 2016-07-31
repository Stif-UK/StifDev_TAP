package com.granthutchison.stifdev_tap.Activities;

import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.granthutchison.stifdev_tap.Model.Controller;
import com.granthutchison.stifdev_tap.R;
import com.granthutchison.stifdev_tap.Util.FontManager;

public class MainActivity extends AppCompatActivity {

    private TextView btnPlay;
    private Button btnFB;
    private Button btnTwit;
    private Button btnGP;
    private Button btnInfo;
    private Intent intent;

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
        btnGP.setText(R.string.fa_icon_share);

        //If the share button is clicked, then set social icons:
        btnGP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            btnFB.setText(R.string.fa_icon_facebook1);
            btnTwit.setText(R.string.fa_icon_twitter);
            btnGP.setText(R.string.fa_icon_gplus1);

                btnGP.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //do nothing yet
                    }
                });

            }
        });







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



}
