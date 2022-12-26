package chapter6;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
//        problem : Reverse the given Integer

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int r = 0;

        while (num > 0) {
            int rem = num % 10;
            r = r * 10 + rem;
            num /= 10;
        }
        System.out.println("Reverse Order: "+r);
    }
}
