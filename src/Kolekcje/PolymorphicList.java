package Kolekcje;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PolymorphicList {
    public static void main(String[] args) {
        LinkedList<Integer> ints1 = new LinkedList<>();
        ArrayList<Integer> ints2 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ints1.add(i);
            ints2.add(i);
        }
        printList(ints2);
        printList(ints2);

    }

    static void printList(List<Integer> list) {
        for (Integer n : list) {
            System.out.println(n);
        }
    }}
