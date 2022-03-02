package com.company;
import java.util.*;

import java.util.ArrayList;

public class AnimalEnclosure extends Building {
    //AnimalEnclosure should have some properties including a list of Animals in the enclosure
    private List<String> zooAnimals =  new ArrayList<>();
    private String enclosureSize; //small, medium, large
    private String enclosureType; //house, cage, pit
    private boolean indoorOrOutdoor; //is the enclosure indoor or outdoor

    public void AnimalEnclosure(){
        zooAnimals = zooAnimals;
        enclosureSize = enclosureSize;
        enclosureType = enclosureType;
        indoorOrOutdoor = indoorOrOutdoor;
    }//end animalEnclosure constructor


}//end AnimalEnclosure
