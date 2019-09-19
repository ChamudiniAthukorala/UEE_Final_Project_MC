package com.example.chaulk.mac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Cart extends AppCompatActivity {

    ImageView carthome;
    ImageView cartsearchico;
    ImageView cartcartico;
    ImageView cartorderico;
    ImageView cartprofileico;
    TextView place;
    TextView edit;
    TextView change;
    TextView remove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        carthome = findViewById(R.id.chomeico4);
        cartsearchico = findViewById(R.id.csearchico4);
        cartcartico = findViewById(R.id.ccartico4);
        cartorderico = findViewById(R.id.corderico4);
        cartprofileico = findViewById(R.id.cprofileico4);
        place = findViewById(R.id.carsubtotalfee);
        edit = findViewById(R.id.cartedit);
        change = findViewById(R.id.cartchange);
        remove = findViewById(R.id.textView47);

        carthome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Cart.this, Home.class);
                startActivity(homeView);
            }
        });
        cartsearchico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Cart.this, Search.class);
                startActivity(homeView);
            }
        });
        cartcartico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Cart.this, Cart.class);
                startActivity(homeView);
            }
        });
        cartorderico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Cart.this, Orders.class);
                startActivity(homeView);
            }
        });
        cartprofileico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Cart.this, Profile.class);
                startActivity(homeView);
            }
        });
        place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Cart.this, Track.class);
                startActivity(homeView);
            }
        });
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Cart.this, UpdateOrder.class);
                startActivity(homeView);
            }
        });
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Cart.this, ChangePaymentMethod.class);
                startActivity(homeView);
            }
        });
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Cart.this, EmptyCart.class);
                startActivity(homeView);
            }
        });


    }
}
