package org.udemekendrick;

import org.udemekendrick.duplicateNumbers.DuplicateNumbers;
import org.udemekendrick.maxProfit.MaxProfit;
import org.udemekendrick.rotateArray.RotateArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        RotateArray rotateArray = new RotateArray();
        System.out.println(Arrays.toString(rotateArray.rotate(nums, k)));
    }
}