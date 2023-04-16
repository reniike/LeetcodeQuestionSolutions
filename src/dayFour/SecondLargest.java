package dayFour;

public class SecondLargest {
    public static int findSecondLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            }
            if (numbers[i] < largest && numbers[i] > secondLargest) secondLargest = numbers[i];
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(findSecondLargest(new int[]{1, 4, 6, 5}));
    }
}
