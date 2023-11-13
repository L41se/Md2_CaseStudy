package CS2;

import java.util.Scanner;


public class Menu1 {
    public static void main(String[] args) {
//        ManagerUser.Menu();
//        if (login()){
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu"+
                     "\n1. Add new Employee" +
                     "\n2. Erase an Employee" +
                     "\n3. Update an Employee's information" +
                     "\n4. Show all Employee" +
                     "\n5. Check status of Employee" +
                     "\n6. Search employee acording to the name "+
                     "\n0. Exit" +
                     "\nInput your option: ");
            int option = sc.nextInt();
            do {
                switch (option) {
                    case 1:
                        EmployeeManager.create("");
                        break;
                    case 2:
                        EmployeeManager.delete();
                        break;
                    case 3:
                        EmployeeManager.update("");
                        break;
                    case 4:
                        EmployeeManager.show();
                        break;
                    case 5:
                        EmployeeManager.Status();
                        break;
                    case 6:
                        EmployeeManager.Search();
                    case 0:
                        System.exit(0);
                }
            } while (true);
        }
    }

