package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       int[] arr = new int[5];
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the array elements");
       for(int i = 0;i < 5;i++){
           arr[i] = sc.nextInt();
       }

       int s = 0;

       for(int i = 0;i<5;i++){
           s = s+arr[i];
       }
        System.out.println("\nThe sum of elements is " + s);


    }

}
