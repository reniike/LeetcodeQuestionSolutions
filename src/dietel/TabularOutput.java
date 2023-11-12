package dietel;

public class TabularOutput {
    public static void main(String[] args) {

        System.out.printf("%-3s %-4s %-5s %-6s %n", "N", "N2", "N3", "N4");

        int count = 1;
        for (int i = 1; i <= 5 ; i++) {
            int first = count * i;
            int second = first * first;
            int third = first * second;
            int fourth = third * first;

            System.out.printf("%-3s %-4s %-5s %-6s %n", first, second, third, fourth);
        }
    }
}
