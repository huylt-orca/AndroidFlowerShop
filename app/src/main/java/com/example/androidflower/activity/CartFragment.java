package com.example.androidflower.activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
<<<<<<< HEAD
=======
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
>>>>>>> 2c4e3f7d4809032205010cdffef2a42f4d5a3b7d

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< HEAD

import com.example.androidflower.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CartFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CartFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CartFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CartFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CartFragment newInstance(String param1, String param2) {
        CartFragment fragment = new CartFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
=======
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
>>>>>>> 2c4e3f7d4809032205010cdffef2a42f4d5a3b7d

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
<<<<<<< HEAD
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cart, container, false);
=======

        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        flowerRecyclerview = (RecyclerView) view.findViewById(R.id.flowerRecyclerview);
        flowerRecyclerview.setHasFixedSize(true);
        flowerRecyclerview.setLayoutManager(new LinearLayoutManager(this.getContext() , LinearLayoutManager.VERTICAL , false));

        List<Flower> FlowerList = new ArrayList<>();

        FlowerList.add(new Flower(R.drawable.hoa_1 ));
        FlowerList.add(new Flower(R.drawable.bg_4 ));
        FlowerList.add(new Flower(R.drawable.hoa_1 ));
        FlowerList.add(new Flower(R.drawable.bg_2 ));
        FlowerList.add(new Flower(R.drawable.bg_2 ));
        FlowerList.add(new Flower(R.drawable.hoa_1 ));
        FlowerList.add(new Flower(R.drawable.hoa_1 ));
        FlowerList.add(new Flower(R.drawable.hoa_1 ));
        FlowerList.add(new Flower(R.drawable.hoa_1 ));
        FlowerList.add(new Flower(R.drawable.hoa_1 ));
        FlowerList.add(new Flower(R.drawable.hoa_1 ));
        FlowerList.add(new Flower(R.drawable.hoa_1 ));

        FlowerAdapter flowerAdapter = new FlowerAdapter(FlowerList);

        flowerRecyclerview.setAdapter(flowerAdapter);
        return view;
>>>>>>> 2c4e3f7d4809032205010cdffef2a42f4d5a3b7d
    }
}