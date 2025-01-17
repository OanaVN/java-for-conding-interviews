package main.java.basics;

public class Arrays {
    public static int findMax(int[] numbers) {
        if(numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("array must contain at least one element");
        }

        int max = numbers[0];

        for (int i = 1; i <= numbers.length - 1; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static void reverseIntArray(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("array must not be null");
        }

        int startIndex = 0;
        int endIndex = numbers.length - 1;

        while (startIndex < endIndex) {
            int tmp = numbers[startIndex];
            numbers[startIndex] = numbers[endIndex];
            numbers[endIndex] = tmp;

            startIndex++;
            endIndex--;
        }

    }
}
