package com.company;

public class Elephant extends Animal {
    //type of animal in a zoo w/ unique properties to this animal
    private int trunkSize;
    private String tuskLength;

    public int getTrunkSize() {
        return trunkSize;
    }

    public String getTuskLength() {
        return tuskLength;
    }

    public Elephant(String name, int speed, String sex, int age, String genusClassification,
                    boolean endangered, int trunkSize, String tuskLength)
    {
        super(name, speed, sex, age, genusClassification, endangered);
        this.trunkSize = trunkSize;
        this.tuskLength = tuskLength;
    }//end Elephant constructor

    @Override
    public void Print() {
        super.Print();

    }

}//end Elephant
