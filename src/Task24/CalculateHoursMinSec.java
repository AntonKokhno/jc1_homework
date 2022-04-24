package Task24;

public class CalculateHoursMinSec {
    public static void calculateAll(Arguments args2) {
        int sumSecAll = CalculateSec.calculateSec(args2);
        int sec = sumSecAll % 60;
        int m = (sumSecAll - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        System.out.println(h + "час." + min + "мин." + sec + "сек.");
    }

}