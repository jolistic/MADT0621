package com.example.madt0621;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMainLabel);
    }

    public void onBtnChangeClick(View view) {
        this.tvMain.setText("We did something! Yay!");
    }

    public void onBtnChangeColor(View view) { this.tvMain.setTextColor(Color.RED);
    }
}