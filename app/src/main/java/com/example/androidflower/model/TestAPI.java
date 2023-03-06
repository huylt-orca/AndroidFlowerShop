package com.example.androidflower.model;

import com.google.gson.annotations.SerializedName;

public class TestAPI {

    private int id;
    private String title;
    private String body;

    @SerializedName("userId")
    private int user;
}
