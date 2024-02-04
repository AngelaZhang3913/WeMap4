package com.example.wemap4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton padButton =  findViewById(R.id.padButton);
        ImageView barbieMap = findViewById(R.id.barbiemap);
        padButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                barbieMap.setImageResource(R.drawable.padmap);
            }
        });

        ImageButton bathroomButton =  findViewById(R.id.bathroomButton);
        bathroomButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                barbieMap.setImageResource(R.drawable.bathroommap);
            }
        });

        ImageButton healthButton =  findViewById(R.id.healthButton);
        healthButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                barbieMap.setImageResource(R.drawable.healthmap);
            }
        });

    }
}