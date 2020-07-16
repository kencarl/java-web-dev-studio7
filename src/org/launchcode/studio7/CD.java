package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {


    public CD(String name, int capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("Spinning a 200 - 500 rpm.");

    }

    @Override
    public void storeData() {
        System.out.println("Storing data");

    }

    @Override
    public void readData() {
        System.out.println("Reading data");

    }

    @Override
    public void writeData() {
        System.out.println("Writing data");

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
