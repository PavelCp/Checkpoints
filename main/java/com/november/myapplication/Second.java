package com.november.myapplication;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Second extends AppCompatActivity {

    private int statusA;
    private int statusB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        final ArrayList<Checkpoint> checkpoints = new ArrayList<>();
        TextView scoreA = (TextView) findViewById(R.id.side1);
        TextView scoreB = (TextView) findViewById(R.id.side2);

        for (int i = 0; i < 20; i++){
            if (i % 2 == 0)
                checkpoints.add(new Checkpoint("Check " + i, "A"));
            else if (i % 3 == 0)
                checkpoints.add(new Checkpoint("Check " + i, "B"));
            else checkpoints.add(new Checkpoint("Check " + i, "Neutral"));
        }

        for (int i = 0; i < checkpoints.size(); i++) {
            if (checkpoints.get(i).getCheckpointStatus().equals("A")){
                statusA++;
            } else if (checkpoints.get(i).getCheckpointStatus().equals("B")){
                statusB++;
            }
        }

        scoreA.setText("A " + statusA);
        scoreB.setText(statusB + " B");

        ListView listView = (ListView) findViewById(R.id.list);
        final StatusAdapter adapter = new StatusAdapter(this, checkpoints);
        listView.setAdapter(adapter);
    }
}
