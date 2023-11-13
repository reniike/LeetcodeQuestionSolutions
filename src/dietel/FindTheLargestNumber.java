package dietel;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        System.out.println(findLargestNumber(new int[]{23, 4, 7, 8}));
    }

    public static int findLargestNumber(int[] numbers){
        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) largest = numbers[i];
        }
        return largest;
    }
}
