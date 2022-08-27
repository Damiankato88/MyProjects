package ZapisOdczyt27;

import java.io.File;
import java.io.IOException;

public class FileCreator {
    public static void main(String[] args) {
        String fileName="testFile.txt";
        File file=new File(fileName);
        boolean fileExist=file.exists();
        if (!fileExist){
            try{fileExist=file.createNewFile();
        }catch (IOException e){
                System.out.println("nie udalo sie utworzyc pliku");
            }
    }
    if (fileExist)
        System.out.println("plik"+fileName+"istnieje lub zostal utworzony");
}}
