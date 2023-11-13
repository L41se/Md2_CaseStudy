package CS2;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerUser {
    static ArrayList<User> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static User name;
    public static void Menu(){
            System.out.println("1: Log in to your Account");
            System.out.println("2: Sign up for an Account");
            System.out.println("3: Exit");
            int choice = 0;
            try{
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (Exception e) {
                System.out.println("Retype");
            }
            switch (choice){
                case 1:
                    login();
                    break;
                case 2:
                    signUp();
                    break;
                case 3:
                    System.exit(0);
            }
        }

    static boolean login(){
        System.out.println("Enter Your username");
        String userName = scanner.nextLine();
        System.out.println("Enter Your password");
        String passWord = scanner.nextLine();

        for (User menuUser: list) {
            if (menuUser.getUserName().equalsIgnoreCase(userName)
                    && menuUser.getPassword().equalsIgnoreCase(passWord)){
                System.out.println("Welcome back, "  + userName);
                name = menuUser;
            }
        }
        System.out.println("Incorrect account or password information");
        return true;
    }

    private static void signUp(){
        System.out.println("Enter username registration");
        String name = scanner.nextLine();
        System.out.println("Enter password registration");
        String pass = scanner.nextLine();

        for (User menuUser: list) {
            if( menuUser.getUserName().equalsIgnoreCase(name)){
                System.out.println("Account already exists");
                return;
            }
        }
        System.out.println("Account successfully created");
        list.add(new User(name, pass));
        login();
    }
}
