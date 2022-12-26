package chapter6;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {

//        Problem : take 3 number than input and find the largest number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
/*
//       Solution 1
        int max = a;
        if(b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        System.out.println("maximum number is "+ max);
*/

//        Solution 2
//        int max =0;
//        if (a> b){
//            max = a;
//        }else {
//            max = b;
//        }
//        if (c>b){
//            max = c;
//        }
//        System.out.println("maximum number is "+ max);


//        Solution 3
//        int max = Math.max(Math.max(a,b),c);
//        System.out.println(max);


//        Like This: Find the minimum number
        int min = Math.min(Math.min(a,b),c);
        System.out.println(min);



    }
}
