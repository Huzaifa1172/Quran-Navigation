package com.example.qurannavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class parahslist extends AppCompatActivity {

    ArrayList<Integer>parahNamaList=new ArrayList<>();

    RecyclerView recyclerView;
    RecyclerParahListAdpater parahsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parahslist);
        fillArray();

        recyclerView=findViewById(R.id.Parah_recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        parahsAdapter=new RecyclerParahListAdpater(this,parahNamaList);
        recyclerView.setAdapter(parahsAdapter);

    }
    void fillArray()
    {
        for(int i=1;i<=30;i++)
        parahNamaList.add(i);
    }
}