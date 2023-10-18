package com.example.d2lapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LabSyl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_syl);
        Intent i = getIntent();
        String lab= (String)i.getSerializableExtra("lab");
        String slides= (String)i.getSerializableExtra("slides");
        String labName = (String)i.getSerializableExtra("labName");

        TextView labTextView = (TextView) findViewById(R.id.labName);
        labTextView.setText(labName);
        Button labButton = (Button) findViewById(R.id.Lab);

        labButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                gotoUrl(lab);
            }
        });
        Button slidesButton = (Button) findViewById(R.id.slides);

        slidesButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                gotoUrl(slides);
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}