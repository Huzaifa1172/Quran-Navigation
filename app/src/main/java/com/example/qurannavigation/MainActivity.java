package com.example.qurannavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    Button btn_surah,btn_parah,btn_github;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //btn_github=findViewById(R.id.btn_github);
        //btn_parah=findViewById(R.id.btn_parah);
        //btn_surah=findViewById(R.id.btn_surah);
    }
    public void surah(View v)
    {
        Intent intent =new Intent(MainActivity.this,surahslist.class);
        startActivity(intent);
    }
    public void parah(View v)
    {
        Intent intent =new Intent(MainActivity.this,parahslist.class);
        startActivity(intent);
    }
    public void github(View v)
    {
        Uri url = Uri.parse("https://github.com/Huzaifa1172/Quran-Navigation");
        Intent intent=new Intent(Intent.ACTION_VIEW,url);
        startActivity(intent);
    }
}