package com.example.pleerandroid1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.pleerandroid1.databinding.ActivityDataAcktivityBinding;

public class DataAcktivity extends AppCompatActivity {
    private ActivityDataAcktivityBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityDataAcktivityBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        binding.nameSongs.setText(getIntent().getStringExtra("text"));

    }
}