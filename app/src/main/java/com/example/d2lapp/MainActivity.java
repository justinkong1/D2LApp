package com.example.d2lapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    database database = new database();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent();
        if(i.hasExtra("database")) database = (database)i.getSerializableExtra("database");

        TextView email = (TextView) findViewById(R.id.email);
        TextView password = (TextView) findViewById(R.id.password);

        Button loginbtn = (Button) findViewById(R.id.confirmLogin);
        Button registerbtn = (Button) findViewById(R.id.registerButton);

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToRegister();
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String user = email.getText().toString();
                String pass = password.getText().toString();

                if (database.hasEmail(user)) {
                    user u = database.getUserFromEmail(user);
                    if(u.pass.equals(pass)) {
                        Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        sendToContent(u);
                    } else {
                        Toast.makeText(MainActivity.this, "Invalid Password", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Username doesn't exist", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void sendToContent(user user) {
        Intent i = new Intent(MainActivity.this,content.class);
        i.putExtra("user",user);
        startActivity(i);
    }

    private void sendToRegister() {
        Intent i = new Intent(MainActivity.this,register.class);
        i.putExtra("database",database);
        startActivity(i);

    }
}
