package Task40;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task40 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 19; i++) {
            list.add((int) (Math.random() * 15));
        }
        System.out.println("Коллекция случайных чисел\n"+list);
        System.out.println(" ");
        Set<Integer> set = new HashSet<>(list);
        System.out.println("Коллекция случайных чисел,без повторяющихся значений\n"+set);
    }
}