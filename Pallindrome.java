package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int reversedInteger = 0, remainder, originalInteger,sumEven = 0;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        originalInteger = num;

        // reversed integer is stored in variable
        for( ;num != 0; num /= 10 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            if (remainder % 2 == 0){
                sumEven = sumEven + remainder;
            }

        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            if (sumEven > 25)
                System.out.println(originalInteger + " is a palindrome and sum is greater than 25.");
            else
                System.out.println(originalInteger + " is  a palindrome and sum is less than 25.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}