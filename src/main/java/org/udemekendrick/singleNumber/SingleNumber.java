package org.udemekendrick.singleNumber;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 1/22/2025
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int finder = 0;
        for (int i = 0; i < nums.length; i++) {
            finder ^= nums[i];
        }
        return  finder;
    }
}
