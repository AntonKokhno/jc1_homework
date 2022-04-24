package Task35_36_37;

import java.util.Scanner;

public enum Seasons {
    WINTER("Идет снег", 90), SPRING("распускаются листья", 92),
    SUMMER("Жарит солнце", 92), AUTUMN("Падают листья", 91);

    Seasons(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    private final String description;
    private final int countOfDays;

    //    Task35
    private static void outputEnum() {
        System.out.println("Время года " + WINTER.name() + " " + Seasons.WINTER.getDescription() +
                " Количество дней в сезоне " + WINTER.getCountOfDays() + " д.");
        System.out.println("Время года " + SPRING.name() + " " + Seasons.SPRING.getDescription() +
                " Количество дней в сезоне " + SPRING.getCountOfDays() + " д.");
        System.out.println("Время года " + SUMMER.name() + " " + Seasons.SUMMER.getDescription() +
                " Количество дней в сезоне " + SUMMER.getCountOfDays() + " д.");
        System.out.println("Время года " + AUTUMN.name() + " " + Seasons.AUTUMN.getDescription() +
                " Количество дней в сезоне " + AUTUMN.getCountOfDays() + " д.");
    }

    //    Task36
    private static void nextSeason() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сезон года(WINTER,SPRING,SUMMER,AUTUMN)");
        switch (Seasons.valueOf(scanner.next())) {
            case WINTER: {
                System.out.println("Следуюший сезон от заданного " + SPRING.name());
            }
            break;
            case SPRING:
                System.out.println("Следуюший сезон от заданного " + SUMMER.name());
                break;
            case SUMMER:
                System.out.println("Следуюший сезон от заданного " + AUTUMN.name());
                break;
            case AUTUMN:
                System.out.println("Следуюший сезон от заданного " + WINTER.name());
                break;
            default:
                System.out.println("Нет такого сезона года");

        }
    }

    //    Task37
    private static void sumDaySeasons() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сезон года(WINTER,SPRING,SUMMER,AUTUMN)");
        switch (Seasons.valueOf(scanner.next())) {
            case WINTER:
                System.out.println("Сумма дней в сезоне " + WINTER.getCountOfDays());
                break;
            case SPRING:
                System.out.println("Сумма дней в сезоне " + SPRING.getCountOfDays());
                break;
            case SUMMER:
                System.out.println("Сумма дней в сезоне " + SUMMER.getCountOfDays());
                break;
            case AUTUMN:
                System.out.println("Сумма дней в сезоне " + AUTUMN.getCountOfDays());
                break;
            default:
                System.out.println("Нет такого сезона года");

        }
    }

    public static void main(String[] args) {
        outputEnum();
        nextSeason();
        sumDaySeasons();
    }
}

