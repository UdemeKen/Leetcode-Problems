package org.udemekendrick.duplicateNumbers;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 9/8/2024
 */

/*
    Given an integer array nums sorted in non-decreasing order, remove the duplicate in place such that each unique element appears only
    once. The relative order of the elements should be kept the same.

    Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the
    array nums. More formally, if there are K elements after removing the duplicates, then the first elements of nums should hold the final result.
    It does not matter what you leave beyond the first K elements.

    Return K after placing the final result in the first k slots of nums.

    Do not allocate extra space for another array. You must this by modifying the input array in-place with O(1) extra money.

 */
public class DuplicateNumbers {

public int removeDuplicates(int[] nums) {
    int lastUniqueIndex = 0;
    for (int i = 1; i < nums.length; i++) {
        if (nums[lastUniqueIndex] != nums[i]) {
            nums[lastUniqueIndex + 1] = nums[i];
            lastUniqueIndex++;
        }
    }
    return lastUniqueIndex + 1;
}
}
