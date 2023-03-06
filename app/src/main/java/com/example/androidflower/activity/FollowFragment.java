package com.example.androidflower.activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.androidflower.R;
import com.example.androidflower.adapter.FlowerAdapter;
import com.example.androidflower.adapter.FollowAdapter;
import com.example.androidflower.model.Flower;

import java.util.ArrayList;
import java.util.List;


public class FollowFragment extends Fragment {
    private RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_follow, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.rcv_follow);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext() , LinearLayoutManager.VERTICAL , false));


        FollowAdapter followAdapter = new FollowAdapter(Flower.getListFlower());

        recyclerView.setAdapter(followAdapter);
        return view;
    }
}