package com.example.qurannavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayParahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_parah);
        Intent intent=getIntent();
        TextView textView=findViewById(R.id.displayparah);
        textView.setText(String.valueOf(intent.getIntExtra("parah_no",0)));
    }
}