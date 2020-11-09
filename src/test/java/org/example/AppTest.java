package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void zeroLessThenOne() {
        int greatter= App.max(1,0);
        assertEquals(1,greatter);
    }

    @Test
    public void zeroLessThenOnereverced() {
        int greatter= App.max(0,1);
        assertEquals(1,greatter);
    }
    @Test
    public void fail() {
        int greatter= App.max(1,3);
        assertEquals(0,greatter);
    }
}
