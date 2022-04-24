package Task24;

public class Difference {

    public int compareTo(Arguments args, Arguments args2) {
        if (CalculateSec.calculateSec(args) > CalculateSec.calculateSec(args2)) {
            System.out.println("Первый интервал больше");
            return CalculateSec.calculateSec(args) - CalculateSec.calculateSec(args2);
        } else if (CalculateSec.calculateSec(args) < CalculateSec.calculateSec(args2)) {
            System.out.println("Второй интервал больше");
            return CalculateSec.calculateSec(args) - CalculateSec.calculateSec(args2);
        } else {
            System.out.println("Интервалы равны");
            return 0;
        }
    }
}

