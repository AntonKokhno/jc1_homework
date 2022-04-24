package Task25;

public class Main {

    public static void main(String[] args) {
        ATM atm = new ATM(0, 0, 0);
        atm.addMoney("hundred", 10 );
        atm.addMoney("twenties",10 );
        atm.addMoney("fifties", 10);
        atm.getOstatok();


        System.out.println(atm.getMoney(390));
        System.out.println(atm.getHaveSum());



    }

}
