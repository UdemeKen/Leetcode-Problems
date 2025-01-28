package org.udemekendrick.twoSum;

import java.util.Hashtable;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> sumIndex = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            if (sumIndex.containsKey(target - nums[i])) {
                return new int[]{sumIndex.get(target - nums[i]), i};
            }
            sumIndex.put(nums[i], i);
        }
        return null;
    }
}
