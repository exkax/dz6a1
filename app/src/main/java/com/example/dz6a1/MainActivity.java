package com.example.dz6a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment1, new FirstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment2, new SecondFragment()).commit();

    }

}