package Task47;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task47 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileText = new File("d:/AntonKokhno/ak.txt");
        Scanner sc = new Scanner(new FileInputStream(fileText));
        int countWords = 0;
        while (sc.hasNext()) {
            sc.next();
            countWords++;
        }
        System.out.println("Number of words: " + countWords);
        Pattern pattern = Pattern.compile("[!.,;:?\\-]");
        Scanner scanner = new Scanner(new FileInputStream(fileText));
        int countPunctuation = 0;
        while (scanner.hasNext()) {
            Matcher matcher = pattern.matcher(scanner.nextLine());
            while (matcher.find()) {
                countPunctuation++;
            }
        }
        System.out.println("Punctuation marks: " + countPunctuation);
    }
}
