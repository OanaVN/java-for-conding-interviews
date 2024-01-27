package main.test;

import main.java.basics.Calculator;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2,3));
    }

    public static Stream<Object[]> dataProviderForAdd() {
        return Stream.of(
                new Object[]{1, 2, 3},
                new Object[]{2, 4, 6},
                new Object[]{-1, 1, 0},
                new Object[]{11, 2, 13}
        );
    }

    @ParameterizedTest
    @MethodSource("dataProviderForAdd")
    public void testAddWithDataProviders(int a, int b, int excepted) {
        assertEquals(excepted, Calculator.add(a, b));
    }

    @Test
    public void testSubstract() {
        assertEquals(1, Calculator.substract(3,2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, Calculator.multiply(2,3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.divide(6,3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideBy0() {
        Calculator.divide(6,0);
    }
}
