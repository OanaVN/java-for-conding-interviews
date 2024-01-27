package main.java.basics;

public class Calculator {
    public static int add (int a, int b) {
        return a + b;
    }

    public static int substract (int a, int b) {
        return a - b;
    }

    public static int multiply (int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
