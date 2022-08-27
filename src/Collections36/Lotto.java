package Collections36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lotto {

    List<Integer> integerList = new ArrayList<>(49) {
    };


    public void generate() {
        for (int i = 1; i < 50; i++) {
            integerList.add(i);
        }
        System.out.println(integerList);

    }

    public void randomize() {
        Collections.shuffle(integerList);
        System.out.println(integerList);
        System.out.println(integerList.size());
        for (int i = 0; i < integerList.size(); i++) {

            for (int j = 6; j < integerList.size(); j++) {

                integerList.remove(i);
            }
        }
        System.out.println("wylosowane liczby to: "+integerList);

    }

    public void checkResult() {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj swoje liczby");
        for (int i = 6; i < 12; i++) {
            integerList.add(sc.nextInt());

        }
        int sum = 0;
        System.out.println(integerList);
        for (int i = 0; i < integerList.size() -1; i++) {

            int freq = Collections.frequency(integerList, integerList.get(i));
            sum = (freq/2) + sum;
        }
        System.out.println("trafiles: "+sum/2+" liczby");

    }


}

