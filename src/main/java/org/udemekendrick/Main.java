package org.udemekendrick;

import org.udemekendrick.duplicateNumbers.DuplicateNumbers;
import org.udemekendrick.maxProfit.MaxProfit;

public class Main {
    public static void main(String[] args) {
        int[] prices = {6, 2, 4, 8, 5, 3, 9};
        MaxProfit maxProfit = new MaxProfit();
        int profit = maxProfit.maxProfit(prices);
        System.out.println(profit);
    }
}