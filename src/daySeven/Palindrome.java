package daySeven;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(0220));
    }
        public static boolean isPalindrome(int x) {
            System.out.println(x);
            if(x<0 || x!=0 && x%10 ==0) return false;
            int check=0;
            while(x>check){
                check = check*10 + x%10;
                x/=10;
            }
            return (x==check || x==check/10);
    }
}
