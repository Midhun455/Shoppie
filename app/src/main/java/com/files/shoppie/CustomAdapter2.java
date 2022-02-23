package com.files.shoppie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter2 extends RecyclerView.Adapter<CustomAdapter2.MyViewHolder> {
    Context context;
    List<Offerzone> offerzoneList;

    public CustomAdapter2(Context context, List<Offerzone> offerzoneList) {
        this.context = context;
        this.offerzoneList = offerzoneList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.offer, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imgView.setBackgroundResource(offerzoneList.get(position).getImag());
    }

    @Override
    public int getItemCount() {
        return offerzoneList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgView = itemView.findViewById(R.id.imageScroll);
        }
    }
}
