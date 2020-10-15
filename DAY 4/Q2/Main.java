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
        System.out.println("\nThe odd elements are");
       for(int i = 0;i<5;i++){
           if(i%2!=0)
               System.out.println(arr[i]);
       }

    }

}
