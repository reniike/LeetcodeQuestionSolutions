package chapterSeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacci(10);
    }

    private static void fibonacci(int num){
        int[] fibonacci = new int[num];
//        List<Integer> fibonacci = new ArrayList<>();
        int first = 0;
        int second = 1;
//        int sum = 0;
        fibonacci[0] = first;
        fibonacci[1] = second;
/*
        fibonacci.add(first);
        fibonacci.add(second);
*/
        for (int i = 2; i < num; i++) {
//            fibonacci[9] + fibonacci[8]
            int fib = fibonacci[i-1] + fibonacci[i - 2];
            fibonacci[i]= fib;
/*
            fibonacci.add(fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2));
            sum = first + second;
            fibonacci.add(sum);
            first = second;
            second = sum;
*/
        }
        System.out.println(Arrays.toString(fibonacci));
//        System.out.println(fibonacci.get(num));
    }
}


//7.29 (Fibonacci Series) The Fibonacci series
//        0, 1, 1, 2, 3, 5, 8, 13, 21, …
//        begins with the terms 0 and 1 and has the property that each succeeding term is the sum of the two
//        preceding terms.
//        a) Write a method fibonacci(n) that calculates the nth Fibonacci number. Incorporate
//        this method into an application that enables the user to enter the value of n
