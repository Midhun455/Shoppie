package com.files.shoppie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter3 extends RecyclerView.Adapter<CustomAdapter3.MyViewHolder> {
    Context context;
    List<Items> itemsList;

    public CustomAdapter3(Context context, List<Items> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pdt_list, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setBackgroundResource(itemsList.get(position).getImage());
        holder.textName.setText(itemsList.get(position).getName());
        holder.textPrice.setText(itemsList.get(position).getPrice());
        holder.textCount.setText(itemsList.get(position).getCount());
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textName, textPrice, textCount;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgItem);
            textName = itemView.findViewById(R.id.itemName);
            textPrice = itemView.findViewById(R.id.itemPrice);
            textCount = itemView.findViewById(R.id.itemCount);

        }
    }
}
