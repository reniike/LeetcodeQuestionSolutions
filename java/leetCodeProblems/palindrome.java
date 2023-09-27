package leetCodeProblems;

public class palindrome {
    private static boolean checkPalindrome(int numbers) {
        if (numbers < 0) {
            return false;
        }
       StringBuilder builder = new StringBuilder();
        builder.append(numbers);
        builder.reverse();
    
        if (builder.toString().equals(String.valueOf(numbers))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(0220));
    }
    
}
