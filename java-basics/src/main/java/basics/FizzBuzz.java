package main.java.basics;

public class FizzBuzz {

    public static String printFizzBuzz(int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                result += "FizzBuzz";
            } else if (i % 5 == 0) {
                result += "Buzz";
            } else if (i % 3 == 0) {
                result += "Fizz";
            } else {
                result += i;
            }
            if (i < n)
                result += " ";
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(printFizzBuzz(100));
    }
}
