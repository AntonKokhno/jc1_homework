package Task33;

public class DebitCard extends Card implements Takeable{
    String color;
    int pin;
    public DebitCard(int numberCard, String holderCard1,String iban){
        super(numberCard, holderCard1,iban);

    }

    public void showBankingDetails(){
        System.out.println("Дполнительные данные для выбранной карты\n"+"Цвет карты: "+color+ "\nПин код: "+pin);
    }



    public  void makeSalaryCard(){
        System.out.println("Зарплатная карта");

    }


}
