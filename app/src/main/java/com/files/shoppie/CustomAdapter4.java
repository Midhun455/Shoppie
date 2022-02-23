package com.files.shoppie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter4 extends RecyclerView.Adapter<CustomAdapter4.MyViewHolder> {
    Context context;
    List<Pricedetails> pricedetails;

    public CustomAdapter4(Context context, List<Pricedetails> pricedetails) {
        this.context = context;
        this.pricedetails = pricedetails;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.buy_options, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.rbtn.setText(pricedetails.get(position).getRate());
        holder.offer.setText(pricedetails.get(position).getOffer());
        holder.quantity.setText(pricedetails.get(position).getKg());
        holder.price.setText(pricedetails.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return pricedetails.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView offer, quantity, price;
        RadioButton rbtn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            offer = itemView.findViewById(R.id.txtOff);
            quantity = itemView.findViewById(R.id.txtWeight);
            price = itemView.findViewById(R.id.txtPrice);
            rbtn = itemView.findViewById(R.id.radio1);

        }
    }
}
