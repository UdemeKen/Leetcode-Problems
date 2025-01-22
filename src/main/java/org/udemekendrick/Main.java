package org.udemekendrick;

import org.udemekendrick.containsDuplicate.ContainsDuplicate;
import org.udemekendrick.intersect.Intersect;
import org.udemekendrick.singleNumber.SingleNumber;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {3, 7, 3, 5, 6, 7, 5};
        int[] nums2 = {5, 3, 8, 4, 6,};
        Intersect intersect = new Intersect();
        int[] result = intersect.intersect(nums1, nums2);
        System.out.println("The returned array: " + Arrays.toString(result));
    }
}