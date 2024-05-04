package com.example.matriculation_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Third_screen extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;
    double[] arr;
    int btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
        weddings();
        Intent gi = getIntent();
        arr = gi.getDoubleArrayExtra("arr");
        btnClick = gi.getIntExtra("option",-1);
        tv1.setText(arr[0] + "");
        tv2.setText(arr[1] + "");
        tv3.setText(arr[2] + "");
        tv4.setText(arr[3] + "");
        tv5.setText(arr[4] + "");
        tv6.setText(arr[5] + "");
        tv7.setText(arr[6] + "");


        switch (btnClick)
    {
        case 2:
            tv2.setVisibility(View.VISIBLE);
            tv3.setVisibility(View.VISIBLE);
            break;
        case 3:
            tv2.setVisibility(View.VISIBLE);
            tv3.setVisibility(View.VISIBLE);
            tv4.setVisibility(View.VISIBLE);
            tv5.setVisibility(View.VISIBLE);
            tv6.setVisibility(View.VISIBLE);
            tv7.setVisibility(View.VISIBLE);
            break;
    }
    }

    public void go_back_2(View view) {
        finish();
    }

    public void weddings()
    {
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);
    }
}