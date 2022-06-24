package com.bridgelabz.day3;
/* Calculating Wages till Number of Working Days or Total Working Hours per month is Reached */
public class EmployeeWageTillMaximumDayReached {
    public static void main(String[] args) {
        final int empRatePerHour = 20;
        final int noOfWorkingDays = 20;
        final int maxHrsInMonth = 10;
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while(totalEmpHrs <= maxHrsInMonth && totalWorkingDays < noOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10 % 3);
            switch (empCheck) {
                case 1:
                    empHrs = 8;
                    break;
                case 2:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + " " +"Emp Hrs: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage: "+ totalEmpWage);
    }
}
