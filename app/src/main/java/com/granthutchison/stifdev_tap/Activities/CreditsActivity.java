package com.granthutchison.stifdev_tap.Activities;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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

        //Local variables to hold the credit text
        String creditHeader;
        String creditBody;

        //Add each of the views to the global list to allow iteration
        viewList.add(creditsView1);
        viewList.add(creditsView2);
        viewList.add(creditsView3);
        viewList.add(creditsView4);
        viewList.add(creditsView5);

        //Iterate over the map of credits

        for (Map.Entry<String, String> credit : endCredits.entrySet()) {
            //reset the counter if it reaches four - only 5 on-screen views
            if(counter > 4){
                counter = 0;
            }
            currentView = viewList.get(counter);
            Log.d("rollCredits","View number "+counter+" being processed");
            //Store the values for the credits as local variables
            creditHeader = credit.getKey();
            creditBody = credit.getValue();

            //If a previous view has been populated, blank it
            clearPreviousView(previousView);
            //Write the credits to the current view
            writeCredits(currentView, creditHeader, creditBody);

            counter++;
            previousView = currentView;


        }

        //TODO: Replace this snackbar with the ability to end the game
        Snackbar.make(creditsView1, "The credits have ended!",Snackbar.LENGTH_LONG).show();
    }

    private void clearPreviousView(TextView previousView){
        if(previousView != null){
            //TODO: Replace this with a fade out animation
            previousView.setText("");
            Log.d("rollCredits","Previous view being cleared down: "+previousView.toString());
        }
    }

    private void writeCredits(final TextView currentView, String creditHeader, final String creditBody){
        //TODO: Add fade in animation to the creditHeader line
        currentView.setText(creditHeader);
        currentView.append("\n");
        //Add a time delay
        //Initial 2 second delay before credits body is written, then a further 2 second delay before
        //The counter ends.
        new CountDownTimer(4000, 2000) {

            public void onTick(long millisUntilFinished) {
                //TODO: Write code to write the characters on screen one by one
                currentView.append(creditBody);
            }

            public void onFinish() {
                //Do nothing yet.
            }
        }.start();

    }

}
