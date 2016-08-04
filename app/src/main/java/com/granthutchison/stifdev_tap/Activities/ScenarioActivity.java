package com.granthutchison.stifdev_tap.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.granthutchison.stifdev_tap.Model.Controller;
import com.granthutchison.stifdev_tap.R;

public class ScenarioActivity extends AppCompatActivity {

    private Button btnTutorial;
    private Button btnArkley;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Controller myCont = Controller.getInstance();
        setContentView(R.layout.scenario_select);

        btnTutorial = (Button) findViewById(R.id.btnTutorial);
        btnArkley = (Button) findViewById(R.id.btnArklay);

        btnTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCont.startGame("Test");
                startGame();
            }
        });

        btnArkley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myCont.startGame("Arklay");
                startGame();
            }
        });
    }

    /**
     * The startGame() method in the ScenarioActivity class simply generates an Intent
     * to start the RoomActivity. It should be called after the Controller.startGame()
     * method has been called to generate the game map.
     */
    private void startGame(){
        Intent intent = new Intent(ScenarioActivity.this, RoomActivity.class);
        startActivity(intent);
    }
}
