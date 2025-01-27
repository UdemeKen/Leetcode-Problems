package org.udemekendrick;

import org.udemekendrick.containsDuplicate.ContainsDuplicate;
import org.udemekendrick.intersect.Intersect;
import org.udemekendrick.plusOne.PlusOne;
import org.udemekendrick.singleNumber.SingleNumber;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 9};
        PlusOne plusOne = new PlusOne();
        int[] result = plusOne.plusOne(nums1);
        System.out.println(Arrays.toString(result));
    }
}