package conditionalStatementsQuestions;

import java.util.ArrayList;
import java.util.List;

public class NumberToArray {
    public static int[] numberToArray(int number){
        String num = String.valueOf(number);
//        int[] result = new int[num.length()];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < num.length(); i++) {
            result.add(num[i]);
        }
    }




    public static void main(String[] args) {

    }
}
