package com.example.adam.raysmusicexchange.Brass;

/**
 * Created by adam on 05/11/2017.
 */

public abstract class Brass {

    private String name;
    private int numberOfValves;

    public Brass(String name, int numberOfValves) {


        this.name = name;
        this.numberOfValves = numberOfValves;
    }


    public String name() {
        return this.name;
    }

    public int getNumberOfValves() {
    return this.numberOfValves;
    }
}
