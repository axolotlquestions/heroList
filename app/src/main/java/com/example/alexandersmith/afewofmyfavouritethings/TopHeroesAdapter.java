package com.example.alexandersmith.afewofmyfavouritethings;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alexandersmith on 07/11/2017.
 */

public class TopHeroesAdapter extends ArrayAdapter<Superhero> {

    public TopHeroesAdapter(Context context, ArrayList<Superhero> superheroes){
        super(context, 0, superheroes);
    }

    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.hero_item, parent, false);
        }
        Superhero currentHero = getItem(position);
        TextView name = (TextView) listItemView.findViewById(R.id.name_text);
        name.setText(currentHero.getName());
        TextView strength = (TextView) listItemView.findViewById(R.id.strength_text);
        strength.setText("Strength: " + currentHero.getStrength().toString());
        TextView intelligence = (TextView) listItemView.findViewById(R.id.intelligence_text);
        intelligence.setText("Intelligence: " + currentHero.getIntelligence().toString());
        TextView energy = (TextView) listItemView.findViewById(R.id.energy_Text);
        energy.setText("Energy: " + currentHero.getEnergy().toString());

        listItemView.setTag(currentHero);

        return listItemView;
    }

}
