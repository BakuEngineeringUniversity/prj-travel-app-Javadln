package com.nicat.travelapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nicat.travelapp.adapter.RecentsAdapter;
import com.nicat.travelapp.adapter.TopPlacesAdapter;
import com.nicat.travelapp.model.RecentsData;
import com.nicat.travelapp.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Goygol Lake","Ganja","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Tufandag","Gabala","From $300",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Goygol Lake","Ganja","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Tufandag ","Gabala","From $300",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Goygol Lake","Ganja","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Tufandag ","Gabala","From $300",R.drawable.recentimage2));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Shahdagh ","Gusar","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Shahdagh ","Gusar","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Shahdagh ","Gusar","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Shahdagh ","Gusar","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Shahdagh ","Gusar","$200 - $500",R.drawable.topplaces));

        setTopPlacesRecycler(topPlacesDataList);


        ImageView profileIcon = findViewById(R.id.profileIcon);
        profileIcon.setOnClickListener(v -> openProfileLayout());

        ImageView hotelIcon = findViewById(R.id.Hotel);
        hotelIcon.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, TopPlacesRowItemActivity.class);
            startActivity(intent);
        });
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(v -> openProfileLayout());

        ImageView recentIcon = findViewById(R.id.Recent);
        recentIcon.setOnClickListener(v -> openRecentRowItemActivity());

        @SuppressLint({"WrongViewCast", "MissingInflatedId", "LocalSuppress"}) ImageView LoginButton = findViewById(R.id.LoginButton);
        LoginButton.setOnClickListener(v -> openLoginActivity());


    }
    

    private void openLoginActivity() {
    }

    private void openRecentRowItemActivity() {
        Intent intent = new Intent(MainActivity.this, RecentRowItemActivity.class);
        startActivity(intent);
    }


    private  void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);



    }

    private  void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }
    private void openProfileLayout() {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }








    public static class SignUpActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_signup);








        }
    }





}
