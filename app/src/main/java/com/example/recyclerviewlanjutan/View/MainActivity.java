package com.example.recyclerviewlanjutan.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerviewlanjutan.Adapter.MarvelAdapter;
import com.example.recyclerviewlanjutan.Model.MarvelModel;
import com.example.recyclerviewlanjutan.Presenter.MarvelPresenter;
import com.example.recyclerviewlanjutan.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView{
    RecyclerView recyclerView,recyclerView1,recyclerView2;
    MarvelAdapter adapter;
    MarvelPresenter presenter;
    List<MarvelModel> marvelModels = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rcv);
        recyclerView1 = findViewById(R.id.rcv1);
        recyclerView2 = findViewById(R.id.rcv2);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        adapter = new MarvelAdapter(this,marvelModels);
        recyclerView.setAdapter(adapter);
        presenter = new MarvelPresenter(this,this);
        presenter.setData();

        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MarvelAdapter(this,marvelModels);
        recyclerView1.setAdapter(adapter);
        presenter = new MarvelPresenter(this,this);
        presenter.setData();

        recyclerView2.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        adapter = new MarvelAdapter(this,marvelModels);
        recyclerView2.setAdapter(adapter);
        presenter = new MarvelPresenter(this,this);
        presenter.setData();
    }

    @Override
    public void onSucsess(List<MarvelModel> marvelModels) {
        this.marvelModels.clear();
        this.marvelModels.addAll(marvelModels);
        this.adapter.notifyDataSetChanged();
    }
}