package com.example.adam.raysmusicexchange.WoodWind;

import com.example.adam.raysmusicexchange.Behaviours.Playable;

/**
 * Created by adam on 05/11/2017.
 */

public class WoodWind implements Playable {
//public abstract class WoodWind implements Playable {

    private String name;
    private int numberOfKeys;
    private String colour;


    public WoodWind(String name, int numberOfKeys, String colour) {


        this.name = name;
        this.numberOfKeys = numberOfKeys;
        this.colour = colour;
    }

    @Override
    public void play(String text) {
        this.play(text);
    }


    public String name() {
        return this.name;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }


    public String colour() {
        return this.colour;

    }
}
