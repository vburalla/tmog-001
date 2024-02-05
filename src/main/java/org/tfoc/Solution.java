package org.tfoc;

import java.util.HashMap;
import java.util.Map;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static int[] twoSum(
            int[] nums,
            int target) {

        int[] solution = new int[]{};
        if(nums.length > 0) {

            Map<Integer, Integer> visited = new HashMap<>();
            visited.put(target - nums[0], 0);
            int i = 1;
            boolean found = false;
            while(i < nums.length && !(found = visited.containsKey(nums[i]))) {
                    visited.put(target - nums[i], i);
                    i++;
            }
            if(found)
                solution = new int[]{visited.get(nums[i]), i};
        }
        return solution;
    }

}
