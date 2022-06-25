package com.example.cetakfoto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvKatalogFoto;
    private KatalogFotoListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KatalogFotoHelper.init();

        rvKatalogFoto = findViewById(R.id.rv_katalog);
        adapter = new KatalogFotoListAdapter(this);

        rvKatalogFoto.setAdapter(adapter);
        rvKatalogFoto.setLayoutManager(new LinearLayoutManager( this));


    }
}