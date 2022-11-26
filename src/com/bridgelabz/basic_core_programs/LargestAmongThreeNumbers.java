package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    static void checkLargestAmongThreeNumber(int a, int b, int c){
        if (a>b & a>c){
            System.out.println(a + " " + "is the largest");
        } else if (b>a & b>c) {
            System.out.println(b + " " + "is the largest");
        }
        else System.out.println(c + " " + "is the largest");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the 'largest among the three number' program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Number");
        int a = sc.nextInt();
        System.out.println("Input Second Number");
        int b = sc.nextInt();
        System.out.println("Input Third Number");
        int c = sc.nextInt();
        checkLargestAmongThreeNumber(a,b,c);
    }
}
