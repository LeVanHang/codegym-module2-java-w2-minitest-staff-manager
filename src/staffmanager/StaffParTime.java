package staff;

public class StaffParTime extends StaffData {
    private int workinghours;

    public StaffParTime() {
    }

    public StaffParTime(int workinghours) {
        this.workinghours = workinghours;
    }

    public StaffParTime(int staffId, String name, int age, int phone, String email, int workinghours) {
        super(staffId, name, age, phone, email);
        this.workinghours = workinghours;
    }

    public int getWorkinghours() {
        return workinghours;
    }

    public void setWorkinghours(int workinghours) {
        this.workinghours = workinghours;
    }

    public double getSalary(){
        return workinghours * 69000;
    }

    @Override
    public String toString() {
        return "staff.StaffParTime{" +
                "workinghours=" + workinghours +
                "} " + super.toString();
    }
}


