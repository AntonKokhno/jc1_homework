package task10;

public class Task10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        int c = 15;
        int d = 10;
        int e = 5;
        int f = 7;
        if ((e >= (a + c)) && (f >= b && f >= d)) {
            System.out.println("два дома помещаются на участке");
        } else if ((e >= (a + d)) && (f >= b && f >= c)) {
            System.out.println("два дома помещаются на участке");
        } else if ((e >= (b + c)) && (f >= a && f >= d)) {
            System.out.println("два дома помещаются на участке");
        } else if ((e >= (b + d)) && (f >= a && f >= c)) {
            System.out.println("два дома помещаются на участке");
        } else if ((f >= (a + c)) && (e >= b && e >= d)) {
            System.out.println("два дома помещаются на участке");
        } else if ((f >= (a + d)) && (e >= b && e >= c)) {
            System.out.println("два дома помещаются на участке");
        } else if ((f >= (b + c)) && (e >= a && e >= d)) {
            System.out.println("два дома помещаются на участке");
        } else if ((f >= (b + d)) && (e >= a && e >= c)) {
            System.out.println("два дома помещаются на участке");
        }
        else
            System.out.println("два дома не поместятся");
    }
}
