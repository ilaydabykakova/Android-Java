package com.ilaydabykakova.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Context
        //Activity Context
        //App Context -> getApplicationContext() -> Both situation it can be worked.
        //(MainActivity.this == this) its same in here.
        Toast.makeText(this, "Toast Message", Toast.LENGTH_LONG).show();
    }
    public void save(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Save");
        alert.setMessage("Are you sure ?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //save
                Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //save
                Toast.makeText(MainActivity.this, "Not Saved!", Toast.LENGTH_LONG).show();
            }
        });
        alert.show();
    }
}