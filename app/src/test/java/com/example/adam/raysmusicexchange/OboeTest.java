package com.example.adam.raysmusicexchange;

import com.example.adam.raysmusicexchange.Brass.Trumpet;
import com.example.adam.raysmusicexchange.WoodWind.Oboe;

import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Created by adam on 05/11/2017.
 */

public class OboeTest {


    @Test
    public void hasName() {
        Oboe oboe = new Oboe("Funky Oboe", 3);
        String name = oboe.name();
        assertEquals("Funky Oboe", name);

    }

    @Test
    public void checkNumberOfKeys() {
        Oboe oboe = new Oboe("Funky Oboe", 3);
        int numberOfKeys = oboe.getNumberOfKeys();
        assertEquals(3, numberOfKeys);
    }

}
