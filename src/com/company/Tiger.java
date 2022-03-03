package com.company;

public class Tiger extends Animal {
    //type of animal in a zoo w/ unique properties to this animal
    private String stripeColor;
    private String tailLength;


    public String getStripeColor() {
        return stripeColor;
    }

    public String getNationality() {
        return tailLength;
    }

    public Tiger(String name, int speed, String sex, int age, String genusClassification,
                 boolean endangered, String color, String tailLength){
        super(name, speed, sex, age, genusClassification, endangered);
        this.stripeColor = color;
        this.tailLength = tailLength;
    }

    @Override
    public void Print() {
        super.Print();
    }
}//end Tiger
