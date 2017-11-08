package com.example.alexandersmith.afewofmyfavouritethings;

import java.util.ArrayList;

/**
 * Created by alexandersmith on 07/11/2017.
 */

public class TopHeroes {

    public ArrayList<Superhero> list;

    public TopHeroes(){
        list = new ArrayList<Superhero>();
        list.add(new Superhero("Spider-man", 4, 4, 4));;
        list.add(new Superhero("Captain Marvel", 4, 3, 5));
        list.add(new Superhero("Hulk", 7, 6, 1));
        list.add(new Superhero("Thor", 7, 2, 7));
        list.add(new Superhero("Iron Man", 6, 6, 6));
        list.add(new Superhero("Luke Cage", 4, 2, 1));
        list.add(new Superhero("Black Widow", 3, 3, 3));
        list.add(new Superhero("Daredevil", 2, 3, 1));
        list.add(new Superhero("Captain America", 3, 4, 1));
        list.add(new Superhero("Wolverine", 4, 2, 1));
    }

    public ArrayList<Superhero> getList() {
        return new ArrayList<Superhero>(list);
    }
}
