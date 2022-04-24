package Task33;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите карту для создания(1-дебетовая карта, 2- кредитная карта, 3- виртуальная карта)");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1: {
                detailsDebitCards();
            }
            break;
            case 2: {
                detailsCreditCards();
            }
            break;
            case 3: {
                detailsVirtualCards();
            }
            break;
            default:
                System.out.println("не правильный выбор");
        }
    }


    private static void detailsVirtualCards() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Создайте номер карты: ");
        int numberCard = scanner.nextInt();
        System.out.println("Укажите владельца карты: ");
        String holderCard = scanner.next();
        System.out.println("Создайте расчетный счет карты: ");
        String iban = scanner.next();
        VirtualCard virtualCard = new VirtualCard(numberCard, holderCard, iban);
        System.out.println("Хотите привязать карту в googlePlay(1-да, 2-нет)");
        if (scanner.nextInt() == 1) {
            virtualCard.linkCard();
        } else System.out.println("карта не привязана");
    }

    private static void detailsCreditCards() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Создайте номер карты: ");
        int numberCard = scanner.nextInt();
        System.out.println("Укажите владельца карты: ");
        String holderCard = scanner.next();
        System.out.println("Создайте расчетный счет карты: ");
        String iban = scanner.next();
        CreditCard creditCard = new CreditCard(numberCard, holderCard, iban);
        System.out.println("Выберите валюту карты: ");
        creditCard.currency = scanner.next();
        creditCard.showBankingDetails();
        creditCard.takeMoneyATM();
        System.out.println("Желаете взять кредит?(1-да, 2-нет): ");
        if (scanner.nextInt() == 1) {
            System.out.println("Введите сумму кредита");
            creditCard.takeCredit(scanner.nextInt());
        } else System.out.println("Запроса на кредит не было");
    }

    private static void detailsDebitCards() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Создайте номер карты: ");
        int numberCard = scanner.nextInt();
        System.out.println("Укажите владельца карты: ");
        String holderCard = scanner.next();
        System.out.println("Создайте расчетный счет карты: ");
        String iban = scanner.next();
        DebitCard card = new DebitCard(numberCard, holderCard, iban);
        System.out.println("Создайте цвет карты: ");
        card.color = scanner.next();
        System.out.println("Создайте пин код карты: ");
        card.pin = scanner.nextInt();
        card.showBankingDetails();
        card.takeMoneyATM();
        System.out.println("Хотите сделать карту зрплатной?(1-да, 2-нет)");
        if (scanner.nextInt() == 1) {
            card.makeSalaryCard();
        } else {
            System.out.println("Карта не зарплатная");
        }
    }
}
