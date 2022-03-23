package Task17;

import java.util.Scanner;

public class Task17 {


    private static final String EMPTY = " ";
    private static final char MINUS = '-';

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите число");

        Long number = num.nextLong();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilderFinish = stringBuilder.append(number);
        int checkElement = 0;
        for (int i = stringBuilderFinish.length(), j = 0; i > 0; i--, j++) {
            if (checkElement % 3 == 0 && checkElement != 0 && j % 3 == 0 || j == 3) {
                if (stringBuilder.charAt(i - 1) == MINUS) {
                    Integer minus;
                } else {
                    stringBuilderFinish.insert(i, EMPTY);
                    checkElement += 3;

                }
            }

        }
        System.out.println(stringBuilderFinish);

    }
}

