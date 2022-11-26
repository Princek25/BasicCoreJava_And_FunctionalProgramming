package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void checkVowelOrConsonant(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println(ch + " is Vowel");
        else
            System.out.println(ch + " is Consonant");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the 'Vowel or Consonant' program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character from a to z or A to Z");
        char ch = sc.next().charAt(0);
        checkVowelOrConsonant(ch);
    }
}
