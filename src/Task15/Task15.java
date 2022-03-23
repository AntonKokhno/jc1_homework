package Task15;

public class Task15 {

    public static void main(String[] args) {
        boolean twoNumPros = false;
        for (int i = 50; i <= 70; i++) {
            boolean numPros = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    numPros = false;
                    break;
                }
            }

            if (numPros) {
                if (twoNumPros) {
                    System.out.println("Второе прсотое число = " + i);
                    break;
                }
                twoNumPros = true;
            }
        }
    }
}



