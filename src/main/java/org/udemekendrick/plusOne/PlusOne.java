package org.udemekendrick.plusOne;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 1/27/2025
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int currentDigit = digits.length - 1;
        while (digits[currentDigit] == 9) {
            if (currentDigit == 0) {
                int[] newArray = new int[digits.length + 1];
                newArray[0] = 1;
                return newArray;
            }
            digits[currentDigit] = 0;
            currentDigit--;
        }
        digits[currentDigit]++;
        return digits;
    }
}
