package dayTwo;

public class DecimalAndBinary {
    private static String numberToBinary(int number) {
        int result;
        String concat = " ";
        while (number != 0) {
            result = number % 2;
            number = number / 2;
            concat = result + concat;
        }
        return concat;
    }

    private static int convertToDecimal(String binary) {
        int result = 0;
        int count = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int square = 1;
            for (int j = 0; j < i; j++) {
                square *= 2;
            }
            result += square * Integer.parseInt(String.valueOf(binary.charAt(count)));
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numberToBinary(45));
        System.out.println(convertToDecimal("101101"));
    }
}

