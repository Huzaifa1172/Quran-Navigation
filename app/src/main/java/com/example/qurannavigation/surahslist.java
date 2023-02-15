package com.example.qurannavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class surahslist extends AppCompatActivity {

    ArrayList<String> surahNameList=new ArrayList<>();
    QuranDataHelper qdh=new QuranDataHelper();

    RecyclerView recyclerView;
    RecyclerParahListAdpater parahsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surahslist);
        fillArray();

        recyclerView=findViewById(R.id.Surah_recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        parahsAdapter=new RecyclerParahListAdpater(this,surahNameList);
        recyclerView.setAdapter(parahsAdapter);



    }
    void fillArray()
    {
        for(int i=1;i<=114;i++)
        {
            surahNameList.add(Integer.toString(i) + " -- " + qdh.englishSurahNames[i-1]);
        }
    }
}