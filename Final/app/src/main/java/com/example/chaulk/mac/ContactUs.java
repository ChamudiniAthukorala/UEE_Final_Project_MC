package com.example.chaulk.mac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ContactUs extends AppCompatActivity {

    ImageView ahome;
    ImageView searchico;
    ImageView cartico;
    ImageView orderico;
    ImageView profileico;
    EditText namefield;
    EditText contacfield;
    EditText emailfield;
    EditText messagefield;
    Button submitcon;

    DatabaseReference databasecontact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        
        ahome = findViewById(R.id.contacthomeico);
        searchico = findViewById(R.id.contactsearchico);
        cartico = findViewById(R.id.contactcartico);
        orderico = findViewById(R.id.contactorderico);
        profileico = findViewById(R.id.contactprofileico);
        namefield = findViewById(R.id.editText10);
        contacfield = findViewById(R.id.editText11);
        emailfield = findViewById(R.id.editText13);
        messagefield = findViewById(R.id.editText12);
        submitcon = findViewById(R.id.button7);

        databasecontact = FirebaseDatabase.getInstance().getReference("contact");


        ahome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(ContactUs.this, Home.class);
                startActivity(homeView);
            }
        });
        searchico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(ContactUs.this, Home.class);
                startActivity(homeView);
            }
        });
        cartico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(ContactUs.this, Home.class);
                startActivity(homeView);
            }
        });
        orderico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(ContactUs.this, Home.class);
                startActivity(homeView);
            }
        });
        profileico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeView = new Intent(ContactUs.this, Home.class);
                startActivity(homeView);
            }
        });
        submitcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addContact();
                Intent homeView = new Intent(ContactUs.this, Home.class);
                startActivity(homeView);
            }
        });

    }
    public void addContact(){
        String name = namefield.getText().toString();
        String phoneno = contacfield.getText().toString();
        String emailad = emailfield.getText().toString();
        String messagecontent = messagefield.getText().toString();

        if(!TextUtils.isEmpty(name) && !TextUtils.isEmpty(emailad) &&!TextUtils.isEmpty(messagecontent)){
            String iddb = databasecontact.push().getKey();
            Contact cont = new Contact(name,phoneno,emailad,messagecontent);
            databasecontact.child(iddb).setValue(cont);
            Toast.makeText(this, "You will contacted soon!",Toast.LENGTH_LONG).show();
            Intent homeView = new Intent(ContactUs.this, Home.class);
            startActivity(homeView);
        }
        else{
            Toast.makeText(this, "You Should enter name,email, and your comment!",Toast.LENGTH_LONG).show();
            Intent homeView = new Intent(ContactUs.this, ContactUs.class);
            startActivity(homeView);
        }

    }
}
