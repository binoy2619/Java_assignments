package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       avenger[] arr = new avenger[5];
       for(int i = 0;i<5;i++){
           arr[i] = new avenger();
       }
       for(avenger obj : arr){
           obj.getDetails();
           obj.displayDetails();
       }

    }

}
