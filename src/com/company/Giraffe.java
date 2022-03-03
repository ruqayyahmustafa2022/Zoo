package com.company;

public class Giraffe extends Animal{
    //type of animal in a zoo w/ unique properties to this animal
    private double neckLength;
    private double tallestHeight;

    public double getNeckLength() {
        return neckLength;
    }

    public double getTallestHeight() {
        return tallestHeight;
    }

    public Giraffe(String name, int speed, String sex, int age, String genusClassification,
                   boolean endangered, double length, double height)
    {
        super(name, speed, sex, age, genusClassification, endangered);
        this.neckLength = length;
        this.tallestHeight = height;
    }//end Elephant constructor

    @Override
    public void Print() {
        super.Print();

    }
}//end Giraffe
