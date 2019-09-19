package com.example.chaulk.mac;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Orders extends AppCompatActivity {

    ImageView ohomehome;
    ImageView osearchico;
    ImageView ocartico;
    ImageView oorderico;
    ImageView oprofileico;
    Button reorder;
    Button psorder;
    Button upordrs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        ohomehome = findViewById(R.id.ohomeico);
        osearchico = findViewById(R.id.osearchico);
        ocartico = findViewById(R.id.ocartico);
        oorderico = findViewById(R.id.oorderico);
        oprofileico = findViewById(R.id.oprofileico);
        reorder = findViewById(R.id.reorder);
        psorder = findViewById(R.id.pastorders);
        upordrs = findViewById(R.id.upcoming);


        ohomehome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Orders.this, Home.class);
                startActivity(homeView);
            }
        });
        osearchico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Orders.this, Search.class);
                startActivity(homeView);
            }
        });
        ocartico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Orders.this, Cart.class);
                startActivity(homeView);
            }
        });
        oorderico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Orders.this, Orders.class);
                startActivity(homeView);
            }
        });
        oprofileico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Orders.this, Profile.class);
                startActivity(homeView);
            }
        });
        reorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Orders.this, UpdateOrder.class);
                startActivity(homeView);
            }
        });
        psorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Orders.this, Orders.class);
                startActivity(homeView);
            }
        });
        upordrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Orders.this, UpcomingOrders.class);
                startActivity(homeView);
            }
        });
    }
}
