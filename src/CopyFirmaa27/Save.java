package CopyFirmaa27;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Save {
    public void save(){
    String fileName = "Firma.txt";
    Company company = new Company();

        try (
    var fileWriter = new FileWriter(fileName);
    var writer = new BufferedWriter(fileWriter);
        ) {
        writer.write(company.addEmployee());
        System.out.println("zapisano obiekt do pliku");
    } catch (
    IOException e) {
        System.err.println("Nie udalo sie zapisac pliku" + fileName);
    }

}}
