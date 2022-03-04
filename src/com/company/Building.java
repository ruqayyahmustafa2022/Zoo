package com.company;

public class Building {
    //Create basic properties of a Building
    private String location;
    private int sqFeet; //6000 is a good number
    private String foundation; //concrete or
    private int windowCount;
    private int doorCount;

    public void setDoorCount(String location) {
        this.location = location;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }


    public void setSqFeet(int sqFeet) {
        this.sqFeet = sqFeet;
    }

    public void setWindowCount(int windowCount) {
        this.windowCount = windowCount;
    }

    public int getDoorCount() {
        return doorCount;
    }


    public int getSqFeet() {
        return sqFeet;
    }

    public int getWindowCount() {
        return windowCount;
    }

    public String getFoundation() {
        return foundation;
    }

    public void Print(){
        System.out.println( "**************************************" + '\n' +
                "Location:" + location + '\n' +
                "Square Footage: " +  sqFeet +'\n');
    }//end Print
}//end Building
