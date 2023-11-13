package CS2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Employee> employees = new ArrayList<>();
    int count = 0;

    public Employee create(String type){
        String Name;
        while (true){
            System.out.println("Enter name Employee: ");
            Name = scanner.nextLine();
            if (Name != ""){
                break;
            } else {
                System.out.println("Fill full info");
            }
        }
        int Age;
        while (true){
            try{
            System.out.println("Enter age Employee: ");
            Age = Integer.parseInt(scanner.nextLine());
            break;
            } catch (Exception e){
                System.out.println("Age must be number");
            }
        }
        String Gender;
        while (true){
            try{
                System.out.println("Enter employee gender: male/female");
                Gender = scanner.nextLine();
                if (RegexGenderStatus.validateGender(Gender)){
                    break;
                }
            } catch (Exception e){
                System.out.println("Only 2 gender can be accepted");
            }
        }
        String Status;
        while (true){
            try{
                System.out.println("Enter employee status: true/false");
                Status = scanner.nextLine();
                if (RegexGenderStatus.validateStatus(Status)){
                    break;
                }
            } catch (Exception e){
                System.out.println("Employee has only 2 status: true/false");
            }
        }
        double Salary;
        while (true){
            try{
                System.out.println("Enter salary employee");
                Salary = Double.parseDouble(scanner.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Salary must be a number");
            }
        }
        if (type.equals(" Employee Part - time")){
            System.out.println(" Enter timework of employee Part-time");
            double workTime = Double.parseDouble(scanner.nextLine());
            double totalSalary = Double.parseDouble(scanner.nextLine());
            return new Part_time(Name,Status,Age,Gender,Salary,workTime,totalSalary);
        } else {
            return new Full_time(Name,Status,Age,Gender,Salary);
        }
        
    }

    public void delete(){
        System.out.println("Enter name employee u want to delete: ");
        String name = scanner.nextLine();
        for (int i = 0; i < employees.size(); i++){
            if (employees.get(i).getName().equals(name)){
                System.out.println(employees.get(i).toString() + "---" + " are in location");
            }
        }
        System.out.println("Enter a employee u want to delete: ");
        int index = Integer.parseInt(scanner.nextLine());
        Employee employee = employees.get(index);
        if (employee.getName().equals(name)){
            employees.remove(index);
        }
    }

    public void update(String name){
        for (int i = 0; i < employees.size(); i++){
            if (employees.get(i).getName().equals(name)){
                System.out.println(employees.get(i).toString() + "---" + "are in location");
            }
        }
        System.out.println("Enter location u want to update: ");
        int index = Integer.parseInt(scanner.nextLine());
        Employee employee;
        if (employees.get(index) instanceof Part_time){
            employee = create("Part-time");
        } else {
            employee = create("Full-time");
        }
        employees.set(index,employee);
    }

    public void show(){
        for (Employee show1: employees){
            System.out.println(show1);
            System.out.println("<---->");
        }
    }

    public void Status(){
        System.out.println("Enter employee want to check status");
        String name = scanner.nextLine();
        for (Employee b00lean : employees){
            if (b00lean.getName().equals(name)){
                System.out.println(b00lean.getStatus());
            }
        }
    }

    public void Search(){
        System.out.println("Enter name employee want to search");
        String Name = scanner.nextLine();
        for (Employee employee : employees){
            if (employee.getName().contains(Name)){
                System.out.println("---Employee your want search---" + employee);
            }
        }
    }

    public void updateStatus(){
        System.out.println("Your want update status employee?");
        String name = scanner.nextLine();
        for (int i = 0; i < employees.size(); i++){
            System.out.println(" change the status to ");
            employees.get(i).setStatus(scanner.nextLine());
        }
    }
}
