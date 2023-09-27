package leetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindTheDifference {
    public static char findTheDifference(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;

        for (char each: s.toCharArray()) {
            sum1 = sum1 + each;
        }
        for (char each : t.toCharArray()) {
            sum2 = sum2 + each;
        }
        return (char) (sum2 - sum1);
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcdef"));
    }
}

