package org.udemekendrick;

import org.udemekendrick.duplicateNumbers.DuplicateNumbers;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5,};
        DuplicateNumbers dn = new DuplicateNumbers();
        int answer = dn.removeDuplicates(nums);
        System.out.println(answer);
    }
}