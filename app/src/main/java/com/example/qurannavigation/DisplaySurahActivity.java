package com.example.qurannavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplaySurahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_surah);

        Intent intent=getIntent();
        TextView textView=findViewById(R.id.textView);
        textView.setText(intent.getStringExtra("surah_name"));
    }
}