package ZapisOdczyt27;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
public class FileWritter {
    public static void main(String[] args) {
        String fileName="testFile.txt";
        try(
                var fileWriter=new FileWriter(fileName,true);
                var writer=new BufferedWriter(fileWriter);
                ){
            writer.write("bolek");
            writer.newLine();
            writer.write("lolek");
            writer.newLine();
            writer.write("karol");
        }catch (IOException e){
            System.err.println("nie udalo sie zapisac pliku "+fileName);
        }
    }
}
