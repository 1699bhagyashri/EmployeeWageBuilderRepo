package com.infogalaxy;


import java.util.Random;

public class EmployeeWageBuilder {
    // UC-2 Employee Wage Calculation
    // UC -3 Employee Work Type
    // UC-4 Calculating Wage for a month
    int working_days = 0;
    int total_hrs = 0;
    //UC-1 Employee Attendance
    Random random = new Random();
    int total_wage = 0;

    public void employeeCalculation() {
        while (working_days < Constants.TOTAL_WORKING_DAYS && total_hrs <= Constants.TOTAL_WORKING_HRS) {
            working_days++;
            System.out.println("Day :" + working_days);
            int empAttendance = random.nextInt() % 2;
            if (empAttendance == Constants.IS_ABSENT) {
                System.out.println("Employee is Absent");
            } else {
                System.out.println("Employee is present.");
                int empType = random.nextInt() % 2;
                if (empType < 0) {
                    empType = -empType;

                }
                // UC-4 Using Switch Case
                switch (empType) {
                    case Constants.IS_PART_TIME:
                        System.out.println("Employee is Part-Time:");
                        total_wage = total_wage + (Constants.WAGE_PER_HR * Constants.PART_TIME_HR);
                        total_hrs = total_hrs + Constants.PART_TIME_HR;
                        break;
                    case Constants.IS_FULL_TIME:
                        System.out.println("Employee is Full-Time.");
                        total_wage = total_wage + (Constants.WAGE_PER_HR * Constants.FULL_TIME_HR);
                        total_hrs = total_hrs + Constants.FULL_TIME_HR;
                        break;
                }
            }
        }
    }

    public void showEmpWageCalculation() {
        System.out.println("Total_Hrs : " + total_hrs);
        System.out.println("Total Wage = " + total_wage);
    }

    public static void main(String[] arge) {
        EmployeeWageBuilder employeeWageBuilder = new EmployeeWageBuilder();
        employeeWageBuilder.employeeCalculation();
        employeeWageBuilder.showEmpWageCalculation();
    }
}
