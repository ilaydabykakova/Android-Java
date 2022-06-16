package com.ilaydabykakova.oppproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public static void main(String[] args) {
                   /*  User myUser = new User();
        myUser.name = "İlayda";
        myUser.job = "Test Engineer";

        User newUser = new User();
        myUser.name = "Kirk";
        myUser.job = "Musician";*/

        User myUser = new User("İlayda","Test Engineer");
        System.out.println(myUser.name);
        System.out.println(myUser.job);
        //Abstract
        System.out.println(myUser.information());

        //Encapsulation
        Musician james = new Musician("James","Guitar",50);
        System.out.println(james.getAge());
        james.setAge(60,"kirk");//Şifre yanlış olduğu için tekrardan 50 yazar.
        System.out.println(james.getAge());

        //Inheritance
        SuperMusician lars = new SuperMusician("Chester Bennigton","Vocalist",41);
        //Burda super musician ile musician classın çağırdık.
        //Musician da constructor varsa SuperMusician da olucak. SuperMusician musicianda bulnan propertyleri getirir.
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //Polymorphism

        //Static Polymorphism
        Mathematics result = new Mathematics();
        System.out.println(result.sum());
        System.out.println(result.sum(12,24));
        System.out.println(result.sum(12,24,54));

        //Dynamic Polymorphism
        Animal myAnimal = new Animal();
        myAnimal.sing();//animal class

        Dog barley = new Dog();
        barley.sing(); //This is dog !
        barley.test(); // animal class

        //Interface
        Piano myPiano = new Piano();
        myPiano.brand = "Yamaha";
        System.out.println(myPiano.brand);
        myPiano.digital = true;
        System.out.println(myPiano.digital);
        myPiano.info();


    }
}