package com.company;

public class Building {
    //Create basic properties of a Building
    private int noOfStories;
    private int sqFeet; //6000 is a good number
    private String foundation; //concrete or
    private int windowCount;
    private int doorCount;

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setNoOfStories(int noOfStories) {
        this.noOfStories = noOfStories;
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

    public int getNoOfStories() {
        return noOfStories;
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


}//end Building
