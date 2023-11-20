package com.example.hw33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SportViewHolder extends RecyclerView.ViewHolder {

    private TextView tvSport;

    public SportViewHolder(@NonNull View itemView) {
        super(itemView);
        tvSport=itemView.findViewById(R.id.tv_sport);
    }

    public void bind(String sport){
        tvSport.setText(sport);
    }
}
