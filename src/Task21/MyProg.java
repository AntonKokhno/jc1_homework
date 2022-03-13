package Task21;

import java.util.Random;
import java.util.ArrayList;

class MyProg {
    private static final int size = 10;     // размер массива

    public static void main (String[] args) {
        int[] a = new int[size];    // запрашиваем память под массив
        random_arr(a);              // заполняем массив случайными
        printf_arr(a);              // выводим индексы и элементы массива

        int a_min = min_array(a);   // находим минимальный элемент массива
        int a_max = max_array(a);   // находим максимальный элемент массива

        // массивы индексов всех минимальных и максимальных элементов
        ArrayList<Integer> min_positions = new ArrayList<>();
        ArrayList<Integer> max_positions = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (a[i] == a_min)
                min_positions.add(i);
            if (a[i] == a_max)
                max_positions.add(i);
        }

        // перебираем все пары индексов и находим максимальную разницу
        int ind_max = 0, p_min = 0, p_max = 0, current;
        for (Integer x : min_positions)
            for (Integer y : max_positions) {
                current = Math.max(x, y) - Math.min(x, y);
                if (current > ind_max) {
                    ind_max = current;
                    p_min = x;
                    p_max = y;
                }
            }

        // считаем сумму элементов и выводим на экран
        int n_sum = sum_array(a, p_min, p_max);
        System.out.printf("sum a[%d : %d] = %d\n",
                Math.min(p_min, p_max), Math.max(p_min, p_max), n_sum);
    }

    private static void random_arr (int[] a) {
        Random rnd = new Random( System.currentTimeMillis() );
        for (int i = 0; i < a.length; i++)
            a[i] = rnd.nextInt(21) - 10;
    }

    private static void printf_arr (int[] a) {
        for (int i = 0; i < a.length; i++)  // индексы
            System.out.printf("%4d", i);
        System.out.println();
        for (int n: a)                      // элементы массива
            System.out.printf("%4d", n);
        System.out.println();
    }

    private static int sum_array (int[] array, int a, int b) {
        int n_sum = 0;                  // сумма элементов
        int start = Math.min(a, b);     // начало среза
        int finish = Math.max(a, b);    // конец среза
        for (int i = start + 1; i < finish; i++)
            n_sum += array[i];
        return n_sum;
    }

    private static int max_array (int a[]) {
        int p_max = 0;
        for (int i = 1; i < a.length; i++)
            if (a[i] > a[p_max])
                p_max = i;
        return a[p_max];
    }

    private static int min_array (int a[]) {
        int p_min = 0;
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[p_min])
                p_min = i;
        return a[p_min];
    }
}