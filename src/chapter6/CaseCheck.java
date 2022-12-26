package chapter6;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

//        Problem: Take String as an Input and find the alphabetic-case

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("LowerCase");
        } else {
            System.out.println("Uppercase");
        }


    }
}
