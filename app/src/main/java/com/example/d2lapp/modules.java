package com.example.d2lapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;


public class modules extends AppCompatActivity implements View.OnClickListener{

    private Button Lab1;
    private Button Lab2;
    private Button Lab3;
    private Button Lab4;
    private Button Lab5;
    private Button Lab6;
    private Button Lab7;
    private Button Lab8;
    private Button Lab9;
    private Button Lab10;
    private Button Lab11;
    private Button Lab12;
    private Button Lab13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules);

        Lab1 = findViewById(R.id.Lab1);
        Lab2 = findViewById(R.id.Lab2);
        Lab3 = findViewById(R.id.Lab3);
        Lab4 = findViewById(R.id.Lab4);
        Lab5 = findViewById(R.id.Lab5);
        Lab6 = findViewById(R.id.Lab6);
        Lab7 = findViewById(R.id.Lab7);
        Lab8 = findViewById(R.id.Lab8);
        Lab9 = findViewById(R.id.Lab9);
        Lab10 = findViewById(R.id.Lab10);
        Lab11 = findViewById(R.id.Lab11);
        Lab12 = findViewById(R.id.Lab12);
        Lab13 = findViewById(R.id.Lab13);

        // Set OnClickListener for each button
        Lab1.setOnClickListener(this);
        Lab2.setOnClickListener(this);
        Lab3.setOnClickListener(this);
        Lab4.setOnClickListener(this);
        Lab5.setOnClickListener(this);
        Lab6.setOnClickListener(this);
        Lab7.setOnClickListener(this);
        Lab8.setOnClickListener(this);
        Lab9.setOnClickListener(this);
        Lab10.setOnClickListener(this);
        Lab11.setOnClickListener(this);
        Lab12.setOnClickListener(this);
        Lab13.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String lab ="",slides="";
        Button b = (Button)v;
        String buttonName = b.getText().toString();
        switch (v.getId()) {
            case R.id.Lab1:
                lab = "https://developer.android.com/courses/pathways/android-development-with-kotlin-1";
                slides = "https://docs.google.com/presentation/d/1aStRnrhZv4R6vvY2I8YcrgZ6zA7k7ItPtAHcSWgaO2g/edit#slide=id.gb8cdc7f5e8_0_483";
                // Handle Lab1 button click
                break;
            case R.id.Lab2:
                lab = "https://developer.android.com/courses/pathways/android-development-with-kotlin-2";
                slides = "https://docs.google.com/presentation/d/1Kk-pjfG8NReq6esTjwFrfAhtw6SS2TUFogkgWieYQZw/edit#slide=id.gb88056c3aa_0_416";
                // Handle Lab2 button click
                break;
            case R.id.Lab3:
                lab = "https://developer.android.com/courses/pathways/android-development-with-kotlin-3";
                slides = "https://docs.google.com/presentation/d/1FSZwOeSwL-XNkMXnKDy-YPMEpCPKyb29RlpekSzzJDY/edit#slide=id.gb9961b3fa0_0_433";
                // Handle Lab3 button click
                break;
            case R.id.Lab4:
                lab = "https://developer.android.com/courses/pathways/android-development-with-kotlin-4";
                slides = "https://docs.google.com/presentation/d/1wu1c9Q_3mcPS1IjazDkci5-8nBJumCfWWY15B9EUjA0/edit#slide=id.gb87ea636ca_0_541";
                // Handle Lab4 button click
                break;
            case R.id.Lab5:
                lab = "https://developer.android.com/courses/pathways/android-development-with-kotlin-5";
                slides = "https://docs.google.com/presentation/d/13pmWTJiISYksgdK0iB4VPEBLUuciupvlD0Cn0Sy-1WI/edit#slide=id.gb87eded92d_0_482";
                // Handle Lab5 button click
                break;
            case R.id.Lab6:
                lab = "https://developer.android.com/courses/pathways/android-development-with-kotlin-6";
                slides = "https://docs.google.com/presentation/d/1QWLSLfkodgmd3nns8RRNXBCRL45p_0_249lSXiLE2rU/edit#slide=id.gb8b9b28be0_0_397";
                // Handle Lab6 button click
                break;
            case R.id.Lab7:
                lab = "https://developer.android.com/courses/pathways/android-development-with-kotlin-7";
                slides = "https://docs.google.com/presentation/d/1n3OCwb7kRx-y7Q_wYGLtRsDynyDf8e8xOM6_qBn-yY4/edit#slide=id.gb8d2a86dda_0_448";
                // Handle Lab7 button click
                break;
            case R.id.Lab8:
                lab = "https://developer.android.com/courses/pathways/android-development-with-kotlin-8";
                slides = "https://docs.google.com/presentation/d/10Qpt3z3-DASD-9AmADRBD_7AElM_5cLH4yf2HKgl4YY/edit#slide=id.gb8b649eef8_0_323";
                // Handle Lab8 button click
                break;
            case R.id.Lab9:
                lab = "https://developer.android.com/courses/pathways/android-development-with-kotlin-9";
                slides = "https://docs.google.com/presentation/d/1COEiWNknSmiI5RUgxumLrgscl9d-yvKoj6tjNF9jw5A/edit#slide=id.g796a0b0491_0_404";
                // Handle Lab9 button click
                break;
            case R.id.Lab10:
                lab = "https://developer.android.com/courses/pathways/android-development-with-kotlin-10";
                slides = "https://docs.google.com/presentation/d/1dMK7nkyNhbYDm3dxkwimerww4qWg4UuUT8s8c0GoSL8/edit#slide=id.gafc54c9b39_0_438";
                // Handle Lab10 button click
                break;
            case R.id.Lab11:
                lab = "https://developer.android.com/courses/pathways/android-development-with-kotlin-11";
                slides = "https://docs.google.com/presentation/d/1osOpeT2U4JnJpSP4YUk7SJ6qAsqxm4FIRw0q6CEvLRo/edit#slide=id.gb8d17af4dc_0_269";
                // Handle Lab11 button click
                break;
            case R.id.Lab12:
                lab = "https://developer.android.com/courses/pathways/android-development-with-kotlin-12";
                slides = "https://docs.google.com/presentation/d/1G_qhNKVzrfuc4y69XUkWpAPB7uDUE1tNtvimKTpGJKM/edit#slide=id.gb4409bc5e2_0_370";
                // Handle Lab12 button click
                break;
            case R.id.Lab13:
                lab = "https://developer.android.com/courses/pathways/android-development-with-kotlin-13";
                slides = "https://docs.google.com/presentation/d/1ANAfjVvrd8u58QY8_dCmyIc8NUC8AuktfThKMt0R3AI/edit#slide=id.gb9def153d9_0_464";
                // Handle Lab13 button click
                break;
            default:
                break;
        }
        Intent i = new Intent(modules.this,LabSyl.class);
        i.putExtra("lab",lab);
        i.putExtra("slides",slides);
        i.putExtra("labName",buttonName);
        startActivity(i);
    }


}