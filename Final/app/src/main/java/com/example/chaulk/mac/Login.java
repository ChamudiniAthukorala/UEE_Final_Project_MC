package com.example.chaulk.mac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    Button loginbtn;
    TextView forgotPasswordbtn;
    TextView registerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginbtn = findViewById(R.id.loginlogin);
        forgotPasswordbtn = findViewById(R.id.loginforgot);
        registerbtn = findViewById(R.id.loginregister);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Login.this, Home.class);
                startActivity(homeView);
            }
        });
        forgotPasswordbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Login.this, Forgot.class);
                startActivity(homeView);
            }
        });
        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(Login.this, Register.class);
                startActivity(homeView);
            }
        });
    }
}
