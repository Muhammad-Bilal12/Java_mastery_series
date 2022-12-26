package chapter6;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // Loops means Repeatation

        //problrm print number from 1 to 10

        //for loop Syntax
        /*
        for(initialization; condition; increament/decrement){
        body
        }
         */

//        for (int num = 1; num<=5;num++) {
//            System.out.println(num);
//
//        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
            System.out.println(i+ " HELLO WORLD!");
        }

    }
}
