package com.example.wemap4;

import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText buildingSearch = findViewById(R.id.BuildingSearch);
        ImageButton padButton =  findViewById(R.id.padButton);
        Button submitButton = findViewById(R.id.submitButton);
        ImageView barbieMap = findViewById(R.id.barbiemap);
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                barbieMap.setImageResource(R.drawable.barbie_map_highlight);}
        });

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