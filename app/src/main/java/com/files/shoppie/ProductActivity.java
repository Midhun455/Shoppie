package com.files.shoppie;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RatingBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity {

    Toolbar toolbar;
    RatingBar ratingBar;
    RadioButton rBtn;
    Button button1, button2;
    RecyclerView recyclerView;
    List<Pricedetails> pricedetails = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        toolbar = findViewById(R.id.toolBarPdt);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        rBtn = findViewById(R.id.radio1);
        ratingBar = findViewById(R.id.rBar);
        button1 = findViewById(R.id.btnAddCart);
        button2 = findViewById(R.id.btnBuyNow);
        recyclerView = findViewById(R.id.pdtRecycle);
        LinearLayoutManager lm = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(lm);
        pricedetails.add(new Pricedetails("₹15", "", "500 gm", "@Rs.30/kg"));
        pricedetails.add(new Pricedetails("₹25", "Rs.5 off", "1 Kg", "@Rs.30/kg"));
        pricedetails.add(new Pricedetails("₹50", "Rs.10 off", "2 Kg", "@Rs.30/kg"));
        CustomAdapter4 customAdapter4 = new CustomAdapter4(getApplicationContext(), pricedetails);
        recyclerView.setAdapter(customAdapter4);
    }
}