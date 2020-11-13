package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GridItemActivity extends AppCompatActivity {
    ImageView imageView;
    TextView name;
    Button thoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item);
        name= findViewById(R.id.name);
        imageView=findViewById(R.id.img);
        Intent intent= getIntent();
        name.setText(intent.getStringExtra("name"));
        imageView.setImageResource(intent.getIntExtra("image",0));
        thoat=findViewById(R.id.cancell);
        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}