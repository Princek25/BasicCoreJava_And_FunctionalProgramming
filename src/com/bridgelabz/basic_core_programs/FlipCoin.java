package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class FlipCoin {
    public static void flipTheCoin(int num){
    int head = 0;
    int tail = 0;
    if (num > 0) {
        for (int i = 0; i<num; i++) {
            double flipCoin = Math.random();
            if (flipCoin < 0.5) {
                head++;
                System.out.println("Head");
            } else {
                tail++;
                System.out.println("Tail");
            }
        }
        int headsPercentage = (head * 100) / num;
        int tailsPercentage = (tail * 100) / num;
        System.out.println("Percentage Head:" + headsPercentage +"%");
        System.out.println("Percentage Tail:" + tailsPercentage +"%");
        }
        else
        System.out.println("Invalid Number");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Flip Coin and print percentage of Heads and Tails' Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of times to flip the coin:- ");
        int num = sc.nextInt();
        flipTheCoin(num);
    }
}
