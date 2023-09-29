package leetcodeQuestions;

import java.util.Arrays;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex] = num;
                evenIndex++;
            }
        }

        for (int num : nums) {
            if (num % 2 != 0) {
                result[evenIndex] = num;
                evenIndex++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{1, 2, 3, 4})));
    }
}
