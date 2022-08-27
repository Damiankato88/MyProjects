package OperacjeNaTablicach;

import java.util.Arrays;

public class TestData {
    public static void main(String[] args) {
        PersonDatabase personDatabase = new PersonDatabase();
        personDatabase.size();
        personDatabase.add(new Person("Jan", "Kowal", "883924243"));
        System.out.println(Arrays.toString(personDatabase.persons));
        personDatabase.size();
        personDatabase.add(new Person("Tom", "Dom", "872432423"));
        System.out.println(Arrays.toString(personDatabase.persons));
        personDatabase.size();
        personDatabase.add(new Person("Tom", "Domu", "872432423"));
        System.out.println(Arrays.toString(personDatabase.persons));
        personDatabase.size();
        personDatabase.add(new Person("Tom", "Domku", "872432423"));
        System.out.println(Arrays.toString(personDatabase.persons));
        personDatabase.size();
        personDatabase.add(new Person("Tom", "WOJKU", "872432423"));
        System.out.println(Arrays.toString(personDatabase.persons));
        personDatabase.size();
        personDatabase.add(new Person("Tom", "gojku", "872432423"));
        System.out.println(Arrays.toString(personDatabase.persons));
        personDatabase.size();
        personDatabase.remove(new Person("Tom", "Domku", "872432423"));
        System.out.println(Arrays.toString(personDatabase.persons));
        personDatabase.add(new Person("Tomasz", "Kot", "785643232"));
        System.out.println(Arrays.toString(personDatabase.persons));
        personDatabase.get(3);
        personDatabase.size();
        System.out.println(Arrays.toString(personDatabase.persons));

    }

}
