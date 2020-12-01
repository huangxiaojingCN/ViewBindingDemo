package com.honey.viewbindingsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;

import com.honey.viewbindingsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        ConstraintLayout root = mainBinding.getRoot();
        setContentView(root);
    }
}