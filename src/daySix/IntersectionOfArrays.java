package daySix;

import java.util.*;

public class IntersectionOfArrays {
    public static List<Integer> intersection(int[][] numbers) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers[0].length; i++) {
            int counter = 0;
            for (int j = 1; j < numbers.length; j++) {
                int count = 0;
                for (int k = 0; k < numbers[j].length; k++) {
                    if (numbers[0][i] == numbers[j][k]) count++;
                }
                if (count > 0) counter++;
            }
            if (counter == 2) result.add(numbers[0][i]);
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(intersection(new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}}));
    }
}
