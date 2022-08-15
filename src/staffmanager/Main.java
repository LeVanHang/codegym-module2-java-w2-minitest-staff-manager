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
}
