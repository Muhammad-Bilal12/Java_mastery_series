package chapter6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //        Assignment: Create a Basic Calculator

        Scanner sc = new Scanner(System.in);
        System.out.println("**CALCULATOR**");
        char op;
        int result = 0, a, b;
        while (true) {
            System.out.print("Enter an Operator:");
            op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter Value 1:");
                a = sc.nextInt();
                System.out.print("Enter Value 2:");
                b = sc.nextInt();

                if (op == '+') {
                    result = a + b;
                }
                if (op == '-') {
                    result = a - b;
                }
                if (op == '*') {
                    result = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        result = a / b;
                    } else {
                        result = 0;
                    }
                }
                if (op == '%') {
                    result = a % b;
                }
                System.out.println(result);
            } else if (op == 'x' || op == 'X') {
                System.out.println("Calculator is ShutDown");
                break;
            } else {
                System.out.println("Please Insert a Valid Operator");
            }

        }

    }
}
