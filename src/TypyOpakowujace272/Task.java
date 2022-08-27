package TypyOpakowujace272;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Task {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        FileReader fileReader = null;
        BufferedReader reader = null;
        try {
            fileReader = new FileReader(fileName);
            reader = new BufferedReader(fileReader);
            String nextLine = null;
            int lines = 0;
            int sum = 0;
            BigInteger sumBig = BigInteger.valueOf(0);
            while ((nextLine = reader.readLine()) != null) {
                lines++;
                if (lines < 4) {
                    int num = Integer.parseInt(nextLine);

                    sum = sum + num;
                } else {
                    BigInteger bigInteger = BigInteger.valueOf(Long.parseLong(nextLine));

                    sumBig = sumBig.add(bigInteger);

                }

                System.out.println(nextLine);
            }


            System.out.println("ilosc wierszy w pliku= " + lines);
            System.out.println("Suma trzech pierwszych liczb:"+sum);
            System.out.println("Suma dwoch ostatnich liczb:"+sumBig);

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (reader == null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
