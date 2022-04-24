package Task39;

import java.util.ArrayList;
import java.util.List;

public class Task39 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0, 10);
        list.add(1, 9);
        list.add(2, 6);
        list.add(3, 1);
        list.add(4, 5);
        list.add(5, 8);
        list.add(6, 4);
        list.add(7, 8);
        list.add(8, 7);
        list.add(9, 2);
        for (Integer i : list) {
            if (i > 3) {
                System.out.println(i);
            }
        }
    }
}
