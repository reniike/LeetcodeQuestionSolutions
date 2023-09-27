package conditionalStatementsQuestions;

public class NegativePositive {
    public static void main(String[] args) {
        System.out.println(PositiveOrNegative(-1));
    }

    private static boolean PositiveOrNegative(int number){
        boolean isPositive = true;
        if (number < 0) return false;
        if(number > 0) return true;
        return isPositive;
    }
}
