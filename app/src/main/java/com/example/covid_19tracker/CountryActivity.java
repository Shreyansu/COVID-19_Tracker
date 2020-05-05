package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.LinearSystem;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import com.leo.simplearcloader.SimpleArcLoader;

public class CountryActivity extends AppCompatActivity {
    EditText Search;
    ListView listView;
    SimpleArcLoader loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        Search = findViewById(R.id.search);
        listView = findViewById(R.id.listView);
        loader  = findViewById(R.id.loader);
    }
}
