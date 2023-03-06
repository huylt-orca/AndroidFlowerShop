package com.example.androidflower.service;

import android.content.Context;
import android.widget.Toast;

import com.example.androidflower.model.TestAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface TestService {

    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    TestService testService = new Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(TestService.class);


    @GET("posts")
    Call<List<TestAPI>> testAPI();

    // @Query("page") int page
    //
    @GET("users/{user}/repos")
    Call<List<TestAPI>> listRepos(@Path("user") String user);

    @POST("users/new")
    Call<TestAPI> createUser(@Body TestAPI user);



    public default void callApi(Context context){
        TestService.testService.testAPI().enqueue(new Callback<List<TestAPI>>() {
            @Override
            public void onResponse(Call<List<TestAPI>> call, Response<List<TestAPI>> response) {

                Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<TestAPI>> call, Throwable t) {
                Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
