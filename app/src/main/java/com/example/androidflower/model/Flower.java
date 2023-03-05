package com.example.androidflower.model;

//<<<<<<< HEAD
import com.example.androidflower.R;

import java.util.ArrayList;
import java.util.List;

public class Flower {

    private int id;
    private int image;
    private String name;
    private double price;

    public Flower(int image, String name) {
        this.image = image;
        this.name = name;
        this.price = 0;
    }

    public Flower(int id , int image, String name, double price) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Flower> getListFlower(){
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
}
