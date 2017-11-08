package com.example.alexandersmith.afewofmyfavouritethings;

/**
 * Created by alexandersmith on 07/11/2017.
 */

public class Superhero {

        private String name;
        private Integer strength;
        private Integer intelligence;
        private Integer energy;

    public Superhero(String name, Integer strength, Integer intelligence, Integer energy) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public Integer getEnergy() {
        return energy;
    }
}

