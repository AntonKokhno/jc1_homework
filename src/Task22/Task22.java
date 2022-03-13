package Task22;

public class Task22 {
    public static void main(String[] args) {

        int [] mas= new int[10];
        int b=0;
        for(int i=0;i<mas.length;i++){
            mas[i]=b;
            b++;
            System.out.print(mas[i]+", ");
        }
        System.out.println( );

        for(int i=mas.length-1;i>=0;--i){
            System.out.print(mas[i]+", ");
        }
    }
}
