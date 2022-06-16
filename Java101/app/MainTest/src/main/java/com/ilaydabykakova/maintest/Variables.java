package com.ilaydabykakova.maintest;

import java.sql.SQLOutput;

public class Variables {
    public static void main(String[] args) {
        // Variables - Not : değişkenin tipini sonradan değiştiremezsin.

        // Integer (Tam Sayı)
        int x = 5;
        int y = 11;
        System.out.println(y/x);

        //Long
        long mylong = 10;
        System.out.println(mylong/5);

        // Double -Float
        double z = 5.0;
        double a = 11.0;
        System.out.println(a/z);
        float b = 10.0f;

        //Yarı çap hesaplama
        double pi = 3.14;
        int r = 2;
        System.out.println("Yarı çap hesaplama: "+ (2*pi*r));

        //String
        String name = "James";
        String surname = "Hetfield";
        name = "Larse";

        String fullname = name +" "+surname;
        System.out.println(name+" "+surname);
        System.out.println(fullname);

        //Boolean
        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);

        //Final (sabit değer)
        final int myInteger = 5;

        System.out.println("myInteger : "+myInteger);

        //myInteger = 4;
        System.out.println("myInteger : "+myInteger);


    }
}
