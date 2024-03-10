package com.example.aplikasiskincare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgsunscreen = findViewById(R.id.imgsunscreen);
        ImageView imgmoisturizer = findViewById(R.id.imgmoisturizer);
        ImageView imgtoner = findViewById(R.id.imgtoner);

        Button btnsunscreen = findViewById(R.id.btnsunscreen);
        Button btnmoisturizer = findViewById(R.id.btnmoisturizer);
        Button btntoner = findViewById(R.id.btntoner);

        imgsunscreen.setOnClickListener(this);
        imgmoisturizer.setOnClickListener(this);
        imgtoner.setOnClickListener(this);
        btnsunscreen.setOnClickListener(this);
        btnmoisturizer.setOnClickListener(this);
        btntoner.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnsunscreen || v.getId() == R.id.imgsunscreen){
            Intent intent = new Intent(this, sunscreenactivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btnmoisturizer || v.getId() == R.id.imgmoisturizer) {
            Intent intent = new Intent(this, moisturizeractivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btntoner || v.getId() == R.id.imgtoner) {
            Intent intent = new Intent(this, toneractivity.class);
            startActivity(intent);
        }
    }
}