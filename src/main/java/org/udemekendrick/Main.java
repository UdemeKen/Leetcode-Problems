package org.udemekendrick;

import org.udemekendrick.containsDuplicate.ContainsDuplicate;
import org.udemekendrick.duplicateNumbers.DuplicateNumbers;
import org.udemekendrick.maxProfit.MaxProfit;
import org.udemekendrick.rotateArray.RotateArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 5, 6, 7};
        ContainsDuplicate cd = new ContainsDuplicate();
        boolean result = cd.containsDuplicate(nums);
        System.out.println(result);
    }
}