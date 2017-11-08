package com.example.alexandersmith.afewofmyfavouritethings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HeroActivity extends AppCompatActivity {

    TextView nameView;
    TextView strengthView;
    TextView intelligenceView;
    TextView energyView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);

        nameView = (TextView) findViewById(R.id.nameView);
        strengthView = (TextView) findViewById(R.id.strengthView);
        intelligenceView = (TextView) findViewById(R.id.intelligenceView);
        energyView = (TextView) findViewById(R.id.energyView);

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        String name = extras.getString("name");
        Integer strength = extras.getInt("strength");
        Integer intelligence = extras.getInt("intelligence");
        Integer energy = extras.getInt("energy");

        nameView.setText("Name: " + name);
        strengthView.setText("Strength: " + strength.toString());
        intelligenceView.setText("Intelligence: " + intelligence.toString());
        energyView.setText("Energy: " + energy.toString());


    }
}
