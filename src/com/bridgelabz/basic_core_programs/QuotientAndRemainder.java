package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void findQuotientAndRemainder(int num1, int num2){
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
    public static void main(String[] args){
        System.out.println("Welcome to the 'Quotient and Remainder' Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Divisor");
        int num2 = sc.nextInt();
        findQuotientAndRemainder(num1,num2);

    }
}
