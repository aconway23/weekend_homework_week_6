package com.example.adam.raysmusicexchange;

import com.example.adam.raysmusicexchange.Brass.Trumpet;

import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Created by adam on 05/11/2017.
 */

public class TrumpetTest {


    @Test
    public void testHasName() {
        Trumpet trumpet = new Trumpet("Loud Trumpet", 3, "Gold");
        String name = trumpet.name();
        assertEquals("Loud Trumpet", name);

    }

    @Test
    public void testNumberOfValves() {
        Trumpet trumpet = new Trumpet("Loud Trumpet", 3, "Gold");
        int numberOfValves = trumpet.getNumberOfValves();
        assertEquals(3, numberOfValves);
    }

    @Test
    public void testTrumpetHasColour() {
        Trumpet trumpet = new Trumpet("Loud Trumpet", 3, "Gold");
        String colour = trumpet.colour();
        assertEquals("Gold", colour);
    }

//    @Test
//    public void testCanPlayTrumpet() {
//        Trumpet trumpet = new Trumpet("Loud Trumpet", 3, "Gold");
//        String play = trumpet.play();
//        assertEquals("Sound", play);
//    }
    // Or test trumpet makes sound?


}
