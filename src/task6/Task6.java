package task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Введите число");
        int w = f.nextInt();
        int se = w % 10;
        boolean sed = se == 7;
        System.out.println(sed);
        if (sed) {
            System.out.println(" заданное значение " + w + " содержит на конце цифру 7");
        } else {
            System.out.println(" заданное значение " + w + " не содержит на конце цифру 7");
        }
    }
}
