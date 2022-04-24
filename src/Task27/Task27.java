package Task27;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите текст");
        Pattern pattern= Pattern.compile("\\b[^0-9]");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        int count=0;
        while (matcher.find()){
            count++;
        }
        int i=count/2;
        System.out.println("Количество слов в введнном тексте = "+ i);

    }
}
