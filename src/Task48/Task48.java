package Task48;

import java.io.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task48 {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("d:/AntonKokhno/ak.txt");
        Pattern pattern = Pattern.compile("\\b[\\d]+\\b");
        Scanner scanner = new Scanner(new FileInputStream(file));
        int sumNumber = 0;
        Set<Integer> hashSet = new HashSet<>();
        System.out.println("Числа в тексте:");
        while (scanner.hasNext()) {
            Matcher matcher = pattern.matcher(scanner.nextLine());
            while (matcher.find()) {
                int number = Integer.parseInt(matcher.group());
                sumNumber += number;
                hashSet.add(number);
                System.out.println(number);
            }
        }
        System.out.println("Сумма чисел: " + sumNumber);
        System.out.println(" ");
        System.out.println("Числа в тексте, без повтора:");
        hashSet.iterator().forEachRemaining(System.out::println);

    }
}

