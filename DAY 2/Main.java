package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        employee e1 = new employee("boom",32,"mumbai");
        System.out.println("The Name is " + e1.getName() + "\n"+"The age is "+ e1.getAge() + "\n"+"The city is "+ e1.getCity());
        System.out.println();

        employee e2 = new employee("loom", 32,"LA");
        System.out.println("The Name is " + e2.getName() + "\n"+"The age is "+ e2.getAge() + "\n"+"The city is "+ e2.getCity());
        System.out.println();
        
    }
}
