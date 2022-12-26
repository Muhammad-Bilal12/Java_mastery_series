package chapter6;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        While Loop

//        int num = 1;
//        while (num <=5){
//            System.out.println(num);
//            num++;
//        }


        Scanner sc = new Scanner(System.in);
       boolean istrue= false;

        while(!istrue){
            System.out.print("Are you hire me (Yes or No): ");
            istrue = sc.nextBoolean();
        }

        System.out.println("Thanks For Hiring me.😉😉");


    }
}
