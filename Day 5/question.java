package com.company;

import java.util.Scanner;
public class question {

    String ques,op1,op2,op3;
    int correctAns,userAns;

    Scanner sc = new Scanner(System.in);

    public boolean askQuestion(){
        System.out.println("Q - "+ques);
        System.out.println("Option 1 - "+op1);
        System.out.println("Option 2 - "+ op2);
        System.out.println("Option 3 - " + op3);
        System.out.println();
        System.out.println("Choose the correct option");
        userAns = sc.nextInt();
        if(correctAns == userAns)
            return true;
        return false;

    }

}
