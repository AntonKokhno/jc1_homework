package Task21;

public class Task21 {
    public static void main(String[] args) {
        int[] array = {9, -1, 10, 10, 654, 698, 1000, 1000, 3, -5};
        int MaxArray = array[0];
        int MinArray = array[0];
        int IndexMax = 0;
        int IndexMin = 0;
        int IndexMax2=0;
        int IndexMin2=0;
        int Min2=0;
        int Max2=0;
        int sum = 0;
        int[]array2=new int[10];
        int[] a;
        for (int i = 0; i < array.length; i++) {
            if (MaxArray < array[i]) {
                MaxArray = array[i];
                IndexMax = i;
            }
            if (MinArray > array[i]) {
                MinArray = array[i];
                IndexMin = i;

            }
//            if (array[i]==MaxArray){
//                Max2=array[i];
//                IndexMax2=i;
//                System.out.println(Max2);
//            }


        }
//        for (int i=IndexMax;i<array.length; i++)
//            System.out.println(array[i]);
        for (int i = 0; i < array.length; i++) {

            if (array[i]==MaxArray){
                Max2=array[i];
                IndexMax2=i;
                System.out.println("несколько максимумов"+Max2+" Индекс макс.маскимов [" + IndexMax2 + "]");
                }
            if (array[i]==MinArray){
                MinArray=array[i];
                IndexMin2=i;
                System.out.println("несколько минимов"+MinArray+" Индекс макс.минимов [" + IndexMin2 + "]");
            }

        }
        System.out.println("Максимальный элемент массива = " + MaxArray + "" + " Индекс макс.массива [" + IndexMax + "]");
        System.out.println("Минимальный элемент массива = " + MinArray + "" + " Индекс мин.массива [" + IndexMin + "]");
        if (IndexMax2 > IndexMin2){
            for (int j = IndexMin2 + 1; j<IndexMax2 ; j++)
                sum += array[j];
        }

        else if (IndexMax2 < IndexMin2){
            for (int j = IndexMax2 + 1; j<IndexMin2 ; j++)
                sum += array[j];

            }

        System.out.println("сумма" + sum);
        }


    }

