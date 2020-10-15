package com.company;
import java.util.Scanner;

public class avenger {
    private String name;
    private int age;
    private String power;
    private String weapon;
    private String planet;

    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter the name");
        name = sc.nextLine();
        System.out.println("Enter the age");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the power");
        power = sc.nextLine();
        System.out.println("Enter the weapon");
        weapon = sc.nextLine();
        System.out.println("Enter the planet");
        planet = sc.nextLine();
    }

    public void displayDetails(){
        System.out.println("The name is " + name + "\nthe age is " + age + "\nthe power is " + power + "\nthe weapon is " + weapon + "\nthe planet is " + planet);
    }
}
