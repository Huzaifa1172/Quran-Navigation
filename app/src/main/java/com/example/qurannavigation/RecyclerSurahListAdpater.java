package com.example.qurannavigation;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerSurahListAdpater extends RecyclerView.Adapter<RecyclerSurahListAdpater.ViewHolder> {


    Context context;
    ArrayList<String> surahslist;
    RecyclerSurahListAdpater(Context context,ArrayList<String> parahsList)
    {
        this.context=context;
        this.surahslist=parahsList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(context).inflate(R.layout.surah_card,parent,false);
        ViewHolder view=new ViewHolder(v);
        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.data=surahslist.get(position);
        if(position%2!=0)
        {
           holder.surah_text.setBackgroundColor(Color.argb(100,0,3,76));
        }
        holder.surah_text.setText(holder.data.toString());
        holder.surah_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),DisplaySurahActivity.class);
                intent.putExtra("surah_name", holder.data);
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return surahslist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView surah_text;
        String data;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            surah_text=itemView.findViewById(R.id.surah_text);
        }

    }
}
