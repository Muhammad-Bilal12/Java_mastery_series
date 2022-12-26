package chapter6;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

//        Problem: Find The nth number of fibonacci series

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while (count < n) {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println("The Fibonacci number is "+ b);


    }
}
