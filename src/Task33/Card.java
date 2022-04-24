package Task33;

public abstract class Card {
   protected int numberCard;
   protected String holderCard;
    protected String iban;



    public Card(int numberCard, String holderCard, String iban) {
        this.numberCard = numberCard;
        this.holderCard = holderCard;
        this.iban = iban;
        System.out.println("Основные данные карты: \n"+"Номер карты: "+ numberCard+ "\nДержатель карты: "+holderCard+
                "\nРасчетный счет: "+iban);
    }
    public void showBankingDetails(){
        System.out.println("Номер карты"+ numberCard+ "Держатель карты: "+holderCard+ "расчетный счет карты: "+iban);

    }
}
