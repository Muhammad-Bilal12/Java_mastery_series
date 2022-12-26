package chapter6;

import java.util.Scanner;

public class MostOccurenceNumber {

    public static void main(String[] args) {

//       Problem : Cont the Occurrence in rhe given number
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("Enter the number you want to count: ");
        int n = sc.nextInt();

        int count = 0;

//        while (num != 0){
//            if(num%10==n){
//                count++;
//            }
//
//            num = num/10;
//        }
//        System.out.println(count);


//        Code bu Kunal
        while (num > 0) {
            int rem = num % 10;
            if (rem == n) {
                count++;
            }
            num /= 10;
        }

        System.out.println(count);
    }

}
