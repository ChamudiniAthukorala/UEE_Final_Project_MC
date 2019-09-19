package com.example.chaulk.mac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Profile extends AppCompatActivity {

    ImageView phomehome;
    ImageView psearchico;
    ImageView pcartico;
    ImageView porderico;
    ImageView pprofileico;
    Button aboutusbtn;
    Button contactusbtn;
    Button paymentbtn;
    Button deliverybtn;
    Button completeprofilebtn;
    Button ppayment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        phomehome = findViewById(R.id.phomeico);
        psearchico = findViewById(R.id.psearchico);
        pcartico = findViewById(R.id.pcartico);
        porderico = findViewById(R.id.porderico);
        pprofileico = findViewById(R.id.pprofileico);
        //------------------------------------------------------------------------
        aboutusbtn = findViewById(R.id.paboutus);
        contactusbtn = findViewById(R.id.pcontactus);
        paymentbtn = findViewById(R.id.ppayment);
        deliverybtn = findViewById(R.id.pdelivery);
        completeprofilebtn = findViewById(R.id.pcompleteprofile);
        ppayment = findViewById(R.id.ppayment);

        phomehome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Profile.this, Home.class);
                startActivity(homeView);
            }
        });
        psearchico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Profile.this, Search.class);
                startActivity(homeView);
            }
        });
        pcartico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Profile.this, Cart.class);
                startActivity(homeView);
            }
        });
        porderico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Profile.this, Orders.class);
                startActivity(homeView);
            }
        });
        pprofileico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Profile.this, Profile.class);
                startActivity(homeView);
            }
        });
        //--------------------------------------------------------------------------
        aboutusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Profile.this, About.class);
                startActivity(homeView);
            }
        });contactusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Profile.this, ContactUs.class);
                startActivity(homeView);
            }
        });paymentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Profile.this, Profile.class);
                startActivity(homeView);
            }
        });deliverybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Profile.this, DeliveryDetails.class);
                startActivity(homeView);
            }
        });completeprofilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Profile.this, Profile.class);
                startActivity(homeView);
            }
        });
        ppayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Profile.this, Payment.class);
                startActivity(homeView);
            }
        });


    }
}
