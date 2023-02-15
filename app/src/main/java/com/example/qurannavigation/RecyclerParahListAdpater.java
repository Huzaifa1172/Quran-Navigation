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

public class RecyclerParahListAdpater extends RecyclerView.Adapter<RecyclerParahListAdpater.ViewHolder> {

    Context context;
    ArrayList<Integer> parahslist;
    RecyclerParahListAdpater(Context context,ArrayList<Integer> parahsList)
    {
        this.context=context;
        this.parahslist=parahsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.parah_card,parent,false);
        ViewHolder view=new ViewHolder(v);
        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.data=parahslist.get(position);
        if(position%2!=0)
            holder.parah_text.setBackgroundColor(Color.argb(100,0,3,76));
        holder.parah_text.setText("Para No: " + holder.data.toString());
        holder.parah_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),DisplayParahActivity.class);
                intent.putExtra("parah_no", holder.data);
                view.getContext().startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return parahslist.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView parah_text;
        Integer data;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parah_text=itemView.findViewById(R.id.parah_text);
        }
    }
}
