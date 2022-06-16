package com.ilaydabykakova.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.ilaydabykakova.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<LandMark> landMarkArrayList;
    private ActivityMainBinding binding;
    //Yanlış kullanım : static her yerden uluşalabilir.
    //static LandMark chosenLandmark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Initialize
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Initialization

        landMarkArrayList = new ArrayList<>();
        // Data
        LandMark pisa = new LandMark("Pisa","Italy",R.drawable.pisa);
        LandMark effel = new LandMark("Effel","France",R.drawable.effel);
        LandMark colosseum = new LandMark("Colosseum","Italy",R.drawable.colosseum);
        LandMark lodonbridge = new LandMark("London Bridge","UK",R.drawable.lodonbridge);

        // Array List
        landMarkArrayList.add(pisa);
        landMarkArrayList.add(effel);
        landMarkArrayList.add(colosseum);
        landMarkArrayList.add(lodonbridge);

        //recylerviews farklı layoutlarda olabilir.
        //setLayoutManager linear mı yoksa grid mi olucak şeklinde soruyor.
        //Aktive içinde olduğunda this yapabiliriz.
        binding.recylcerView.setLayoutManager(new LinearLayoutManager(this));
        //LandmarkAdapter sınıfından artık landmark array list kullanabiliriz.
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landMarkArrayList);
        //Oluşturulan adapter set edildi.
        binding.recylcerView.setAdapter(landmarkAdapter);
        /* - LİSTVİEW -
        //Adapter
        //ListView

        //Mapping - Called names
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landMarkArrayList.stream().map(landMark -> landMark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Toast.makeText(getApplicationContext(),landMarkArrayList.get(position).name,Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark",landMarkArrayList.get(position));
                startActivity(intent);
            }
        });
        */

    }
}