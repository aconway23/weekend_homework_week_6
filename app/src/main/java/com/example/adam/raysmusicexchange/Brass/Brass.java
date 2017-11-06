package com.example.adam.raysmusicexchange.Brass;

import com.example.adam.raysmusicexchange.Behaviours.Playable;

/**
 * Created by adam on 05/11/2017.
 */

public class Brass implements Playable {
//public abstract class Brass implements Playable {

    private String name;
    private int numberOfValves;
    private String colour;

    public Brass(String name, int numberOfValves, String colour) {


        this.name = name;
        this.numberOfValves = numberOfValves;
        this.colour = colour;
    }


    @Override
    public void play(String text) {
    }

    // correct?




    public String name() {
        return this.name;
    }

    public int getNumberOfValves() {
        return this.numberOfValves;
    }

    public String colour() {
        return this.colour;
    }



}
