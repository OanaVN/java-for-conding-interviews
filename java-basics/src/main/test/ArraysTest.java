package main.test;

import main.java.basics.Arrays;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysTest {

    @Test
    public void testArrayMaxFind() {
        int[] numbers = {4, 12, 33, 1, 67, 2, 0};
        assertEquals(67, Arrays.findMax(numbers));
    }

    @Test
    public void testFindMaxWithEmptyArray() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> Arrays.findMax(numbers));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithEmptyArrayExpected() {
        int[] numbers = null;
        Arrays.findMax(numbers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReverseArrayException() {
        int[] numbers = null;
        Arrays.reverseIntArray(numbers);
    }

    @Test
    public void testReverseArray() {
        int[] numbers = {5, 6, 2, 8};
        int[] expected = {8, 2, 6, 5};
        Arrays.reverseIntArray(numbers);
        assertArrayEquals(expected, numbers);
    }
}
