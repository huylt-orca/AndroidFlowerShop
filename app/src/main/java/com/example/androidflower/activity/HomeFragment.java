package com.example.androidflower.activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidflower.R;
import com.example.androidflower.apdater.FlowerHomeApdater;
import com.example.androidflower.model.Flower;


public class HomeFragment extends Fragment {

    private RecyclerView rcvFlowerHome;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rcvFlowerHome = view.findViewById(R.id.rcv_flower_home);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),3);
        rcvFlowerHome.setLayoutManager(gridLayoutManager);

        FlowerHomeApdater apdater = new FlowerHomeApdater(getContext(),Flower.getListChamp());

        rcvFlowerHome.setAdapter(apdater);
        apdater.notifyDataSetChanged();

    }
}