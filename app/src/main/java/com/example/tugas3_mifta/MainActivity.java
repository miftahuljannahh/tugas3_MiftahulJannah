package com.example.tugas3_mifta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tugas3_mifta);
    }

    public void clickRS(View view) {
        //gambar rumah sakit di click
        Intent i = new Intent(this,RS.class);
        startActivity(i);
    }
}