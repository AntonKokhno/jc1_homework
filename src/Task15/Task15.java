package Task15;

public class Task15 {
    public static void main(String[] args) {
        boolean b = true;
        for (int P = 50; P <= 70; P++) {
            for (int i = 2; i < P; ) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(P);
            else b = true;
        }
    }
}