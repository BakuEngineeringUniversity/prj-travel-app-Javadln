package com.nicat.travelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ImageView backButton = findViewById(R.id.imageView4);
        backButton.setOnClickListener(this::onClick);

        Button startBookingButton = findViewById(R.id.button);
        startBookingButton.setOnClickListener(v -> {
            // "Start Booking Your Trip" butonuna tıklandığında
            // Sipariş yapma menüsünü açmak için gerekli intenti başlat
            Intent intent = new Intent(DetailsActivity.this, OrderActivity.class);
            startActivity(intent);
        });
    }

    private void onClick(View view) {
        onBackPressed();
    }
}
