package Menu_Actions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Delete {
    public static void remove(HashMap<String,String> map){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu can xoa : ");
        String key = sc.nextLine();

        map.remove(key);
        System.out.println("Xoa tu " + key + " Success!");
        Write.write(map);
        System.out.println();
        System.out.println(map);
    }
}

