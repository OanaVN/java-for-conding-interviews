package main.test;

import main.java.basics.TrianglePattern;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TrianglePatternTest {

    @Test
    public void testGetTriangle() {
        assertEquals("1 \n2 3 \n4 5 6 \n7 8 9 10 \n", TrianglePattern.getTriangleString(4));
    }

    @Test
    public void extraSpaceOutput() {
        assertNotEquals("1 \n2 3 \n4 5 6 \n7 8 9 10 \n ", TrianglePattern.getTriangleString(4));
    }
}
