package chapter1;

import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
//        Variable Declaration
        byte rollNo;
        int s1;
        int s2;
        int s3;
        int total = 300;
        float percentage;
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.println("*** Marksheet Generator***");

        System.out.print("Enter your Name: ");
        name = sc.nextLine();

        System.out.print("Enter your Rollno: ");
        rollNo = sc.nextByte();

        System.out.print("Enter your Marks for Subject 1: ");
        s1 = sc.nextInt();
        System.out.print("Enter your Marks for Subject 2: ");
        s2 = sc.nextInt();
        System.out.print("Enter your Marks for Subject 3: ");
        s3 = sc.nextInt();

//        Percentage calculation

        percentage = ((s1+s2+s3)*100)/total;

        System.out.println("*** Marksheet ***");

        System.out.println("Name : "+ name);
        System.out.println("RollNo : "+ rollNo);

        System.out.println("Subject\t | Marks Obtained\t | Out of\n");
        System.out.println("Urdu\t | "+s1+"\t | 100");
        System.out.println("Math\t | "+s2+"\t | 100");
        System.out.println("English\t | "+s3+"\t | 100");
        System.out.println("");
        System.out.println("Total\t | "+(s1+s2+s3)+"\t | "+total);
        System.out.println("Percentage : "+ percentage+'%');




    }
}
