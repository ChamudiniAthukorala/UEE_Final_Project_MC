package com.example.chaulk.mac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UpcomingOrders extends AppCompatActivity {

    Button button5;
    Button psorder1;
    Button upordrs1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_orders);

        button5 = findViewById(R.id.button5);
        psorder1 = findViewById(R.id.pastorders2);
        upordrs1 = findViewById(R.id.upcoming2);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(UpcomingOrders.this, Track.class);
                startActivity(homeView);
            }
        });
        psorder1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(UpcomingOrders.this, Orders.class);
                startActivity(homeView);
            }
        });
        upordrs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(UpcomingOrders.this, UpcomingOrders.class);
                startActivity(homeView);
            }
        });
    }
}
