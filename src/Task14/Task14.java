package Task14;

public class Task14 {
    public static void main (String[] args){

        long n= 789382344539L;
        long sum =0;
        do{
            sum+=(n%10);
            n/=10;
        }while (n!=0);
        System.out.println("Сумма чифр числа 7893823445 = "+sum);

    }

}
