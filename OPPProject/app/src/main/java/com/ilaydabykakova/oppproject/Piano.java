package com.ilaydabykakova.oppproject;

public class Piano implements Instrument,HouseDecor {
    String brand;
    boolean digital;

// Interface called methods with override
    @Override
    public void info() {
        System.out.println("My Piano !");
    }
}
