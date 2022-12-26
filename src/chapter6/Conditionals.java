package chapter6;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

//        Condition Syntax
//        if (true) {
//            when the condition is true
//        } else {
//            do this
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary:");
        int salary = sc.nextInt();

//        if (salary>10000){
//            salary +=2000;
//
//        }else {
//            salary+=1000;
//        }

//     Multiple if statement

        if (salary > 20000) {
            salary += 2000;

        } else if (salary > 1000) {
            salary += 1000;

        } else {
            salary += 500;
        }


        System.out.println(salary);

    }
}
