package Comparator29;

import java.util.Arrays;
import java.util.Comparator;

public class Table {


    public static void main(String[] args) {
        Integer[] table = new Integer[20];
        table = new Integer[]{2, 56, 78, 23, 656, 32, 5, 12, 34, 89, 90, 45, 55, 65, 34, 22, 34, 54, 1, 2, 2};
        System.out.println(Arrays.toString(table));
        Arrays.sort(table, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);


            }
        });
        System.out.println(Arrays.toString(table));
        Arrays.sort(table, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(Arrays.toString(table));
    }

}




