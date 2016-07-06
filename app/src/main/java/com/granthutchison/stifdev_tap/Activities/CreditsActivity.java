package com.granthutchison.stifdev_tap.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.granthutchison.stifdev_tap.Model.Controller;
import com.granthutchison.stifdev_tap.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Stifler on 06/07/2016.
 */
public class CreditsActivity extends AppCompatActivity {

    private TextView creditsView1;
    private TextView creditsView2;
    private TextView creditsView3;
    private TextView creditsView4;
    private TextView creditsView5;
    private LinkedHashMap<String,String> endCredits;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Controller myCont = Controller.getInstance();
        setContentView(R.layout.activity_credits);

        //Bind the TextViews to instance variables
        creditsView1 = (TextView) findViewById(R.id.creditField1);
        creditsView2 = (TextView) findViewById(R.id.creditField2);
        creditsView3 = (TextView) findViewById(R.id.creditField3);
        creditsView4 = (TextView) findViewById(R.id.creditField4);
        creditsView5 = (TextView) findViewById(R.id.creditField5);

        //Get the end credits for the current game
        endCredits = myCont.getCredits();
        rollCredits();


    }

    /**
     * The rollCredits method handles the task of parsing the credits of the current game
     * and populating these in the view.
     */
    private void rollCredits(){
        //Prep for iteration
        int counter = 0;
        TextView currentView;
        TextView previousView = null;
        List<TextView> viewList = new ArrayList<>();
        viewList.add(creditsView1);
        viewList.add(creditsView2);
        viewList.add(creditsView3);
        viewList.add(creditsView4);
        viewList.add(creditsView5);
        //Iterate over the map of credits
        for (Map.Entry<String, String> credit : endCredits.entrySet()) {
            //reset the counter if it reaches for
            if(counter == 4){
                counter = 0;
            }
            currentView = viewList.get(counter);

            //If a previous view has been populated, blank it
            if(previousView != null){
                //TODO: Replace this with a fade out animation
                previousView.setText("");
            }

            //TODO: Add fade in animation to the getKey line
            currentView.setText(credit.getKey());
            currentView.append("\n");
            //Add a time delay

            //TODO: Write code to write the characters on screen one by one
            currentView.append(credit.getValue());
            counter++;
            previousView = currentView;
        }

        //TODO: Replace this snackbar with the ability to end the game
        Snackbar.make(creditsView1, "The credits have ended!",Snackbar.LENGTH_LONG).show();
    }

}
