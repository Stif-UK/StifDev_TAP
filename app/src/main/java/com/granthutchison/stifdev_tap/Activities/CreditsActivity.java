package com.granthutchison.stifdev_tap.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.granthutchison.stifdev_tap.Model.Controller;
import com.granthutchison.stifdev_tap.R;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Stifler on 06/07/2016.
 */
public class CreditsActivity extends AppCompatActivity implements Animation.AnimationListener {

    private TextView creditsView1;
    private TextView creditsView2;
    private TextView creditsView3;
    private TextView creditsView4;
    private TextView creditsView5;
    private LinkedHashMap<String,String> endCredits;
    //TODO: Create animation objects for each individual textview, to avoid strobe effect
    Animation animFadeOut1;
    Animation animFadeOut2;
    Animation animFadeOut3;
    Animation animFadeOut4;
    Animation animFadeOut5;

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

        //Prep for animation

        animFadeOut1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        animFadeOut2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        animFadeOut3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        animFadeOut4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        animFadeOut5 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);


    }

    @Override
    protected void onStart(){
        super.onStart();
        rollCredits();

    }

    /**
     * The rollCredits method handles the task of parsing the credits of the current game
     * and populating these in the view.
     */
    private  void rollCredits(){

        final List<TextView> viewList = new ArrayList<>();
        //Add each of the views to the global list to allow iteration
        viewList.add(creditsView1);
        viewList.add(creditsView2);
        viewList.add(creditsView3);
        viewList.add(creditsView4);
        viewList.add(creditsView5);
        //and do the same for the animations
        final List<Animation> animationList = new ArrayList<>();
        animationList.add(animFadeOut1);
        animationList.add(animFadeOut2);
        animationList.add(animFadeOut3);
        animationList.add(animFadeOut4);
        animationList.add(animFadeOut5);



        /*
         * Create an Iterator to iterate over the endCredits map. This is declared as final
         * so that it can be passed to the CountDownTimer.
         */
        final Iterator it = endCredits.entrySet().iterator();

        /*
         * Determine the required timer length - initially set at one second per entry in the
         * endCredits map, plus an additional second.
         */
        final int creditSize = endCredits.size();
        int timerLength = (creditSize*2000)+3000;

        new CountDownTimer(timerLength, ((timerLength/(creditSize*2)))) {
            //Prep for iteration within the timer
            int counter = 0; //used to determine the view
            int counter2 = 0; //used to determine the total count.
            //The value of cont determines if the iteration should continue.
            boolean cont = it.hasNext();
            boolean lastEntry = false;
            boolean headerBody = true;
            TextView currentView;
            TextView previousView = null;
            Animation anim;

            //Local variables to hold the current entry and the credit text
            Map.Entry<String, String> credit;
            String creditHeader;
            String creditBody;






            public void onTick(long millisUntilFinished) {
                /*
                 * First, determine if the counter has a value greater than 4, and reset to zero
                 * if so. This ensure that all on-screen views are cycled.
                 */
                if(counter > 4){
                    counter = 0;
                }

                /*
                 * If there are still additional values in the iterator, continue to process the
                 * values. NOTE: Iterator is only
                 */
                if(cont) {



                    if(headerBody){
                        anim = animationList.get(counter);
                        fadePreviousView(previousView, anim);
                        credit = (Map.Entry) it.next();
                        creditHeader = credit.getKey();
                        Log.d("rollCredits","In tick, assigning Header value: "+creditHeader);
                        creditBody = credit.getValue();
                        Log.d("rollCredits","In tick, assigning Body value: "+creditBody);
                        currentView = viewList.get(counter);
                        Log.d("rollCredits","Clearing previous view");
                        writeCreditsHeader(currentView, creditHeader);
                        Log.d("rollCredits","Writing Header: "+creditHeader);
                        headerBody = false;
                        if(!it.hasNext()){
                            lastEntry = true;
                        }
                    }else{
                        //clearPreviousView(previousView);
                        writeCreditsBody(currentView,creditBody);
                        Log.d("rollCredits","Writing Body: " +creditBody);

                        /*
                         * Check if the iterator has finished - if so set the cont boolean to
                         * false. Carried out in the else clause to ensure that both credit header
                         * and body have been written before finishing.
                         */
                        if(lastEntry){
                            Log.d("rollCredits","Assigning 'continue' as false");
                            cont = false;
                        }
                        headerBody = true;
                        /*
                         * Set the current view as the previous view to allow clearing this on the
                         * next tick and increment the counter so that the next view is used next time.
                         * Again carried out within the else clause to ensure it happens after the
                         * credits body has been written.
                         */
                        Log.d("rollCredits","Setting the value of the previous view");
                        previousView = currentView;
                        Log.d("rollCredits","Incrementing counter");
                        counter++;
                        counter2++;
                    }


                }






            }

            public void onFinish() {
                Intent intent = new Intent(CreditsActivity.this, GameEndActivity.class);
                startActivity(intent);
            }
        }.start();


    }

    private void fadePreviousView(TextView previousView, Animation anim){
        if(previousView != null){
            Log.d("rollCredits","Calling fadeout animation on "+previousView.toString());
            previousView.startAnimation(anim);
            anim.setRepeatCount(0);
            onAnimationEnd(anim);

        }
    }
    private void clearPreviousView(TextView previousView){
        if(previousView != null){
            previousView.setText("");
        }
    }

    private  void writeCreditsHeader(TextView currentView, String creditHeader){
        //TODO: Add fade in animation to the creditHeader line
        currentView.setText(creditHeader);
        currentView.append("\n");
    }

    private void writeCreditsBody(TextView currentView, String creditBody){
        currentView.append(creditBody);
    }

    //Implement the methods of the AnimationListener interface
    @Override
    public void onAnimationStart(Animation animation) {
        //No use made of this method
    }

    @Override
    public void onAnimationEnd(Animation animation) {
        animation.cancel();
        Log.d("rollCredits","Animation cancelled "+animation.getRepeatCount());
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        //No use made of this method
    }

    //TODO: Override onBackPressed method
}
