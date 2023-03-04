package com.example.androidflower.model;

<<<<<<< HEAD
import com.example.androidflower.R;

import java.util.ArrayList;
import java.util.List;

public class Flower {

    private int image;
    private String name;

    public Flower(int image, String name) {
        this.image = image;
        this.name = name;
=======
public class Flower {

    private int image;

    public Flower(int image ){
        this.image = image;
>>>>>>> 2c4e3f7d4809032205010cdffef2a42f4d5a3b7d
    }

    public int getImage() {
        return image;
    }

<<<<<<< HEAD
    public String getName() {
        return name;
    }


    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Flower> getListChamp(){
        List<Flower> list = new ArrayList<>();
        list.add(new Flower(R.drawable.hoacamtu,"Hoa cẩm tú"));
        list.add(new Flower(R.drawable.hoahong,"Hoa hồng"));
        list.add(new Flower(R.drawable.hoasen,"Hoa sen"));
        list.add(new Flower(R.drawable.hoatra,"Hoa trà"));
        list.add(new Flower(R.drawable.hoahuongduong,"Hoa huóng dương"));

        list.add(new Flower(R.drawable.hoacamtu,"Hoa cẩm tú"));
        list.add(new Flower(R.drawable.hoahong,"Hoa hồng"));
        list.add(new Flower(R.drawable.hoasen,"Hoa sen"));
        list.add(new Flower(R.drawable.hoatra,"Hoa trà"));
        list.add(new Flower(R.drawable.hoahuongduong,"Hoa huóng dương"));

        list.add(new Flower(R.drawable.hoacamtu,"Hoa cẩm tú"));
        list.add(new Flower(R.drawable.hoahong,"Hoa hồng"));
        list.add(new Flower(R.drawable.hoasen,"Hoa sen"));
        list.add(new Flower(R.drawable.hoatra,"Hoa trà"));
        list.add(new Flower(R.drawable.hoahuongduong,"Hoa huóng dương"));

        return list;
    }

=======
>>>>>>> 2c4e3f7d4809032205010cdffef2a42f4d5a3b7d
}
