package CS2;

public class Full_time extends Employee{
    public Full_time(){
    }
    public Full_time(String name, String status, int age, String gender, double salary){
        super(name, status, age, gender, salary);
    }
    @Override
    public String toString() {
        return "Fulltime{}" + super.toString();
    }
}
