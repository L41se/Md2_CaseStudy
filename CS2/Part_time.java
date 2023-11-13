package CS2;

public class Part_time extends Employee{
    private double workTime;
    private double totalSalary;

    public Part_time(){
    }
    public  Part_time(String name, String status, int age, String gender, double salary, double workTime, double totalSalary ){
        super(name, status, age, gender, salary);
        this.workTime = workTime;
        this.totalSalary = totalSalary;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    @Override
    public String toString() {
        return "Part_time{" +
                "workTime=" + workTime +
                ", totalSalary=" + totalSalary +
                '}';
    }
}
