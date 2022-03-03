package com.company;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	/*We Programmed A Zoo

    --AnimalEnclosure should have some properties including a list of Animals in the enclosure
    --Create new class that extends Building named GuestServices to represent the various restaurants, bathrooms,
      visitor centers, etc. available to zoo guests
    --GuestService should have several properties that a zoo guest service building might have, including a list of
      services offered
    --In the console, allow a user to get information about each GuestService and Enclosure building and print that
      information to the console.
    --Bonus: Create a menu item that lets the user search for a specific animal type and find what enclosure they are
      in.
    --Super Bonus: Create a menu option for zoo employees to add animals to enclosures and add services to guest
      service building
      */

        File file = new File("/Users/ruqayyahmustafa/Documents/zooAnimals.txt");
        Scanner animalFile = new Scanner(file);
        Scanner usrInput = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<Animal>();
        int i = 0;
        while(animalFile.hasNext()){
            System.out.println("This is where the loop starts");
            String name = animalFile.next();
            int speed = animalFile.nextInt();
            String sex = animalFile.next();
            int age = animalFile.nextInt();
            String genusClassification = animalFile.next();
            boolean endangered = animalFile.nextBoolean();

            animalList.add(i, new Animal(name, speed,sex,age,genusClassification, endangered));
            animalList.get(i).Print();
            i++;


        }

       /*
        while(animalFile.hasNext()){
            String data = animalFile.next();
            System.out.println(data);
        } */
        animalFile.close();


        System.out.println("Welcome to the ZOO!");

        //Print list of Guest services and enclosures and info about it
        System.out.println("Select a Menu Item:");

        //Bonus: Search for specific animal type and the enclosure
        System.out.println("Search for one of our Animals: ");

        //Super Bonus: Employee add zoo animal and it's enclosure
        System.out.println("Menu [Select 1 or 2] "
                            + '\n' + "1. Add an Animal"
                            + '\n' + "2. Add a Guest Service");




    }//end main
}//end Main
