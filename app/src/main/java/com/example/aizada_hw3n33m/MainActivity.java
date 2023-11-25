package com.example.aizada_hw3n33m;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvSeries;
    private ArrayList<String> seriesList = new ArrayList<>();
    private SeriesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
        initAdapter();
    }

    private void initAdapter() {
        adapter = new SeriesAdapter(seriesList);
        rvSeries.setAdapter(adapter);
    }

    private void loadData() {
        seriesList.add("Уэнздей ");
        seriesList.add("очень странный дела");
        seriesList.add("Черный двор ");
        seriesList.add("Слабый герой");
        seriesList.add("Майская юность  ");
        seriesList.add("Потомки солнце");
        seriesList.add("Игра в кальмар");
        seriesList.add("Король земли");


    }

    private void initView() {
        rvSeries = findViewById(R.id.rv_series);
    }

}