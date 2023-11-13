import Menu_Actions.Add;
import Menu_Actions.Delete;
import Menu_Actions.Find;
import Menu_Actions.Read;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> dictionary = new HashMap<>();

        System.out.println("╭----------------Menu----------------╮");
        System.out.println("|  1-Add words to dictionary         |");
        System.out.println("|  2-Find words                      |");
        System.out.println("|  3-Delete a word                   |");
        System.out.println("|  4-Open dictionary                 |");
        System.out.println("|  0-Exit                            |");
        System.out.println("╰------------------------------------╯");
        System.out.println("Input your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Add.put(dictionary);
                break;
            case 2:
                Find.find(dictionary);
                break;
            case 3:
                Delete.remove(dictionary);
                break;
            case 4:
                Read.read(dictionary);
                break;
        }
    }
}
