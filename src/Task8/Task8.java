package Task8;

public class Task8 {
    public static void main(String[] args) {
        int money = 12273481;
        int cash = money % 10;
        switch (cash) {
            case 0:
                System.out.println(money + "рублей");
                break;
            case 1:
                System.out.println(money + "рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(money + "рубля");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(money + "рублей ");
                break;
        }
    }
}

