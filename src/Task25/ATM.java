package Task25;

public class ATM {


    private int hundred;
    private int twenties;
    private int fifties;
    private int haveSum;


    public final static String HUNDRED = "hundred";
    public final static String TWENTIES = "twenties";
    public final static String FIFTIES = "fifties";


    public ATM(int hundred, int twenties, int fifties) {
        this.hundred = hundred;
        this.twenties = twenties;
        this.fifties = fifties;
    }

    public void addMoney(String type, int amount) {
        if (amount>=0){    switch (type) {
            case (HUNDRED):
                hundred = getHundred() + amount;
                break;
            case (TWENTIES):
                twenties = getTwenties() + amount;
                break;
            case (FIFTIES):
                fifties = getFifties() + amount;
                break;


        }
        }else {System.out.println("Некоректные данные");
        System.exit(1);}

    }



    public boolean getMoney(int sum) {

        haveSum = getOstatok();
        int current;
        StringBuilder currentNominal = new StringBuilder();


        if (haveSum < sum) {
            System.out.println("Ввели сумму превышающую доступную в банкомате");
        } else {
            if (sum % 10 != 0) {
                System.out.println("Невозможно получить данную сумму,купюры только 100 50 20");
                return false;
            } else {
                current = sum;
                int amountHundred = sum / 100;

                if (amountHundred != 0 && amountHundred <= hundred) {
                    current = sum - amountHundred * 100;
                }
                if (amountHundred > hundred && hundred != 0) {
                    current = sum - hundred * 100;
                    System.out.println("Забрать доступные номиналы 100: " + hundred);
                    currentNominal.append("Кол-во 100:  ").append(hundred).append(" ");
                    hundred = 0;
                }


                int amountFifties = current / 50;
                if (amountFifties != 0 && amountFifties <= fifties) {
                    current = current - amountFifties * 50;
                }
                if (amountFifties > fifties && fifties != 0) {
                    current = sum - fifties * 50;
                    System.out.println("Забрать доступные номиналы 50: " + fifties);
                    currentNominal.append("Кол-во 100:  ").append(fifties).append(" ");
                    fifties = 0;
                }

                int amountTwenties = current / 20;
                if (amountTwenties != 0 && amountTwenties <= twenties) {
                    current = current - amountTwenties * 20;
                }

                if (current != 0) {
                    int sum50 = getSum50(sum);
                    if (sum50 != 0) {
                        amountFifties=fifties;
                        sum50 = getSum20(sum);

                    }
                    if (sum50 != 0) {
                      amountTwenties=twenties;
                        System.out.println("ВВЕДИТЕ ДРУГУЮ СУММУ:купюры только 100 50 20");
                    }
                }else {
                        if (hundred != 0) {
                            hundred = hundred - amountHundred;
                            currentNominal.append("Кол-во 100:  ").append(amountHundred).append(" ");
                        }
                        if (fifties != 0) {
                            fifties = fifties - amountFifties;
                            currentNominal.append("Кол-во 50:  ").append(amountFifties).append(" ");
                        }
                        if (twenties != 0) {
                            twenties = twenties - amountTwenties;
                            currentNominal.append("Кол-во 20: ").append(amountTwenties).append(" ");

                        }
                        System.out.println(currentNominal );
                        System.out.println("Выдано из АТМ: " + sum);
                        getOstatok();
                        System.out.println("Остаток в АТМ: " + haveSum);
                        return true;
                    }
                }
                getOstatok();
                System.out.println("Остаток в АТМ: " + haveSum);
        }
        return false;
    }








    private int getSum50(int sum) {

        int current = sum;

        int amountFifties = current / 50;
        if (amountFifties != 0 && amountFifties <= fifties) {
            current = current - amountFifties * 50;
        }
        return current;
    }

    private int getSum20(int sum) {

        int current = sum;
        int amountTwenties = current / 20;
        if (amountTwenties != 0 && amountTwenties <= twenties) {
            current = current - amountTwenties * 20;
        }
        return current;
    }


    public  int getOstatok() {

        haveSum = getHundred() * 100 + getTwenties() * 20 + getFifties() * 50;

        return haveSum;

    }



    public int getHundred() {
        return hundred;
    }

    public int getTwenties() {
        return twenties;
    }

    public int getFifties() {
        return fifties;
    }


    public int getHaveSum() {
        return haveSum;
    }


}


