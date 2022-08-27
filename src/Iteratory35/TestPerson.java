package Iteratory35;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TestPerson  {
    public static void main(String[] args) {

        Map<String, Person> persons = new TreeMap<>();
        persons.keySet();
        persons.put("Remik",new Person("Tomasz","Remik","42"));
        persons.put("Nowak",new Person("Tomasz","Nowak","42"));
        persons.put("Kowalski", new Person("Jan", "Kowalski", "35"));
        persons.put("Kowalski", new Person("Jan", "Kowalski", "35"));
        Iterator<String>personsIterator=persons.keySet().iterator();
        while (personsIterator.hasNext()){
            String person=personsIterator.next();

            System.out.println(person);
        }
    }



}


