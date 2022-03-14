package com.infogalaxy;


import java.util.Random;

public class EmployeeWageBuilder<Working_Days> {
    public static void main(String[] args) {
        //UC-2 Employee Wage Calculation
        //uc-3 Employee Work Type
        //UC-5  Calculating Wage for a Month
        final int WAGE_PER_HR = 20;
        final int FULL_DAY_HR = 8;
        final int PART_TIME_HR = 4;
        final int Working_Days=20;
        int total_Wage = 0;
        int total_wage = 0;
        //UC-1 Employee Attendance
        Random random = new Random();
        for(int i=1;i<20;i++) {
            int checkAttendance = random.nextInt() % 2;
            if (checkAttendance == 0) {
                System.out.println("Employee is Absent.");
            } else {
                System.out.println("Employee is present.");
                int empType = random.nextInt() % 2;
                //UC-4 Using Switch Case
                switch (empType) {
                    case 0:
                        System.out.println("Employee is Part-Time:");
                        total_wage = WAGE_PER_HR * PART_TIME_HR;
                        break;
                    case 1:
                    case -1:
                        System.out.println("Employee is Full =Time.");
                        total_wage = WAGE_PER_HR * FULL_DAY_HR;
                        break;
                }
            }
        }
        total_Wage = total_wage*Working_Days;
        System.out.println("Total wage = " + total_wage);
    }
}