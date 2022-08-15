package staffmanager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int StaffFullTime, StaffParTime;
        Scanner scanner = new Scanner(System.in);
        StaffData staffData;
        ArrayList<StaffData> StaffDatas = new ArrayList<>();

        System.out.println("Nhập số StaffFullTime: ");
        StaffFullTime = scanner.nextInt();
        for (int i = 0; i < StaffFullTime; i++) {
            System.out.println("Nhân viên thứ: " + (i+1));
            staffData = new StaffFullTime();
            staffData.getStaffId();
            StaffData.add(staffData);
        }

        System.out.println("Nhập số StaffPastTime: ");
        StaffParTime = scanner.nextInt();
        for (int i = 0; i < StaffParTime; i++) {
            System.out.println("Nhân viên thứ: " + (i + 1));
            staffData = new StaffParTime();
            staffData.getStaffId();
            StaffData.add(staffData);
        }

        System.out.println("__________");
        System.out.println("Staff Information");
        for (StaffData Staff: StaffDatas
             ) {Staff.salary();
            System.out.println(Staff.toString());

        }
    }

//    public StaffFullTime(int staffId, String name, int age, int phone, String email, int bonus, int fines, int salary)
    StaffData staff1 = new StaffFullTime(001, "Phong cho", 33, 000000, "hfu@gmail", 1, 696969, 686868);
    StaffData staff2 = new StaffFullTime(001, "con cho ho duc", 34, 0000001, "hfu@gmail", 1, 696969, 686868);
    StaffData staff3 = new StaffFullTime(001, "han hit", 35, 0000002, "hfu@gmail", 1, 696969, 686868);
}
