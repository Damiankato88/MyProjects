package Zbiory32;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class TaskTree {


    public static void main(String[] args) {
        TreeSet<String> name = new TreeSet<>(new Sort());

        String fileName = "namespl.txt";
        FileReader fileReader = null;
        BufferedReader reader = null;

        try {
            fileReader = new FileReader(fileName);
            reader = new BufferedReader(fileReader);
            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                name.add(nextLine);
                lines++;
            }
            System.out.println("ilosc wierszy w pliku= " + lines);

        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println(name);
        System.out.println("first: " + name.first());
        System.out.println("last: " + name.last());
    }

    static class Sort implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }

    }
}




