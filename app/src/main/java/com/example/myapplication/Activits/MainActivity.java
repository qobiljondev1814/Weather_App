package com.example.myapplication.Activits;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Adapter.HourlyAdapters;
import com.example.myapplication.Domains.Hourly;
import com.example.myapplication.R;

import java.util.ArrayList;

public class MainActivity {
    public static class mainActivity extends AppCompatActivity {
        private RecyclerView.Adapter adapterHourly;
        private RecyclerView recyclerView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            initRecyclerview();
            setVarible();
        }

        private void setVarible() {
            TextView next7dayBtn=findViewById(R.id.nextBtn);
           next7dayBtn.setOnClickListener(v -> startActivity(new Intent(mainActivity.this,FutureActivity.class)));
        }

        @SuppressLint("WrongViewCast")
        private void initRecyclerview() {
            ArrayList<Hourly> items=new ArrayList<>();

//            items.add(new Hourly(28,"sunny",20));
//            items.add(new Hourly(28,"sunny",21));
//            items.add(new Hourly(28,"sunny",22));
            items.add(new Hourly("28","sunny",23));
            items.add(new Hourly("28","cloudy_sunny",28));
            items.add(new Hourly("28","humidity",24));
            items.add(new Hourly("28","rain",27));
            items.add(new Hourly("28","snowy",72));
            items.add(new Hourly("28","sunny",24));
//                items.add(new Hourly(28,"sunny",28));

            recyclerView=findViewById(R.id.RecyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

            adapterHourly= new HourlyAdapters(items);
            recyclerView.setAdapter(adapterHourly);
        }
    }
}
