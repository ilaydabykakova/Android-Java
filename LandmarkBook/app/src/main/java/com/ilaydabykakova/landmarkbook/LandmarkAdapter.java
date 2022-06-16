package com.ilaydabykakova.landmarkbook;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ilaydabykakova.landmarkbook.databinding.RecylclerRowBinding;

import java.util.ArrayList;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>{

    ArrayList<LandMark> landMarkArrayList;
    //Parameter olarak array list çekebiliriz.
    public LandmarkAdapter(ArrayList<LandMark> landMarkArrayList) {
        this.landMarkArrayList = landMarkArrayList;
    }

    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Bu method bizden bir LandmarkHolder'dan bir obje döndürmemizi istiyor.
        //Bizden binding isticek.
        RecylclerRowBinding recylclerRowBinding = RecylclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LandmarkHolder(recylclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandmarkHolder holder, int position) {
        holder.binding.recylcerTextView.setText(landMarkArrayList.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(),DetailsActivity.class);
                //chosenLandmark = landMarkArrayList.get(position); -> Yanlış Kullanım
                //intent.putExtra("landmark",landMarkArrayList.get(holder.getAdapterPosition()));
                Singleton singleton = Singleton.getInstance();
                //Neyi set edildiyse get deails sınıfında onu döndürecek.
                singleton.setSentLandmark(landMarkArrayList.get(holder.getAdapterPosition()));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }
    //Xml kaç kere oluşturulağını söyler.
    //landmarkarray list burda çektiğimiz için size kullanabiliriz.
    @Override
    public int getItemCount() {
        return landMarkArrayList.size();
    }

    public class LandmarkHolder extends RecyclerView.ViewHolder{
        //Yardımcı sınıf, Görünümleri tutucak bir sınıf.(Görünümü tut)

       private RecylclerRowBinding binding;
       //LanmarkHolder her oluşturulduğunda benden bir binding isticek.
        public LandmarkHolder(RecylclerRowBinding binding) {
            //binding görünüme çevirmek için getroot
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
