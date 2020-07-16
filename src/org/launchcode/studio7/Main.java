package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD Metallica = new CD("Metallica", 1000, "Contains music", "CD");
        DVD powerRangers = new DVD("Power Rangers", 5000, "Season 4", "DVD");


        // TODO: Call each CD and DVD method to verify that they work as expected.
        Metallica.spinDisc();
        Metallica.readData();
        Metallica.storeData();
        Metallica.writeData();
        powerRangers.writeData();
        powerRangers.readData();
        powerRangers.spinDisc();
        powerRangers.storeData();

    }
}
