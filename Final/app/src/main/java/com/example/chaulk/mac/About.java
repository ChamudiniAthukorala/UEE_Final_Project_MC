package com.example.chaulk.mac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class About extends AppCompatActivity {

    ImageView ahome;
    ImageView searchico;
    ImageView cartico;
    ImageView orderico;
    ImageView profileico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ahome = findViewById(R.id.abouthomeico);
        searchico = findViewById(R.id.aboutsearchico);
        cartico = findViewById(R.id.aboutcartico);
        orderico = findViewById(R.id.aboutorderico);
        profileico = findViewById(R.id.aboutprofileico);

        ahome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(About.this, Home.class);
                startActivity(homeView);
            }
        });
        searchico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(About.this, Home.class);
                startActivity(homeView);
            }
        });
        cartico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(About.this, Home.class);
                startActivity(homeView);
            }
        });
        orderico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(About.this, Home.class);
                startActivity(homeView);
            }
        });
        profileico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(About.this, Home.class);
                startActivity(homeView);
            }
        });

    }
}
