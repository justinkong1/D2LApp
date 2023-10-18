package com.example.d2lapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        Intent i = getIntent();
        user user = (user)i.getSerializableExtra("user");

        TextView loggedIn = (TextView) findViewById(R.id.loggedInAs);
        loggedIn.setText("Logged in as: " + user.getName());

        Button startHereButton = (Button) findViewById(R.id.startHere);
        Button learningModulesButton = (Button) findViewById(R.id.learningModules);

        startHereButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(content.this,StartHere.class);
                i.putExtra("user",user);
                startActivity(i);
            }
        });

        learningModulesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(content.this,modules.class);
                i.putExtra("user",user);
                startActivity(i);
            }
        });

    }
}