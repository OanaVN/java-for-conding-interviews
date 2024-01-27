package main.test;

import main.java.basics.NumberReverser;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberReversedTest {

    @Test
    public void testReverse() {
        assertEquals(4321, NumberReverser.reverse(1234));
    }
}
