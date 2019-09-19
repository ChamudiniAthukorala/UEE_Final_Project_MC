package com.example.chaulk.mac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EmptyCart extends AppCompatActivity {

    ImageView ahome;
    ImageView searchico;
    ImageView cartico;
    ImageView orderico;
    ImageView profileico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty_cart);

        ahome = findViewById(R.id.echome);
        searchico = findViewById(R.id.ecsearch);
        cartico = findViewById(R.id.eccart);
        orderico = findViewById(R.id.ecorder);
        profileico = findViewById(R.id.ecprofile);

        ImageView imgcartempt = findViewById(R.id.ecimage);
        imgcartempt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(EmptyCart.this, Home.class);
                startActivity(homeView);
            }
        });

        ahome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(EmptyCart.this, Home.class);
                startActivity(homeView);
            }
        });
        searchico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(EmptyCart.this, Home.class);
                startActivity(homeView);
            }
        });
        cartico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(EmptyCart.this, Home.class);
                startActivity(homeView);
            }
        });
        orderico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(EmptyCart.this, Home.class);
                startActivity(homeView);
            }
        });
        profileico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(EmptyCart.this, Home.class);
                startActivity(homeView);
            }
        });
    }
}
