package Task20;

public class Task20 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        mass[0] = 11;
        mass[1] = 266;
        mass[2] = 3;
        mass[3] = 21;
        mass[4] = 12;
        mass[5] = 6;
        mass[6] = 123;
        mass[7] = 8;
        mass[8] = 566;
        mass[9] = 14;
        int massMax = mass[0];
        int index = 0;



        for (int i = 0; i < mass.length; i++) {

            if (massMax < mass[i]) {
                massMax = mass[i];
                index = i;
            }

        }
        System.out.println("Максимальный элемент массива = "+massMax+ "\n"+"Индекс массива, ["+index+"]");


    }
}


