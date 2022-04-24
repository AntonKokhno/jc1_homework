package Task26;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст, со знаками припинания");
        Scanner scanner = new Scanner(System.in);
        Pattern pattern= Pattern.compile("[.,?!:;(<>)]");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        int count=0;
        while (matcher.find()){
            count++;

        }
        System.out.println("Количество знаков припинания в введенном вами тексте = "+ count);


    }
}
