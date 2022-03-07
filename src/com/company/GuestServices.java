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
    public int answer; // wheelchair rentals, sensory bag checkout, first responder


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
        this.concessions = "1. Zoofari Cafe";
        this.restrooms = "2. Restroom";
        this.lockers = "3. Lockers";
        this.giftShops = "4. Gift Shop";
        this.aTMs = "5. ATM";
        this.guestServices.add(0, "6. Information booth");
        this.guestServices.add(1, "7. Lost & Found");
        this.guestServices.add(2, "8. Stroller Rentals");
        this.guestServices.add(3, "9. Wheelchair Rentals");
        this.guestServices.add(4, "10. Sensory Bag Checkout");
        this.guestServices.add(5, "11. First Responder");
    }
        public void PrintServices(){

            System.out.println(
                    concessions +  '\n' +
                    restrooms + '\n' +
                    lockers + '\n' +
                    giftShops + '\n' +
                    aTMs);
            for(int i = 0; i< guestServices.size();i++) {
                System.out.println(guestServices.get(i));
            }//for i
        }//end Print Guest Services


    }//end GuestServices





