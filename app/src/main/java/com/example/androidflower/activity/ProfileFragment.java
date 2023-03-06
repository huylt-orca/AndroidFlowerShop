package com.example.androidflower.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.androidflower.R;


public class ProfileFragment extends Fragment {


    Button editProfileBtn;
    Button changePasswordBtn ;
    Button hotlineShopBtn;
    Button logoutBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        editProfileBtn = (Button) view.findViewById(R.id.edit_profile_profile);
        changePasswordBtn = (Button)  view.findViewById(R.id.changepasswordbtn);
        hotlineShopBtn = (Button) view.findViewById(R.id.hotlinebtn);
        logoutBtn = (Button) view.findViewById(R.id.logoutbtn);

        hotlineShopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),LoginActivity.class));
//               Fragment tmp = new CartFragment();
//               FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
//               fm.replace(R.id.container,tmp).commit();

            }
        });


        return view;
    }
}