package com.company;

import java.util.Scanner;

public class Animal {
    //Create basic properties of an Animal
    private String name;
    private int speed; //small, medium, large
    private String sex; //male or female
    private int age; //age in years
    private String genusClassification;
    private boolean endangered;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getGenusClassification() {
        return genusClassification;
    }

    public boolean isEndangered() {
        return endangered;
    }

    public Animal(String name, int speed, String sex, int age,
                  String genusClassification, boolean endangered ){
        this.name = name;
        this.speed = speed;
        this.sex = sex;
        this.age = age;
        this.genusClassification = genusClassification;
        this.endangered = endangered;
    }

    public void Print(){
        System.out.println( "**************************************" + '\n' +
                            "Name: " +  name +'\n' +
                            "Max Speed: " + speed + "mph \n" +
                            "Sex: "  + sex +'\n' +
                            "Age: "  + age + " years old \n" +
                            "Genus: " + genusClassification +'\n' +
                            "Endangered?: " + endangered);

    }
}//end Animal
