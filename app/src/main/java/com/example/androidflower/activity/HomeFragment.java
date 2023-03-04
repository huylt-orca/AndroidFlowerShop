package com.example.androidflower.activity;

//<<<<<<< HEAD
//import android.os.Bundle;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
//import androidx.recyclerview.widget.GridLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import com.example.androidflower.R;
//import com.example.androidflower.apdater.FlowerHomeApdater;
//import com.example.androidflower.model.Flower;
//
//
//public class HomeFragment extends Fragment {
//
//    private RecyclerView rcvFlowerHome;
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false);
//
//    }
//
//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        rcvFlowerHome = view.findViewById(R.id.rcv_flower_home);
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),3);
//        rcvFlowerHome.setLayoutManager(gridLayoutManager);
//
//        FlowerHomeApdater apdater = new FlowerHomeApdater(getContext(),Flower.getListChamp());
//
//        rcvFlowerHome.setAdapter(apdater);
//        apdater.notifyDataSetChanged();
//
//    }
//=======

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ViewFlipper;

import com.example.androidflower.R;
import com.example.androidflower.adapter.BestSellerAdapter;
import com.example.androidflower.adapter.ClothingAdapter;
import com.example.androidflower.model.BestSeller;
import com.example.androidflower.model.Clothing;
import com.google.android.material.navigation.NavigationView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    private RecyclerView bestSellerRecyclerView,clothingRecyclerView;
    ViewFlipper viewFlipper;
    ConstraintLayout card_flower;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        viewFlipper = (ViewFlipper) view.findViewById(R.id.viewflipperhome);
        ActionViewFlipper();


        // best RecyclerView
        bestSellerRecyclerView = (RecyclerView) view.findViewById(R.id.bestSellerRecyclerview);
        bestSellerRecyclerView.setHasFixedSize(true);
        bestSellerRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext() , LinearLayoutManager.HORIZONTAL , false));

        List<BestSeller> bestSellerList = new ArrayList<>();

        bestSellerList.add(new BestSeller(R.drawable.bg_1 , "Up to 20% off"));
        bestSellerList.add(new BestSeller(R.drawable.bg_2 , "Up to 20% off"));
        bestSellerList.add(new BestSeller(R.drawable.bg_3 , "Up to 20% off"));

        BestSellerAdapter bestSellerAdapter = new BestSellerAdapter(bestSellerList);



        bestSellerRecyclerView.setAdapter(bestSellerAdapter);


        // clothing RecyclerView
        clothingRecyclerView = (RecyclerView) view.findViewById(R.id.clothingRecyclerview);
        clothingRecyclerView.setHasFixedSize(true);
        clothingRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext() , LinearLayoutManager.HORIZONTAL , false));

        List<Clothing> clothingList = new ArrayList<>();

        clothingList.add(new Clothing(R.drawable.bg_4 , "Up to 30% off"));
        clothingList.add(new Clothing(R.drawable.bg_2 , "Up to 30% off"));
        clothingList.add(new Clothing(R.drawable.bg_4 , "Up to 30% off"));

        ClothingAdapter clothingAdapter = new ClothingAdapter(clothingList);
        clothingRecyclerView.setAdapter(clothingAdapter);


        return view;
    }



    private void ActionViewFlipper(){
        ArrayList<String> ads = new ArrayList<>();
        ads.add("https://img.tgdd.vn/imgt/f_webp,fit_outside,quality_100/https://cdn.tgdd.vn/Products/Images/42/289712/iPhone-14-thumb-trang-600x600.jpg");
        ads.add("https://img.tgdd.vn/imgt/f_webp,fit_outside,quality_100/https://cdn.tgdd.vn/Products/Images/44/270031/asus-rog-strix-gaming-g513ih-r7-4800h-8gb-512gb-4gb-600x600.jpg");
        for (int i = 0;i<ads.size(); i++){
            ImageView imageView = new ImageView(this.getContext());
            Picasso.with(this.getContext()).load(ads.get(i)).placeholder(R.drawable.bg_1).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);

        }
        viewFlipper.setFlipInterval(5000);
        viewFlipper.setAutoStart(true);
        Animation animation_slide_in = AnimationUtils.loadAnimation(getContext(),R.anim.slide_in_right);
        Animation animation_slide_out = AnimationUtils.loadAnimation(getContext(),R.anim.slide_out_right);
        viewFlipper.setInAnimation(animation_slide_in);
        viewFlipper.setOutAnimation(animation_slide_out);
    }

//>>>>>>> 2c4e3f7d4809032205010cdffef2a42f4d5a3b7d
}