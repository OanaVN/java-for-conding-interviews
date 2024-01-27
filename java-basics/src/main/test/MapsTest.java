package main.test;

import main.java.basics.Maps;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MapsTest {

    @Test
    public void testTwoSum() throws IllegalAccessException {
        assertArrayEquals(new int[]{0, 3}, Maps.findTwoSum(new int[]{2, 3, 5, 9, 1}, 11));
    }
}
