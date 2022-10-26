package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import  com.google.android.gms.maps.SupportMapFragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
//my maps api key (DONT USE BOZOS GET YOUR OWN FROM HERE:
//https://console.cloud.google.com/google/maps-apis/start
//AIzaSyCwLj_-la4UiknNMljtf5xCrAFbbkt3_h0
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager();
            findFragmentById(R.id.maps);
            mapFragment.getMapAsync(this);
    }
}