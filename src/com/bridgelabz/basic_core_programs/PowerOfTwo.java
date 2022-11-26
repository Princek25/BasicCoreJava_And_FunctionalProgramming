package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class PowerOfTwo {
    public static void checkPowerOfTwo(int num){
        if (0<=num && num<31){
            for (int i = 0;i<=num;i++){
                System.out.println("2 to the Power " + i + " is:- " + Math.pow(2,i));
            }
        }
        else {
            System.out.println("Invalid Range");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the 'Power of Two' java program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input power of 2 between 0 to 31");
        int num = sc.nextInt();
        checkPowerOfTwo(num);
    }
}
