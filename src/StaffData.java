public class StaffData {
    private int staffId;
    private String name;
    private int age;
    private int phone;
    private String email;

    public StaffData() {
    }

    public StaffData(int staffId, String name, int age, int phone, String email) {
        this.staffId = staffId;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StaffData{" +
                "staffId=" + staffId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
