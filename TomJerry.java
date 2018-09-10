package com.company;

import java.util.Scanner;

public class TomJerry{

    public static void main(String[] args) {
	// write your code here
                int input;
/*                Scanner in = new Scanner(System.in);
                input =  in.nextInt();*/
                TomJerry  object=new TomJerry();
                System.out.print(object.TomJerry1(24));

                }
        public String TomJerry1(int input) {
            if (input < 20 && input > 30) {
                System.out.println("Wrong Input");
            } else if (input % 2 == 0) {
                return "Jerry";
            } else {
                String s = "Tom";
                return s;
            }
            return null;
        }
}