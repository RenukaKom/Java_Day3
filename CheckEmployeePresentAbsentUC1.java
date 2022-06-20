package com.bridgelabz.day3;
/* To Check Employee is Present or Absent */
public class CheckEmployeePresentAbsentUC1 {
    public static void main(String[] args) {
        int isFullTime = 1;
        double empCheck = Math.floor(Math.random() * 10 % 2);
        System.out.println(empCheck);
        if (empCheck == isFullTime) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}