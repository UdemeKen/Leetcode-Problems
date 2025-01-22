package org.udemekendrick;

import org.udemekendrick.containsDuplicate.ContainsDuplicate;
import org.udemekendrick.singleNumber.SingleNumber;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 7, 3, 5, 6, 7, 5};
        SingleNumber sn = new SingleNumber();
        int result = sn.singleNumber(nums);
        System.out.println(result);
    }
}