package com.example.alexandersmith.afewofmyfavouritethings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TopHeroes topHeroes = new TopHeroes();
        ArrayList<Superhero> heroList = topHeroes.getList();

        TopHeroesAdapter heroAdapter = new TopHeroesAdapter(this, heroList);
        ListView listview = (ListView)findViewById(R.id.Superhero_list);
        listview.setAdapter(heroAdapter);
    }

    public void getHero(View listItem) {
        Superhero superhero = (Superhero) listItem.getTag();
        Intent i = new Intent(this, HeroActivity.class);
        i.putExtra("name", superhero.getName());
        i.putExtra("strength", superhero.getStrength());
        i.putExtra("intelligence", superhero.getIntelligence());
        i.putExtra("energy", superhero.getEnergy());
        startActivity(i);
    }
}
