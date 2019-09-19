package com.example.chaulk.mac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class UpdateOrder extends AppCompatActivity {

    Button UOAddtoCart;
    Button plus;
    Button minusb;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_order);

        UOAddtoCart = findViewById(R.id.UOAddtoCart);
        plus = findViewById(R.id.UOadd);
        minusb = findViewById(R.id.UOminus);
        result = findViewById(R.id.UOquantityLevel);

        UOAddtoCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(UpdateOrder.this, Cart.class);
                startActivity(homeView);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i =0;
                String val = result.getText().toString();
                i = Integer.valueOf(val);
                i = i + 1;
                result.setText(String.valueOf(i));

            }
        });
        minusb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i =0;
                String val = result.getText().toString();
                i = Integer.valueOf(val);
                i = i - 1;
                if(i<=0){
                    result.setText(String.valueOf(1));
                }
                else{
                result.setText(String.valueOf(i));
                }
            }
        });
    }


}
