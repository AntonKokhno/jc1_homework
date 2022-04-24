package Task29;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        findNumers16();
    }

    private static void findNumers16() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для проверки шестнадцатиричных чисел в строке");
        String pattern = "^[\\da-fA-F]{1,16}";
        String input = scanner.nextLine();
        String inputReplace= input.replaceAll("0X","0x");
        String[] split= inputReplace.split("0x");
        for (int i= 1;i< split.length; i++) {
            Pattern pattern1 =Pattern.compile(pattern);
            Matcher matcher= pattern1.matcher(split[i]);
            if (matcher.find()) {
                System.out.println("0x"+ matcher.group());
            }

        }
    }
}
