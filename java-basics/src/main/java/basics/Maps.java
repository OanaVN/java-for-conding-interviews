package main.java.basics;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static int[] findTwoSum(int[] numbers, int target) throws IllegalAccessException {
        if(numbers == null || numbers.length < 2) {
            throw new IllegalAccessException("please add an array with at least 2 elements");
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i <= numbers.length - 1; i++) {
            int complement = target - numbers[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(numbers[i], i);
        }
        return new int[]{-1,-1};
    }
}
