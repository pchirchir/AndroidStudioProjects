package com.example.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AddDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Add Data");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
