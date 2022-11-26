package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class EvenOrOddNumber {

    public static void checkEvenOrOddNumber(int num){
        if (num%2==0){
            System.out.println(num + " is Even Number");
        }
        else System.out.println(num + " is Odd Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        checkEvenOrOddNumber(num);
    }
}
