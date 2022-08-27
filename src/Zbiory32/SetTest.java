package Zbiory32;

import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String>names=Set.of("Marek","Konrad","Basia","Karol");
        for (String name:names) {
            System.out.println(name);

        }
    }
}
