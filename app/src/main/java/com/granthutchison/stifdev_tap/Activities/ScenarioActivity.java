package com.granthutchison.stifdev_tap.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.granthutchison.stifdev_tap.R;

public class ScenarioActivity extends AppCompatActivity {

    private TextView btnArkley;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scenario_select);

        btnArkley = (TextView) findViewById(R.id.projectArkley);
        btnArkley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO: Send request to Controller to create new Scenario
                Intent intent = new Intent(ScenarioActivity.this, RoomActivity.class);
                startActivity(intent);



            }
        });
    }
}
