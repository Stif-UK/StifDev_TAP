package com.granthutchison.stifdev_tap.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.granthutchison.stifdev_tap.R;

/**
 * The GameEndActivity class controls the activity_tyfp content view. The purpose of this view
 * is to display a 'thank you' message at the end of the game, providing a link back to the
 * main landing page, and social sharing options.
 * Created by Stifler on 16/07/2016.
 */
public class GameEndActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tyfp);
    }
}
