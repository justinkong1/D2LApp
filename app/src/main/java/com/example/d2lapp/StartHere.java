package com.example.d2lapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class StartHere extends AppCompatActivity {

    database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_here);
        Intent i = getIntent();
        user user = (user)i.getSerializableExtra("user");

        TextView welcome = (TextView) findViewById(R.id.welcomeUser);
        welcome.setText("Welcome " + user.getName()+"!");

        Button welcomeButton = (Button) findViewById(R.id.welcomeButton);
        Button syllabusButton = (Button) findViewById(R.id.syllabusButton);
        Button labButton = (Button) findViewById(R.id.labButton);
        Button projectButton = (Button) findViewById(R.id.projectButton);

        welcomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartHere.this,Welcome.class));
            }
        });
        syllabusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartHere.this,syllabus.class));
            }
        });
        labButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartHere.this,Lab.class));
            }
        });
        projectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartHere.this,ProjectInstruction.class));
            }
        });
    }
}

