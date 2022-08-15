package staffmanager;

public class StaffFullTime extends StaffData {
    private int bonus;
    private int fines;
    private int salary;

    public StaffFullTime() {
    }

    public StaffFullTime(int bonus, int fines, int salary) {
        this.bonus = bonus;
        this.fines = fines;
        this.salary = salary;
    }

    public StaffFullTime(int staffId, String name, int age, int phone, String email, int bonus, int fines, int salary) {
        super(staffId, name, age, phone, email);
        this.bonus = bonus;
        this.fines = fines;
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFines() {
        return fines;
    }

    public void setFines(int fines) {
        this.fines = fines;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double Salary(){
        return salary + (bonus + fines);
    }

    @Override
    public String toString() {
        return "staff.StaffFullTime{" +
                "bonus=" + bonus +
                ", fines=" + fines +
                ", salary=" + salary +
                "} " + super.toString();
    }


}
