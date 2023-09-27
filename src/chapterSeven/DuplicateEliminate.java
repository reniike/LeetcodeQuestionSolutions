package chapterSeven;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DuplicateEliminate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        Arrays.fill(arr, -1);
        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number between 10 and 100: ");
            int userInput = input.nextInt();
            if (userInput >= 10 && userInput <= 100) {
                if (arr[i] == -1) arr[i] = userInput;
            }
            if (!newArr.contains(arr[i])) newArr.add(arr[i]);
        }
        System.out.println(newArr);
    }
}

//{12,34,56,78,90}
