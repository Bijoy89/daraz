package com.example.darazinternassignment2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity0 extends AppCompatActivity {
private static  int Splash_time_out=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.splash0);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity0.this, MainActivity2.class);
                startActivity(i);
                finish();
            }
        },Splash_time_out);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}