
package Task24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Общее количество секунд первого интервала!");
        System.out.println("Введите количество секунд:");
        Arguments arguments = new Arguments(scanner.nextInt());
        System.out.println();
        System.out.println("Второй  интервал времени в : часах, минутах, секундах");
        System.out.println("Введите количество часов");
        int hours = scanner.nextInt();
        System.out.println("Введите количество минут");
        int minutes = scanner.nextInt();
        System.out.println("Введите количество секунд");
        int seconds = scanner.nextInt();
        Arguments arguments1 = new Arguments(hours, minutes, seconds);
        CalculateHoursMinSec.calculateAll(arguments1);
        Difference difference = new Difference();
        int diff = difference.compareTo(arguments, arguments1);
        System.out.println(diff);

    }

}
