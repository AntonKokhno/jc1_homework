package Task11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите номер дня недели(от 1 до 7)");

        int console = number.nextInt();

        switch (console) {
            case 1:
                System.out.println("Расписание на понедельник:");
                System.out.println("Проверить состояние и основные показатели газовой котельной");
                break;
            case 2:
                System.out.println("Расписание на вторник:");
                System.out.println("Составить список необходимых запчастей для провдения ремонтных работ");
                break;
            case 3:
                System.out.println("Расписание на среду:");
                System.out.println("Получить коммерческие предложения на материал ");
                break;
            case 4:
                System.out.println("Расписание на четверг:");
                System.out.println("Организовать работу подрядной организации ");
                break;
            case 5:
                System.out.println("Расписание на пятницу:");
                System.out.println("Принять ремонтные работы ");
                break;
            case 6:
                System.out.println("Расписание на субботу:");
                System.out.println("Уделить время семъе");
                break;
            case 7:
                System.out.println("Расписание на воскресенье:");
                System.out.println("Изучение языка программирования Java ");
                break;
            default:
                System.out.println("Дня с таким номером недели еще не придумали");

        }

    }

}
