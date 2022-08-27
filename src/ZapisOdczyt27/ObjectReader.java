package ZapisOdczyt27;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {
    public static void main(String[] args) {
        String fileName="person.obj";
        Person pl=null;
        try(
                var fis=new FileInputStream(fileName);
                var ois=new ObjectInputStream(fis);
                ){
            pl=(Person) ois.readObject();
        }catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }
        if(pl!=null){
            System.out.println("wczytano dane o: "+pl.getFirstName()+" "+pl.getLastName());
        }
    }
}
