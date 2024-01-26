package com.nicat.travelapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.nicat.travelapp.R;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

       // ImageView backButton = findViewById(R.id.imageView4);
       // backButton.setOnClickListener(this::onClick);

        Button startBookingButton = findViewById(R.id.button);
        startBookingButton.setOnClickListener(v -> {
            Intent intent = new Intent(DetailsActivity.this, OrderActivity.class);
            startActivity(intent);
        });
    }

//    private void onClick(View view) {
//        super.onBackPressed();
//    }
}
