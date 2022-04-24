package Task33;

public class VirtualCard extends Card{

    public VirtualCard(int numberCard, String holderCard, String iban) {


        super(numberCard, holderCard, iban);
    }

    public  void linkCard(){
        System.out.println("Вы привязали карту");

    }
    public void showBankingDetails(){

    }

}
