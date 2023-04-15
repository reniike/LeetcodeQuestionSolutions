package dayThree;

import java.util.ArrayList;
import java.util.List;

public class ListOfProducts {
    public static List<Integer> findListOfProducts(int[] numbers) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int product = 1;
            for (int j = 0; j < numbers.length; j++) {
                if (!(numbers[i] == numbers[j])) {
                    product *= numbers[j];
                }
            }
            arr.add(product);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(findListOfProducts(new int[]{4, 2, 1, 5, 0}));
    }
}


