package Task44;


import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) throws MyScannerException {
        Scanner scanner= new Scanner(System.in);
        while (true){
            int x= Integer.parseInt(scanner.nextLine());
            if(x>10){
                    throw new MyScannerException("Ввели число больше 10");
            }

        }
    }
}
