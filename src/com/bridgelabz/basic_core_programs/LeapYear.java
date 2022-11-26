package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class LeapYear {
    static void checkLeapYear(int year) {

        if (year > 999 && year < 10000) {
            if (year % 400 == 0) {
                System.out.println(year + " is a leap year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a leap year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a leap year");
            } else System.out.println(year + " is not a leap year");
        } else {
            System.out.println("Invalid Data!...Input year of four digits only");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the 'leap year or not' program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:- ");
        int num = sc.nextInt();
        checkLeapYear(num);
    }
}
