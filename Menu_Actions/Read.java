package Menu_Actions;

import java.io.*;
import java.util.HashMap;

public class Read {
    public static void read(HashMap<String, String> map) throws IOException {
        try {
            File f = new File("Stuff.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Loi doc file: "+e);
        }
    }
}
