package com.nicat.travelapp;

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

        // Now here we will add some dummy data in our model class

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


    // Hi all, today we are going to make a holiday tour app.
    // so lets see i will show you what we are going to build
    // so lets get started.
    // before getting started make sure to subscribe and hit the bell i con to get notified
    // everytime i post a video.
    // lets first import image assets
    // Now we will add a recycler view for recents data.
    // lets make a model class first.
    // now we create a adapter class for holding data
    // our adapter class is ready now we will setup recyclerview

    // So we have setup recents items recyclerview
    //Now we do same setup for top places
    // lets do it fast.
    // Now i will add a bottom navigation
    // now we will set the details activity
    // when user click on any of places details activity will open
    // So this app is done.
    // Please like share and subscribe
    // if any question plz do comment
    // Thanks for watching see you in the next tutorial

}
