package Task32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HouseholdAppliances householdAppliances = new HouseholdAppliances();
        WashingMachine washingMachine = new WashingMachine();
        KitchenAppliances kitchenAppliances = new KitchenAppliances();
        Tv tv = new Tv();
        System.out.println("Выбериите категорию бытовой техники(1-Стиральные машины,2- Телевизоры, 3-Кухонная техника)");
        switch (scanner.nextInt()) {
            case 1: {
                washingMachine.name = "Стиральные машины";
                System.out.println("Вы в разделе:" + washingMachine.name + "\n Введите марку");
                washingMachine.brend = scanner.next();
                System.out.println("Вы выбрали марку: " + washingMachine.brend);
                System.out.println("хотите включить прибор в сеть для проверки(1-да; 2-нет)");
                if (scanner.nextInt() == 1) {
                    householdAppliances.applyVoltage();
                } else {
                    System.out.println("Прибор не подключен к сети");
                }
            }
            break;
            case 2: {
                tv.name = "Телевизоры";
                System.out.println("Вы в разделе:" + tv.name + "\n Введите  диагональ");
                tv.diagonal = scanner.nextInt();
                System.out.println("хотите включить прибор в сеть(1-да; 2-нет)");
                if (scanner.nextInt() == 1) {
                    householdAppliances.applyVoltage();
                } else {
                    System.out.println("Прибор не подключен к  сети");
                }
            }
            break;
            case 3: {
                kitchenAppliances.name = "Кухонная техника";
                System.out.println("Вы в разделе:" + kitchenAppliances.name + "\n Выберите мощность прибора");
                kitchenAppliances.power = scanner.nextInt();
                System.out.println("хотите включить прибор в сеть(1-да; 2-нет)");
                if (scanner.nextInt() == 1) {
                    householdAppliances.applyVoltage();
                } else {
                    System.out.println("Прибор не подключен к  сети");
                }
            }
            break;
        }
    }
}
