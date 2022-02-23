package com.files.shoppie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class SplashActivity1 extends AppCompatActivity {
    AppCompatButton buttonSplash1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash1);
        buttonSplash1 = findViewById(R.id.btnNext1);
        buttonSplash1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SplashActivity2.class);
                startActivity(intent);
            }
        });
    }
}