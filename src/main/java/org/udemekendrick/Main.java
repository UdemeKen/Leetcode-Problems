package org.udemekendrick;

import org.udemekendrick.containsDuplicate.ContainsDuplicate;
import org.udemekendrick.intersect.Intersect;
import org.udemekendrick.plusOne.PlusOne;
import org.udemekendrick.singleNumber.SingleNumber;
import org.udemekendrick.twoSum.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 9, 7, 3};
        int target = 11;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums1, target);
        System.out.println(Arrays.toString(result));
    }
}
