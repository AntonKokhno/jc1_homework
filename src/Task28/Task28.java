package Task28;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        Pattern pattern = Pattern.compile("[a-zа-я]\\b");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        while (matcher.find()) {
            System.out.print(matcher.group());
        }
    }
}
