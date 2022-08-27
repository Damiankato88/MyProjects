package OperacjeNaTablicach;

import java.util.Arrays;

public class PersonDatabase {
    private final int INITIAL_CAPACITY = 1;
    Person[] persons = new Person[INITIAL_CAPACITY];



    public void add(Person person) {

        if (size() <persons.length) {
            persons[size()] = person;

        } else {
            Person[] temporaryPersons = new Person[(persons.length) * 2];
            for (int i = 0; i < persons.length; i++) {
                temporaryPersons[i] = persons[i];
            }
            temporaryPersons[size()] = person;
            persons = temporaryPersons;
        }
    }


    public void remove(Person person) {
        Person[] temporaryPersons = new Person[persons.length];
        try {
            for (int i = 0; i < persons.length; i++) {
                if (person.equals(persons[i])) {
                    persons[i] = null;
                    System.arraycopy(persons, i + 1, temporaryPersons, i, persons.length - i - 3);
                    System.arraycopy(persons, 0, temporaryPersons, 0, persons.length + i - 8);
                    persons = temporaryPersons;
                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("NULL-index poza");
        } catch (NullPointerException ex) {
            System.out.println("NULL");
        }
    }

    public Person get(int index) throws ArrayIndexOutOfBoundsException {
        try {
            System.out.println(persons[index]);
        } catch (ArrayIndexOutOfBoundsException ext) {
            System.out.println("INDEX POZA");
        }
        return persons[index];
    }

    public int size() {
        int numbers = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null) {
                numbers += 1;
            }
        }
        System.out.println(numbers);
        return numbers;

    }

    @Override
    public String toString() {
        return "PersonDatabase{" +
                "INITIAL_CAPACITY=" + INITIAL_CAPACITY +
                ", persons=" + Arrays.toString(persons) +
                  '}';
    }
}











