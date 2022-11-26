package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void swapTwoNumbers(int num1, int num2){
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping ...");
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the 'swap two number' program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        swapTwoNumbers(num1,num2);
    }
}
