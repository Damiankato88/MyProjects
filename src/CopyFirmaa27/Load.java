package CopyFirmaa27;

import java.io.*;

public class Load {
    public static void load() {
        String fileName = "Firma.txt";

        try (
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader);
        ) {
            String nextLine= null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {

                System.out.println(nextLine);
                lines++;
            }

            System.out.println("liczba lini: " + lines);

        } catch (IOException e) {
            e.printStackTrace();

    }}}

