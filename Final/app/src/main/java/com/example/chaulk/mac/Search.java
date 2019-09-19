package com.example.chaulk.mac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Search extends AppCompatActivity {

    ImageView searchhome;
    ImageView searchsearchico;
    ImageView searchcartico;
    ImageView searchorderico;
    ImageView searchprofileico;

    Button searchorderscrolbtn1;
    Button searchorderscrolbtn2;
    Button searchorderscrolbtn3;
    Button searchbutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchhome = findViewById(R.id.shomeico);
        searchsearchico = findViewById(R.id.ssearchico);
        searchcartico = findViewById(R.id.scartico);
        searchorderico = findViewById(R.id.sorderico);
        searchprofileico = findViewById(R.id.sprofileico);

        searchorderscrolbtn1 = findViewById(R.id.searchorderscrolbtn1);
        searchorderscrolbtn2 = findViewById(R.id.searchorderscrolbtn2);
        searchorderscrolbtn3 = findViewById(R.id.searchorderscrolbtn3);
        searchbutton2 = findViewById(R.id.searchbutton2);

        searchhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Search.this, Home.class);
                startActivity(homeView);
            }
        });
        searchsearchico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Search.this, Search.class);
                startActivity(homeView);
            }
        });
        searchcartico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Search.this, Cart.class);
                startActivity(homeView);
            }
        });
        searchorderico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Search.this, Orders.class);
                startActivity(homeView);
            }
        });
        searchprofileico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Search.this, Profile.class);
                startActivity(homeView);
            }
        });

        searchorderscrolbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Search.this, UpdateOrder.class);
                startActivity(homeView);
            }
        });
        searchorderscrolbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Search.this, UpdateOrder.class);
                startActivity(homeView);
            }
        });
        searchorderscrolbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Search.this, UpdateOrder.class);
                startActivity(homeView);
            }
        });
        searchbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Search.this, UpdateOrder.class);
                startActivity(homeView);
            }
        });
    }
}
