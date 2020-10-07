package com.daviazevedodev.getninjaclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.daviazevedodev.getninjaclone.model.Services;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;
import com.synnapps.carouselview.ViewListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CarouselView carouselView;
    private ServiceAdapter serviceAdapter;

    int[] sampleImages = {R.drawable.colega, R.drawable.academia, R.drawable.colega, R.drawable.colega, R.drawable.colega, R.drawable.colega, R.drawable.colega, R.drawable.colega, R.drawable.colega, R.drawable.colega, R.drawable.colega};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);

        carouselView.setImageListener(imageListener);


        serviceAdapter = new ServiceAdapter(new ArrayList<>(Services.fakeServices()));
        RecyclerView rv = findViewById(R.id.reclyclerview_name);
        rv.setAdapter(serviceAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));

    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };


}