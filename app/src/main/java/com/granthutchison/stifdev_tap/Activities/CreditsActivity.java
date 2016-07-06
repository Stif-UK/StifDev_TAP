package com.granthutchison.stifdev_tap.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.granthutchison.stifdev_tap.Model.Controller;
import com.granthutchison.stifdev_tap.R;

/**
 * Created by Stifler on 06/07/2016.
 */
public class CreditsActivity extends AppCompatActivity {

    private TextView creditsView1;
    private TextView creditsView2;
    private TextView creditsView3;
    private TextView creditsView4;
    private TextView creditsView5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Controller myCont = Controller.getInstance();
        setContentView(R.layout.activity_credits);
    }
}
