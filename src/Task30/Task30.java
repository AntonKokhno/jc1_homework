package Task30;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        findings();
    }

    private static void findings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для проверки замены тегов:");
        String input = scanner.nextLine();
        String inputReplace = input.replaceAll
                ("[<]p\\s[0-9a-zA-Zа-яА-я]*[=][\"][0-9a-zA-Zа-яА-я]*[\"][>]", "<p>");
        System.out.println(inputReplace);
    }
}
