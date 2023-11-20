package com.example.hw33;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class mainFragment extends Fragment {

    private RecyclerView rvSport;
    private ArrayList<String> sportlist = new ArrayList<>();
    private SportAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view,@NonNull Bundle savedInstanceState){
        initView();
        loadData();
        initAdepter();
    }

    private void initAdepter() {
        adapter=new SportAdapter(sportlist);
        rvSport.setAdapter(adapter);
    }

    private void loadData() {
        sportlist.add("Баскетбол");
        sportlist.add("Футбол");
        sportlist.add("Греко-римская борьба");
        sportlist.add("Хоккей");
        sportlist.add("UFC");
        sportlist.add("Шахматы");
        sportlist.add("Настольный Теннис");
        sportlist.add("Тхэквондо");
        sportlist.add("Дзюдо");
        sportlist.add("Формула-1");
    }

    private void initView() {
        rvSport=requireActivity().findViewById(R.id.rv_sports);
    }
}