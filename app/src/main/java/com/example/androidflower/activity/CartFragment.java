package com.example.androidflower.activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;

import com.example.androidflower.R;
import com.example.androidflower.adapter.BestSellerAdapter;
import com.example.androidflower.adapter.FlowerAdapter;
import com.example.androidflower.model.BestSeller;
import com.example.androidflower.model.Flower;

import java.util.ArrayList;
import java.util.List;


public class CartFragment extends Fragment {
    private RecyclerView flowerRecyclerview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        flowerRecyclerview = (RecyclerView) view.findViewById(R.id.flowerRecyclerview);
        flowerRecyclerview.setHasFixedSize(true);
        flowerRecyclerview.setLayoutManager(new LinearLayoutManager(this.getContext() , LinearLayoutManager.VERTICAL , false));

        List<Flower> FlowerList = new ArrayList<>();

        FlowerList.add(new Flower(R.drawable.hoa_1 ,"hoa"));
        FlowerList.add(new Flower(R.drawable.bg_4 ,"hoa"));
        FlowerList.add(new Flower(R.drawable.hoa_1 ,"hoa"));
        FlowerList.add(new Flower(R.drawable.bg_2 ,"hoa"));
        FlowerList.add(new Flower(R.drawable.bg_2 ,"hoa"));
        FlowerList.add(new Flower(R.drawable.hoa_1 ,"hoa"));
        FlowerList.add(new Flower(R.drawable.hoa_1,"hoa" ));
        FlowerList.add(new Flower(R.drawable.hoa_1,"hoa" ));
        FlowerList.add(new Flower(R.drawable.hoa_1,"hoa" ));
        FlowerList.add(new Flower(R.drawable.hoa_1,"hoa" ));
        FlowerList.add(new Flower(R.drawable.hoa_1 ,"hoa"));
        FlowerList.add(new Flower(R.drawable.hoa_1 ,"hoa"));

        FlowerAdapter flowerAdapter = new FlowerAdapter(FlowerList);

        flowerRecyclerview.setAdapter(flowerAdapter);
        return view;
    }
}