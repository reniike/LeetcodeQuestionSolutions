package dayTwo;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] numbers = {10, 12, 3, 4};
        int[] reversedArray = new int[numbers.length];

        int counter = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            reversedArray[i] = numbers[counter];
            counter--;
        }
        System.out.println(Arrays.toString(reversedArray));
    }

}
