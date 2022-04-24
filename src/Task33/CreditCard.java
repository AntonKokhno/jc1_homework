package Task33;

public class CreditCard extends Card implements Takeable{
    String currency;

    public CreditCard(int numberCard, String holderCard, String iban) {
        super(numberCard, holderCard, iban);
    }

    @Override
    public void takeMoneyATM() {
        Takeable.super.takeMoneyATM();
    }

    public void takeCredit(int sumCredit){
        System.out.println("Запрос кредита на сумму: "+ sumCredit+ " будет рассмотрен");
    }
    public void showBankingDetails(){
        System.out.println("Дполнительные данные для выбранной карты\n"+"валюта карты: "+currency);
    }
}
