package Menu_Actions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Write {
    public static void write(HashMap<String,String>map){
        try {
            File f = new File("Stuff.txt");
            FileWriter fw = new FileWriter(f);
            fw.write(String.valueOf(map));
            fw.close();
        } catch (IOException e) {
            System.out.println("Loi ghi file: " + e);
        }
    }
}
