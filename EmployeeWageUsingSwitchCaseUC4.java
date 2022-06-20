package com.bridgelabz.day3;
/* To Calculate Employee Wages using Switch Case */
public class EmployeeWageUsingSwitchCaseUC4 {
    static final int isFullTime = 1;
    static final int isPartTime = 2;
    static int empRatePerHour =20;
    public static void main(String[] args) {
        int empFullHrs;
        double salary;
        int empCheck = (int) Math.floor(Math.random() * 10 % 3);
        switch (empCheck){
            case isFullTime:
                empFullHrs = 8;
                break;
            case isPartTime:
                empFullHrs = 4;
                break;
            default:
                empFullHrs = 0;
        }
        salary = (empRatePerHour * empFullHrs);
        System.out.println("Employee Wage: " + salary);
    }
}