package com.example.hw33;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SportAdapter extends RecyclerView.Adapter<SportViewHolder> {
    private ArrayList<String> sportlist;

    public SportAdapter(ArrayList<String> sportlist) {
        this.sportlist = sportlist;
    }


    @NonNull
    @Override
    public SportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SportViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sport,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SportViewHolder holder, int position) {
        holder.bind(sportlist.get(position));
    }

    @Override
    public int getItemCount() {
        return sportlist.size();
    }
}
