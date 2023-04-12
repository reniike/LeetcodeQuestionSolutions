package day1;

public class ArraysTargetAddition {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 5, 11, 15};
        int target = 26;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    System.out.printf("%s%d, %d%s %s", "[", i, j, "]", " ");
                }
            }
        }
    }

}
