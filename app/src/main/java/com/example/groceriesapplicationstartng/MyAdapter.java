package com.example.groceriesapplicationstartng;

import android.content.ContentValues;
import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    String dataPrice[];
    String dataName[];
    int image[];
    Context ctx;

    public MyAdapter(Context ct, String s1[], String s2[], int i1[]){
        dataPrice = s1;
        dataName = s2;
        image = i1;
        ctx = ct;

    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.my_row, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.tName.setText(dataName[position]);
        holder.tPrice.setText(dataPrice[position]);
        holder.img.setImageResource(image[position]);

    }

    @Override
    public int getItemCount() {
        return dataName.length;
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView tPrice;
        TextView tName;
        ImageView img;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            tName = (TextView)itemView.findViewById(R.id.price);
            tPrice = (TextView)itemView.findViewById(R.id.name);
            img = (ImageView)itemView.findViewById(R.id.recycler_image);
        }
    }
}
