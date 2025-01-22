package org.udemekendrick.intersect;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 1/22/2025
 */
public class Intersect {

    Hashtable<Integer, Integer> nums1Map = new Hashtable<>();
    ArrayList<Integer> intersectAL = new ArrayList<>();
    public int[] intersect(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            if (nums1Map.containsKey(nums1[i])) {
                nums1Map.put(nums1[i], nums1Map.get(nums1[i]) + 1);
            } else {
                nums1Map.put(nums1[i], 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (nums1Map.containsKey(nums2[i])) {
                intersectAL.add(nums2[i]);
                nums1Map.put(nums2[i], nums1Map.get(nums2[i]) - 1);
                if (nums1Map.get(nums2[i]) == 0) {
                    nums1Map.remove(nums2[i]);
                }
            }
        }
        int[] result = new int[intersectAL.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = intersectAL.get(i);
        }
        return result;
    }
}
