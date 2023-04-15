package dayThree;

public class findUniqueNumber {
    public static int findFirstUnique(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) count++;
            }
            if (count == 1) {
                result = numbers[i];
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findFirstUnique(new int[]{4, 5, 1, 2, 0, 4}));
    }

}

