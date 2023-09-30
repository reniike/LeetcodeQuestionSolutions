package leetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        List<Integer> integerList = new ArrayList<>();
        List<Integer> evenNums = new ArrayList<>();
        List<Integer> oddNums = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenNums.add(nums[i]);
            }

            if (nums[i] % 2 != 0) {
                oddNums.add(nums[i]);
            }
        }
        integerList.addAll(evenNums);
        integerList.addAll(oddNums);

        int[] result = new int[integerList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = integerList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{1, 2, 3, 4})));
    }
}
