package com.example.debilproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Inthing telescope = new Inthing();

    private TextView month;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        month = findViewById(R.id.month);
        int allMonth = telescope.CalculationOfMonth(14000, 1000,
                2500, 0.05F);
        month.setText("Вот зв столько та накопишь на эту штуковину: " + allMonth);

    }


}