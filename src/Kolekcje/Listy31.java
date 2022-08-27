package Kolekcje;

import java.util.LinkedList;

public class Listy31 {
    public static void main(String[] args) {
        LinkedList<Integer>ints=new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            ints.add(i);
        }
        System.out.println("ints.get(50)="+ints.get(50));
        System.out.println("ilosc elementow na liscie:"+ints.size());
        System.out.println("czyszcze tablice:");
        ints.clear();
        System.out.println("ilosc elementow na liscie:"+ints.size());
    }
}
