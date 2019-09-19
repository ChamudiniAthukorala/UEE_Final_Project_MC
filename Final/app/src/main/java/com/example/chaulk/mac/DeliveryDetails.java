package com.example.chaulk.mac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DeliveryDetails extends AppCompatActivity {


    ImageView dhome;
    ImageView dsearchico;
    ImageView dcartico;
    ImageView dorderico;
    ImageView dprofileico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_details);

        dhome = findViewById(R.id.deliveryhomeico);
        dsearchico = findViewById(R.id.deliverysearchico);
        dcartico = findViewById(R.id.deliverycartico);
        dorderico = findViewById(R.id.deliveryorderico);
        dprofileico = findViewById(R.id.deliveryprofileico);

        dhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(DeliveryDetails.this, Home.class);
                startActivity(homeView);
            }
        });
        dsearchico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(DeliveryDetails.this, Search.class);
                startActivity(homeView);
            }
        });
        dcartico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(DeliveryDetails.this, Cart.class);
                startActivity(homeView);
            }
        });
        dorderico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(DeliveryDetails.this, Orders.class);
                startActivity(homeView);
            }
        });
        dprofileico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(DeliveryDetails.this, Profile.class);
                startActivity(homeView);
            }
        });
    }
}
