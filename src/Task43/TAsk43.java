package Task43;

public class TAsk43 {
    public static void main(String[] args) {
        Number number=null;

        try {
            number.show();
        } catch (NullPointerException e) {
            System.out.println("Переменная не объявлена");
        }
    }

    public static class Number {
        public void show(){


        }
    }
}
