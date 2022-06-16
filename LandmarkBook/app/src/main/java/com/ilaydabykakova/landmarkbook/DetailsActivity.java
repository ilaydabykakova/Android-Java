package com.ilaydabykakova.landmarkbook;



import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ilaydabykakova.landmarkbook.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Intiliaze
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //ViewBinding
        //binding.countryText.setText("");

        Intent intent = getIntent();

        //Casting
        //LandMark selectedLandmark =(LandMark) intent.getSerializableExtra("landmark");
        //LandMark selectedLandmark = chosenLandmark; -> Güvenli Değil.

        //Singleton için her zaman aynı objeyi oluştuyor.
        Singleton singleton = Singleton.getInstance();
        LandMark selectedLandmark = singleton.getSentLandmark();
        binding.nameText.setText(selectedLandmark.name);
        binding.countryText.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);

    }
}