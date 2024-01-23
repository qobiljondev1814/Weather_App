package com.example.myapplication.Activits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.Adapter.FutureAdapter;
import com.example.myapplication.Domains.FutureDomain;
import com.example.myapplication.R;

import java.util.ArrayList;

public class FutureActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterTomorow;
    public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future);

        initRecyclerView();
        setVarible();
    }

    private void setVarible() {
        ConstraintLayout backBtn=findViewById(R.id.backBtn);
//        backBtn.setOnClickListener(v -> startActivity(new Intent(FutureActivity.this,MainActivity.class)));
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initRecyclerView() {
        ArrayList<FutureDomain> items = new ArrayList<>();

        items.add(new FutureDomain("Sat", "storm", "strom", 25, 10));
        items.add(new FutureDomain("Sun", "cloudy", "cloudy", 24, 16));
        items.add(new FutureDomain("Mon", "windy", "windy", 29, 15));
        items.add(new FutureDomain("Tue", "cloudy_sunny", "Cloud_Sunny", 22, 13));
        items.add(new FutureDomain("Wen", "sunny", "sunny", 28, 11));
        items.add(new FutureDomain("Thu", "rainy", "Rainy", 23, 12));

        recyclerView = findViewById(R.id.view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapterTomorow = new FutureAdapter(items);
        recyclerView.setAdapter(adapterTomorow);
    }
}