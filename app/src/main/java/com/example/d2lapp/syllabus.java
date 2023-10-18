package com.example.d2lapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllabus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        PDFView pdf = findViewById(R.id.pdfView);
        pdf.fromAsset("Syllabus.pdf").load();
    }
}