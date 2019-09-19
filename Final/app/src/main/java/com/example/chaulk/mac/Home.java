package com.example.chaulk.mac;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Home extends AppCompatActivity {

    ImageView homehome;
    ImageView searchico;
    ImageView cartico;
    ImageView orderico;
    ImageView profileico;
    Button orderscrolbtn1;
    Button orderscrolbtn2;
    Button orderscrolbtn3;
    Button button2;
    RelativeLayout viewPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        homehome = findViewById(R.id.homeico);
        searchico = findViewById(R.id.searchico);
        cartico = findViewById(R.id.cartico);
        orderico = findViewById(R.id.orderico);
        profileico = findViewById(R.id.profileico);
        orderscrolbtn1 = findViewById(R.id.orderscrolbtn1);
        orderscrolbtn2 = findViewById(R.id.orderscrolbtn2);
        orderscrolbtn3 = findViewById(R.id.orderscrolbtn3);
        button2 = findViewById(R.id.button2);
        viewPage = findViewById(R.id.relativeLayout2);


        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPage);
        ImageAdapter adapterView = new ImageAdapter(this);
        mViewPager.setAdapter(adapterView);


        homehome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Home.this, Home.class);
                startActivity(homeView);
            }
        });
        searchico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Home.this, Search.class);
                startActivity(homeView);
            }
        });
        cartico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Home.this, Cart.class);
                startActivity(homeView);
            }
        });
        orderico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Home.this, Orders.class);
                startActivity(homeView);
            }
        });
        profileico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Home.this, Profile.class);
                startActivity(homeView);
            }
        });
        //first button navigation to order page
        orderscrolbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Home.this, UpdateOrder.class);
                startActivity(homeView);
            }
        });
        //second button navigation to order page
        orderscrolbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Home.this, UpdateOrder.class);
                startActivity(homeView);
            }
        });
        //third button navigation to order page
        orderscrolbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Home.this, UpdateOrder.class);
                startActivity(homeView);
            }
        });
        //last button navigation to order page
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Home.this, UpdateOrder.class);
                startActivity(homeView);
            }
        });
        //clicking on promotions
        viewPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Home.this, UpdateOrder.class);
                startActivity(homeView);
            }
        });

    }

}
