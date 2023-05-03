package com.example.viewlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inpNama = (EditText) findViewById(R.id.inpNama);
        Button btnSimpan = (Button) findViewById(R.id.btnSimpan);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inpNama.getText().toString().trim().isEmpty()) {
                    Toast.makeText("inputan masih kosong", Toast)


                }else {
                    Intent intentPindah = new Intent(MainActivity.this);
                }
                }
        });
    }
}