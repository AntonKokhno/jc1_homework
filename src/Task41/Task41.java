package Task41;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task41 {
    public static void main(String[] args) {
        List<Integer> schoolGrades = new ArrayList<>();
        Random randomNumber = new Random();
        for (int i = 0; i<15; i++) {
            schoolGrades.add(randomNumber.nextInt(11));
        }
        System.out.println("Список оценок");
        System.out.println( schoolGrades);
        int maxGrade = schoolGrades.get(0);
        Iterator<Integer> iterator = schoolGrades.iterator();
        while (iterator.hasNext()) {
            int maxSearch = iterator.next();
            if (maxSearch > maxGrade) {
                maxGrade = maxSearch;
            }
        }
        System.out.println("Самая высокая оценка: " + maxGrade);
    }
}