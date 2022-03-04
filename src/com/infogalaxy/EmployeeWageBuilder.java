package com.infogalaxy;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[]args) {
        System.out.println("Employee Wage Calculation Development by Infogalaxy");
        Random r = new Random();
        int empAttendance = r.nextInt() % 2;
        System.out.println(empAttendance);
        if (empAttendance == 0) {
            System.out.println("Employee is Absent");
        } else {
            System.out.println("Employee is present");

        }

    }
    }