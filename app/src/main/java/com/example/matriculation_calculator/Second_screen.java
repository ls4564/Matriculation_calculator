package com.example.matriculation_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Second_screen extends AppCompatActivity {
    EditText eD_1_2_pg2,eD_1_3_pg2,eD_2_2_pg2,eD_2_3_pg2,eD_3_1_pg2,eD_3_2_pg2,eD_3_3_pg2,eD_4_1_pg2,eD_4_2_pg2,eD_4_3_pg2,eD_5_1_pg2,eD_5_2_pg2,eD_5_3_pg2;
    Button btn_op1,btn_op2,btn_op3,btn_for_pg2_to_pg3;
    int btnClick = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        eD_1_2_pg2 = findViewById(R.id.eD_1_2_pg2);
        eD_1_3_pg2 = findViewById(R.id.eD_1_3_pg2);
        eD_2_2_pg2 = findViewById(R.id.eD_2_2_pg2);
        eD_2_3_pg2 = findViewById(R.id.eD_2_3_pg2);
        eD_3_1_pg2 = findViewById(R.id.eD_3_1_pg2);
        eD_3_2_pg2 = findViewById(R.id.eD_3_2_pg2);
        eD_3_3_pg2 = findViewById(R.id.eD_3_3_pg2);
        eD_4_1_pg2 = findViewById(R.id.eD_4_1_pg2);
        eD_4_2_pg2 = findViewById(R.id.eD_4_2_pg2);
        eD_4_3_pg2 = findViewById(R.id.eD_4_3_pg2);
        eD_5_1_pg2 = findViewById(R.id.eD_5_1_pg2);
        eD_5_2_pg2 = findViewById(R.id.eD_5_2_pg2);
        eD_5_3_pg2 = findViewById(R.id.eD_5_3_pg2);

        btn_op1 = findViewById(R.id.btn_op1);
        btn_op2 = findViewById(R.id.btn_op2);
        btn_op3 = findViewById(R.id.btn_op3);
        btn_for_pg2_to_pg3 = findViewById(R.id.btn_for_pg2_to_pg3);


        Intent gi = getIntent();
        double sum = gi.getDoubleExtra("sum",-1);
        String user_name = gi.getStringExtra("user_name");
    }

    public void first_op(View view) {
        eD_3_1_pg2.setVisibility(View.VISIBLE);
        eD_3_2_pg2.setVisibility(View.VISIBLE);
        eD_3_3_pg2.setVisibility(View.VISIBLE);
        eD_4_1_pg2.setVisibility(View.INVISIBLE);
        eD_4_2_pg2.setVisibility(View.INVISIBLE);
        eD_4_3_pg2.setVisibility(View.INVISIBLE);
        eD_5_1_pg2.setVisibility(View.INVISIBLE);
        eD_5_2_pg2.setVisibility(View.INVISIBLE);
        eD_5_3_pg2.setVisibility(View.INVISIBLE);
        btn_op2.setVisibility(View.INVISIBLE);
        btn_op3.setVisibility(View.INVISIBLE);
        btnClick = 1;
        btn_for_pg2_to_pg3.setVisibility(View.VISIBLE);
    }

    public void second_op(View view) {
        eD_3_1_pg2.setVisibility(View.INVISIBLE);
        eD_3_2_pg2.setVisibility(View.INVISIBLE);
        eD_3_3_pg2.setVisibility(View.INVISIBLE);
        eD_4_1_pg2.setVisibility(View.VISIBLE);
        eD_4_2_pg2.setVisibility(View.VISIBLE);
        eD_4_3_pg2.setVisibility(View.VISIBLE);
        eD_5_1_pg2.setVisibility(View.INVISIBLE);
        eD_5_2_pg2.setVisibility(View.INVISIBLE);
        eD_5_3_pg2.setVisibility(View.INVISIBLE);
        btn_op1.setVisibility(View.INVISIBLE);
        btn_op3.setVisibility(View.INVISIBLE);
        btnClick = 2;
        btn_for_pg2_to_pg3.setVisibility(View.VISIBLE);
    }

    public void third_op(View view) {
        eD_3_1_pg2.setVisibility(View.INVISIBLE);
        eD_3_2_pg2.setVisibility(View.INVISIBLE);
        eD_3_3_pg2.setVisibility(View.INVISIBLE);
        eD_4_1_pg2.setVisibility(View.INVISIBLE);
        eD_4_2_pg2.setVisibility(View.INVISIBLE);
        eD_4_3_pg2.setVisibility(View.INVISIBLE);
        eD_5_1_pg2.setVisibility(View.VISIBLE);
        eD_5_2_pg2.setVisibility(View.VISIBLE);
        eD_5_3_pg2.setVisibility(View.VISIBLE);
        btn_op1.setVisibility(View.INVISIBLE);
        btn_op2.setVisibility(View.INVISIBLE);
        btnClick = 3;
        btn_for_pg2_to_pg3.setVisibility(View.VISIBLE);
    }

    public void go_back_1(View view) {
        finish();
    }

    public void Next_page_3(View view) {
        String str_1_2 = eD_1_2_pg2.getText().toString();
        String str_1_3 = eD_1_3_pg2.getText().toString();
        if(!str_1_2.isEmpty() && !str_1_3.isEmpty())
        {

        }
        else
        {
            Toast.makeText(this, "The input is illegal!", Toast.LENGTH_SHORT).show();

        }
    }

    public boolean check_units_legal(int num)
    {
        if(num >= 3)
        {
            if(num <= 5)
            {
                return true;
            }
        }
        return false;
    }
}