package Task12;


public class Task12 {
    public static void main(String[] args) {
        int n = 10;
        int factorial = 1;
        int i = 0;
        while (i < n) {
            System.out.println("Factorial " + i + " is " + factorial);
            i++;
            factorial *= i;
        }
        System.out.println( "Factorial of " + n + " is " + factorial );
    }
}