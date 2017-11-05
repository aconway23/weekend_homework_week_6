package com.example.adam.raysmusicexchange;

import com.example.adam.raysmusicexchange.Brass.Trumpet;

import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Created by adam on 05/11/2017.
 */

public class TrumpetTest {


    @Test
    public void hasName() {
        Trumpet trumpet = new Trumpet("Loud Trumpet", 3);
        String name = trumpet.name();
        assertEquals("Loud Trumpet", name);

    }

    @Test
    public void checkNumberOfValves() {
        Trumpet trumpet = new Trumpet("Loud Trumpet", 3);
        int numberOfValves = trumpet.getNumberOfValves();
        assertEquals(3, numberOfValves);
    }

}
