package CS2;

public class Employee {
    private String name;
    private String Status;
    private int Age;
    private String gender;
    private double Salary;

    public Employee(){
    }

    public Employee(String name, String status, int age, String gender, double salary) {
        this.name = name;
        Status = status;
        Age = age;
        this.gender = gender;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Status='" + Status + '\'' +
                ", Age=" + Age +
                ", gender='" + gender + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
