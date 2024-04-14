package com.example.matriculation_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Second_screen extends AppCompatActivity {
    EditText eD_1_1,eD_1_2,eD_1_3,eD_2_1,eD_2_2,eD_2_3,eD_3_1,eD_3_2,eD_3_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        eD_1_1 = findViewById(R.id.eD_1_1);
        eD_1_2 = findViewById(R.id.eD_1_2);
        eD_1_3 = findViewById(R.id.eD_1_3);
        eD_2_1 = findViewById(R.id.eD_2_1);
        eD_2_2 = findViewById(R.id.eD_2_2);
        eD_2_3 = findViewById(R.id.eD_2_3);
        eD_3_1 = findViewById(R.id.eD_3_1);
        eD_3_2 = findViewById(R.id.eD_3_2);
        eD_3_3 = findViewById(R.id.eD_3_3);

        Intent gi = getIntent();
        double sum = gi.getDoubleExtra("sum",-1);
    }

    public void first_op(View view) {
        eD_1_1.setVisibility(View.VISIBLE);
        eD_1_2.setVisibility(View.VISIBLE);
        eD_1_3.setVisibility(View.VISIBLE);
        eD_2_1.setVisibility(View.INVISIBLE);
        eD_2_2.setVisibility(View.INVISIBLE);
        eD_2_3.setVisibility(View.INVISIBLE);
        eD_3_1.setVisibility(View.INVISIBLE);
        eD_3_2.setVisibility(View.INVISIBLE);
        eD_3_3.setVisibility(View.INVISIBLE);
    }

    public void second_op(View view) {
        eD_1_1.setVisibility(View.VISIBLE);
        eD_1_2.setVisibility(View.VISIBLE);
        eD_1_3.setVisibility(View.VISIBLE);
        eD_2_1.setVisibility(View.VISIBLE);
        eD_2_2.setVisibility(View.VISIBLE);
        eD_2_3.setVisibility(View.VISIBLE);
        eD_3_1.setVisibility(View.INVISIBLE);
        eD_3_2.setVisibility(View.INVISIBLE);
        eD_3_3.setVisibility(View.INVISIBLE);
    }

    public void third_op(View view) {
        eD_1_1.setVisibility(View.VISIBLE);
        eD_1_2.setVisibility(View.VISIBLE);
        eD_1_3.setVisibility(View.VISIBLE);
        eD_2_1.setVisibility(View.VISIBLE);
        eD_2_2.setVisibility(View.VISIBLE);
        eD_2_3.setVisibility(View.VISIBLE);
        eD_3_1.setVisibility(View.VISIBLE);
        eD_3_2.setVisibility(View.VISIBLE);
        eD_3_3.setVisibility(View.VISIBLE);
    }

    public void go_back(View view) {
        finish();
    }
}