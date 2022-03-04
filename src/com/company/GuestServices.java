package com.company;

import java.util.ArrayList;
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
    private List<String> guestServices = new ArrayList<>();      //information booth, lost & found, stroller rentals ,
                                            // wheelchair rentals, sensory bag checkout, first responder


    public String getConcessions() {
        return concessions;
    }

    public String getRestrooms() {
        return restrooms;
    }

    public String getLockers() {
        return lockers;
    }

    public String getaTMs() {
        return aTMs;
    }

    public List<String> getGuestServices() {
        return guestServices;
    }

    public GuestServices() {
        this.concessions = "Zoofari Cafe";
        this.restrooms = "Restroom";
        this.lockers = "Lockers";
        this.giftShops = "Gift Shop";
        this.aTMs = "ATM";
        this.guestServices.add(0, "Information booth");
        this.guestServices.add(1, "Lost & Found");
        this.guestServices.add(2, "Stroller Rentals");
        this.guestServices.add(3, "Wheelchair Rentals");
        this.guestServices.add(4, "Sensory Bag Checkout");
        this.guestServices.add(5, "First Responder");
    }
        public void PrintServices(){
            System.out.println(
                    "1. Zoofari Cafe \n" +
                    "2. Restroom \n" +
                    "3. Lockers \n" +
                    "4. Gift Shop \n" +
                    "5. ATM \n" +
                    "6. Information booth \n" +
                    "7. Lost & Found \n" +
                    "8. Stroller Rentals\n" +
                    "9. Wheelchair Rentals \n" +
                    "10.Sensory Bag Checkout\n" +
                    "11.First Responder\n");
        }


    }//end GuestServices





