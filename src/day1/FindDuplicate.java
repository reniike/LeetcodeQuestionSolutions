package day1;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {

    public static List<Integer> findDuplicate(int[] nums) {
        List<Integer> duplicate = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = 0;
            for (int j = 0; j < nums.length; j++) if (nums[i] == nums[j]) index++;
            if (index > 1) if (!duplicate.contains(nums[i])) duplicate.add(nums[i]);
        }
        return duplicate;
    }

    public static void main(String[] args) {
        int[] number = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicate(number));
    }
}