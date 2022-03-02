package com.company;

import java.util.List;

public class GuestServices extends Building {
    /*Create new class that extends Building named GuestServices to represent the various restaurants, bathrooms,
    visitor centers, etc. available to zoo guests
    GuestService should have several properties that a zoo guest service building might have, including a list of
    services offered
    In the console, allow a user to get information about each GuestService and Enclosure building and print
    that information to the console.
     */

    private String concessions;
    private String restrooms;
    private String lockers;
    private String giftShops;
    private String aTMs;
    private List<String> guestServices;      //information booth, lost & found, stroller rentals ,
                                            // wheelchair rentals, sensory bag checkout, first responder

    public GuestServices(){
        concessions = "Zoofari Cafe";
        restrooms = "Restroom";
        lockers = "Lockers";
        giftShops = "Gift Shop";
        aTMs = "ATM";
        guestServices.add(0, "Information booth");
        guestServices.add(1, "Lost & Found");
        guestServices.add(2, "Stroller Rentals");
        guestServices.add(3, "Wheelchair Rentals");
        guestServices.add(4, "Sensory Bag Checkout");
        guestServices.add(5, "First Responder");


    }//end GuestServices




}//end GuestServices
