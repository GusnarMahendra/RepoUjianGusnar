package com.example.viewlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String[] daftar_nama = {"yoga", "brian", "luthfi", "suci", "gusnar"};
        ListView lvData = (ListView) findViewById(R.id.lvData);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, daftar_nama);
        lvData.setAdapter(arrayAdapter);
    }
}