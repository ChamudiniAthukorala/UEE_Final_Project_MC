package com.example.chaulk.mac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Track extends AppCompatActivity {

    ImageView thome;
    ImageView tsearchico;
    ImageView tcartico;
    ImageView torderico;
    ImageView tprofileico;
    Button track;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);

        thome = findViewById(R.id.trackhomeico);
        tsearchico = findViewById(R.id.tracksearchico);
        tcartico = findViewById(R.id.trackcartico);
        torderico = findViewById(R.id.trackorderico);
        tprofileico = findViewById(R.id.trackprofileico);
        track = findViewById(R.id.button);

        thome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Track.this, Home.class);
                startActivity(homeView);
            }
        });
        tsearchico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Track.this, Search.class);
                startActivity(homeView);
            }
        });
        tcartico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Track.this, Cart.class);
                startActivity(homeView);
            }
        });
        torderico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Track.this, Orders.class);
                startActivity(homeView);
            }
        });
        tprofileico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Track.this, Profile.class);
                startActivity(homeView);
            }
        });
        track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Track.this, Map.class);
                startActivity(homeView);
            }
        });
    }
}
