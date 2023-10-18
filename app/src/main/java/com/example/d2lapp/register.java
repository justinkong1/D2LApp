package com.example.d2lapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class register extends AppCompatActivity {

    database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Intent i = getIntent();
        database = (database)i.getSerializableExtra("database");

        TextView Email = (TextView) findViewById(R.id.email);
        TextView Name = (TextView) findViewById(R.id.name);
        TextView password = (TextView) findViewById(R.id.password);

        Button loginbtn = (Button) findViewById(R.id.confirmLogin);

        loginbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                boolean valid = true;
                String email = Email.getText().toString();
                String name = Name.getText().toString();
                String pass = password.getText().toString();

                if(email.length() < 3) {
                    valid = false;
                    Toast.makeText(register.this, "Invalid Email", Toast.LENGTH_SHORT).show();
                }
                if(name.length() < 3) {
                    valid = false;
                    Toast.makeText(register.this, "Invalid Name", Toast.LENGTH_SHORT).show();
                }
                if(pass.length() < 3) {
                    valid = false;
                    Toast.makeText(register.this, "Invalid Password", Toast.LENGTH_SHORT).show();
                }

                if(valid) {
                    user u = new user(email,name,pass);
                    database.addUser(u);
                    Toast.makeText(register.this, "Account Successfully Created!\nYou may now login!", Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(register.this,MainActivity.class);
                    i.putExtra("database",database);

                    startActivity(i);
                }

            }
        });
    }
}