package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class SqrtTest {
    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(0);
        double result = sqrt.average(4.0, 4.0);
        assertEquals(result, 4.0);
    }

    @Test
    public void testGood() {
        Sqrt sqrt = new Sqrt(0);
        assertTrue(sqrt.good(1.41421356, 2.0));
        assertFalse(sqrt.good(1.0, 2.0));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(2.0);
        double result = sqrt.improve(1.0, 2.0);
        assertEquals(1.5, result);
    }

    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(2.0);
        double result = sqrt.iter(1.0, 2.0);
        assertEquals(1.41421356, result);
    }

    @Test
    public void testCalc() {
        Sqrt sqrt = new Sqrt(2.0);
        double result = sqrt.calc();
        assertEquals(1.41421356, result);
    }
}
