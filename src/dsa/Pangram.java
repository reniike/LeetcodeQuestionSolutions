package dsa;

import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {
        System.out.println(checkPangram(
                """
                        I love eating pizza"""));
    }

    public static boolean checkPangram(String sentence) {
        String[] alphabets = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
                "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int count = 0;
        boolean isPangram = false;
        String[] sentenceLetters = sentence.split("");
        String upperCaseLetters = Arrays.toString(sentenceLetters).toUpperCase();

        for (int i = 0; i < alphabets.length; i++) {
            if (upperCaseLetters.contains(alphabets[i])){
                count++;
                if (count == 26) isPangram = true;
            }
        }
        return isPangram;
    }
}


