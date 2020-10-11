package com.company;

public class employee {
    public String name;
    public int age;
    public String city;

    employee(String name,int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
