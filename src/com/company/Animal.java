package com.company;

public class Animal {
    //Create basic properties of an Animal
    private String size; //small, medium, large
    private String sex; //male or female
    private int age; //age in years
    private String genusClassification;

    public void setSize(String size) {
        this.size = size;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGenusClassification(String genusClassification) {
        this.genusClassification = genusClassification;
    }

    public String getSize() {
        return size;
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
}//end Animal
