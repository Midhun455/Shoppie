package com.files.shoppie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class FruitsListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Items> itemsList = new ArrayList<>();
    FloatingActionButton floatButton;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits_list);
        recyclerView = findViewById(R.id.pdtRecycle);
        floatButton = findViewById(R.id.btnFloat);
        toolbar = findViewById(R.id.toolBar);
        floatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                intent.putExtra("from", "flo");
                startActivity(intent);

//                getSupportFragmentManager().beginTransaction().replace(R.id.FrameL, new CartFragment()).commit();
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        itemsList.add(new Items(R.drawable.beans, "Payar", "Rs. 30 / Kg", "18-20 Nos in 1 kg"));
        itemsList.add(new Items(R.drawable.ladies_finger, "Vendakka", "Rs. 30 / Kg", "12-15 Nos in 1 kg"));
        itemsList.add(new Items(R.drawable.spinach, "Pacha Cheera", "Rs. 30 / Bunch", "500 gm a bunch"));
        itemsList.add(new Items(R.drawable.chilly, "Green Chillies", "Rs. 25 / Kg", "20-30 Nos in 1 kg"));
        itemsList.add(new Items(R.drawable.brinjal, "Brinjal", "Rs. 30 / Kg", "4-5 Nos in 1 kg"));
        CustomAdapter3 customAdapter3 = new CustomAdapter3(getApplicationContext(), itemsList);
        recyclerView.setAdapter(customAdapter3);
    }
}
