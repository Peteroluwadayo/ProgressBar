package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // initiate progress bar and start button

        final ProgressBar simpleProgressBar = (ProgressBar)  findViewById(R.id.simpleProgressBar);
        Button startButton = (Button) findViewById(R.id.startButton);
        Button GoneButton = (Button) findViewById(R.id.GoneButton);

        // perform click event on button
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // visible the progress bar
                simpleProgressBar.setVisibility(view.VISIBLE);
            }
        });
        GoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //visible the progress bar
                simpleProgressBar.setVisibility(view.INVISIBLE);
            }
        });

    }
}