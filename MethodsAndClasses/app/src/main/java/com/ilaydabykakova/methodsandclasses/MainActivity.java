package com.ilaydabykakova.methodsandclasses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on create called");

        testMethod();
        System.out.println(math(5,4));
        System.out.println(myMethod("Stringler"));
        username = "";
        makeMusicians();

        makeSimpsons();
    }
    public void makeSimpsons(){
        Simpsons homer = new Simpsons("Homer",50,"Nuclear");
        System.out.println(homer.getName());
        homer.setName("Homer Simpson");
        System.out.println(homer.getName());
    }
    public void  makeMusicians(){
        //instance
        Musicians james = new Musicians("James","Guitar",50);
        System.out.println(james.instrument);
        /*james.name = "James";
        james.instrument = "Guitar";
        james.age = 50;*/
    }
    public void testMethod(){
        username = "Kirk";
        int x = 4+4;
        System.out.println("Value of x:"+x);
    }
    public int math(int a,int b){
        username="Mark";
        return a + b;
    }
    public String myMethod(String string){
        return string + " new Method";
    }
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called");
    }
}