package Zbiory32;

import java.util.TreeSet;

public class StesExample {

    public static void main(String[] args) {
        TreeSet<Integer>set=new TreeSet<>();
        set.add(2);
        set.add(1);
        set.add(1);
        set.add(3);
        System.out.println("size"+set.size());
        System.out.println("first"+set.first());
        System.out.println("last"+set.last());
        System.out.println("contains 2?"+set.contains(2));
    }}
