package Two_sum;

import java.util.HashMap;
import java.util.Map;

public class Two_sum_N2 {
    static int[] Two_sum(int[] number, int Target) {
        int[] result = new int[2]; // This array will hold the indices of the two numbers that sum to Target.
        Map<Integer, Integer> map = new HashMap<>(); // A HashMap to store numbers and their indices.
        
        for (int i = 0; i < number.length; i++) { // Loop through the 'number' array.
            // Check if the complement (Target - number[i]) is already in the map.
            if (map.containsKey(Target - number[i])) {
                result[1] = i; // The current index (i) is one of the result indices.
                result[0] = map.get(Target - number[i]); // Get the index of the complement from the map.
                return result; // Return the result array containing the indices of the two numbers.
            }
            // If the complement is not in the map, store the current number and its index in the map.
            map.put(number[i], i);
        }
        return result; // If no pair is found, return the default result array (0, 0).
    }
}


//Time Complexity: O(n);
//Space Complexity :O(n);
