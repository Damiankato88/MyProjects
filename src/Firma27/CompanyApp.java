package Firma27;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CompanyApp {

    public static void main(String[] args) {

        String fileName = "Firma.txt";
        Company company = new Company();
        try (
                var fileWriter = new FileOutputStream(fileName);
                var writer = new ObjectOutputStream(fileWriter);
        ) {
            writer.writeObject(company.addEmployee());
            System.out.println("zapisano obiekt do pliku");
        } catch (IOException e) {
            System.out.println("Nie udalo sie zapisac pliku" + fileName);
        }


}
    }

