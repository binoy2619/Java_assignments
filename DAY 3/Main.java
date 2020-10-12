package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Q1
        int a,b,c,d,e;
        double percentage;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of sub1");
        a = sc.nextInt();

        System.out.println("Enter marks of sub2");
        b = sc.nextInt();

        System.out.println("Enter marks of sub3");
        c = sc.nextInt();

        System.out.println("Enter marks of sub4");
        d = sc.nextInt();

        System.out.println("Enter marks of sub5");
        e = sc.nextInt();

        percentage = ((a+b+c+d+e)/500.0)*100.0;

        if(percentage >= 90)
            System.out.println("GRADE A");
        else if(percentage >= 70)
            System.out.println("GRADE B");
        else if(percentage >= 50)
            System.out.println("GRADE C");
        else if(percentage >= 40)
            System.out.println("GRADE A");
        else
            System.out.println("FAIL");

    }

}
