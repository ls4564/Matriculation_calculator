package com.example.matriculation_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText user_eD,eD1,eD2,eD3,eD4,eD5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user_eD = findViewById(R.id.user_eD);
        eD1 = findViewById(R.id.eD1);
        eD2 = findViewById(R.id.eD2);
        eD3 = findViewById(R.id.eD3);
        eD4 = findViewById(R.id.eD4);
        eD5 = findViewById(R.id.eD5);

    }

    public void Next_page(View view) {

    }
}