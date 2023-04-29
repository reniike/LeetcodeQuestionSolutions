package dayFour;

import java.util.ArrayList;
import java.util.List;

public class DifferenceInTwoArrays {
    private static List<List<Integer>> difference(int[] nums1, int[] nums2) {
        List<List<Integer>> multi = new ArrayList<>();
        multi.add(new ArrayList<>());

        for (int i = 0; i < nums1.length; i++) {
            int count = 0;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    count++;
                }
            }
            if (count == 0) {
                multi.get(0).add(nums1[i]);
            }
        }

        multi.add(new ArrayList<>());
        for (int k : nums2) {
            int count = 0;
            for (int j = 0; j < nums2.length; j++) {
                if (k == nums1[j]) {
                    count++;
                }
            }
            if (count == 0) {
                multi.get(1).add(k);
            }
        }
        return multi;
    }


    public static void main(String[] args) {
        System.out.println(difference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}));
    }
}

