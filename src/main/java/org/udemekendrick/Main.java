package org.udemekendrick;

import org.udemekendrick.duplicateNumbers.DuplicateNumbers;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5};

        DuplicateNumbers duplicateNumbers = new DuplicateNumbers();
        int result = duplicateNumbers.removeDuplicates(nums);
        System.out.println(result);
    }
}