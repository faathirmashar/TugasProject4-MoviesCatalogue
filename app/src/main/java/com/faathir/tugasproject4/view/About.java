package com.faathir.tugasproject4.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.faathir.tugasproject4.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class About extends AppCompatActivity {

    private CircleImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setTitle("About");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageView = findViewById(R.id.image_about);

        Glide.with(this)
                .load("https://image.tmdb.org/t/p/w600_and_h900_bestv2/k5ROulKM24IJtv0jcRj1berhd8I.jpg")
                .into(imageView);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
