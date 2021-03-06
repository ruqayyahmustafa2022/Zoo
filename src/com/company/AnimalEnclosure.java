package com.company;
import java.util.*;

import java.util.ArrayList;

public class AnimalEnclosure extends Building {
    //AnimalEnclosure should have some properties including a list of Animals in the enclosure
    private List<String> zooAnimals =  new ArrayList<>();
    private String enclosureSize; //small, medium, large
    private String enclosureType; //house, cage, pit
    private boolean indoorOrOutdoor; //is the enclosure indoor or outdoor

    public List<String> getZooAnimals() {
        return zooAnimals;
    }

    public String getEnclosureSize() {
        return enclosureSize;
    }

    public String getEnclosureType() {
        return enclosureType;
    }

    public boolean isIndoorOrOutdoor() {
        return indoorOrOutdoor;
    }

    public void AnimalEnclosure(List<String> zooAnimals, String enclosureSize, String enclosureType,
                                boolean indoorOrOutdoor){
        this.zooAnimals = zooAnimals;
        this.enclosureSize = enclosureSize;
        this.enclosureType = enclosureType;
        this.indoorOrOutdoor = indoorOrOutdoor;
    }//end animalEnclosure constructor

    @Override
    public void Print() {
        super.Print();

    }

}//end AnimalEnclosure
