package com.example.mvvm_dev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;

import com.example.mvvm_dev.databinding.ActivityDetailsBinding;
import com.google.gson.annotations.Until;

public class Details_Activity extends AppCompatActivity {
ActivityDetailsBinding binding;
Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_details);
        context = this;
    }
}