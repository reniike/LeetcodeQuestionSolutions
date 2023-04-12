package day1;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] myArr = {
                {'x', 'o', 'e'},
                {'o', 'o', 'x'},
                {'x', 'o', 'o'}
        };


        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                System.out.print(myArr[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }

        convertToNumber(myArr);
    }

    public static char[][] convertToNumber(char[][] multi) {
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                if (multi[i][j] == 'x') {
                    multi[i][j] = '1';
                }
                if (multi[i][j] == 'o') {
                    multi[i][j] = '0';
                }
                System.out.print(multi[i][j]);
                System.out.print("  ");
            }
                System.out.println();
            }
         return multi;
        }
    }