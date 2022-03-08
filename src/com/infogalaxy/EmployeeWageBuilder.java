package com.infogalaxy;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[]args) {
        //UC-2 Employee Wage Calculation
        //uc-3 Employee Work Type
        final int WAGE_PER_HR = 20;
        final int FULL_DAY_HR = 8;
        final int PART_TIME_HR =4;
        int total_wage = 0;
        //UC-1 Employee Attendance
        Random random = new Random();
        int checkAttendance = random.nextInt()%2;
        if (checkAttendance == 0){
            System.out.println("Employee is Absent.");
        } else {
            System.out.println("Employee is present.");
            int empType=random.nextInt()%2;
            if(empType==0)
                total_wage = WAGE_PER_HR*PART_TIME_HR;
        }
        System.out.println("Total wage =" + total_wage);
    }
    }