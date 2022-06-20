package com.bridgelabz.day3;

public class CalculateEmployeePartTimeWages {
    public static void main(String[] args) {
        int isFullTime = 1;
        int isPartTime = 2;
        double empRatePerHour =20;
        double empCheck = Math.floor(Math.random() * 10 % 3);
        System.out.println(empCheck);
        if (empCheck == isFullTime) {
            int empFullHrs = 12;
            double salary = (empRatePerHour * empFullHrs);
            System.out.println("Salary of full time employee is " + salary);
        } else if(empCheck == isPartTime){
            int empFullHrs = 8;
            double salary = (empRatePerHour * empFullHrs);
            System.out.println("Salary of part time employee is " + salary);
        }else{
            int empFullHrs = 0;
            double salary = (empRatePerHour * empFullHrs);
            System.out.println("Salary is " + salary);
        }
    }
}
