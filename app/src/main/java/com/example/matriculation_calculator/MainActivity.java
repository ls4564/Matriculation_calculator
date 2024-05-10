package com.example.matriculation_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 69;
    EditText user_eD,eD1,eD2,eD3,eD4,eD5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weddings();
    }



    public void Next_page_2(View view) {
        String st1 = eD1.getText().toString();
        String st2 = eD2.getText().toString();
        String st3 = eD3.getText().toString();
        String st4 = eD4.getText().toString();
        String st5 = eD5.getText().toString();
        String user_name = user_eD.getText().toString();
        if(!user_name.isEmpty())
        {
            if (!st1.isEmpty() && !st2.isEmpty() && !st3.isEmpty() && !st4.isEmpty() && !st5.isEmpty()) {
                int num1 = Integer.parseInt(st1);
                int num2 = Integer.parseInt(st2);
                int num3 = Integer.parseInt(st3);
                int num4 = Integer.parseInt(st4);
                int num5 = Integer.parseInt(st5);
                if (check_legal(num1) && check_legal(num2) && check_legal(num3) && check_legal(num4) && check_legal(num5)) {
                    Intent si = new Intent(this, Second_screen.class);
                    double sum_grade = ((num1 + num2 + num3 + num4 + num5)*2) ;
                    int units = 10;

                    si.putExtra("Hebrew",st1);
                    si.putExtra("Digits",st2);
                    si.putExtra("History",st3);
                    si.putExtra("Citizenship",st4);
                    si.putExtra("Bible",st5);

                    si.putExtra("sum_grade",sum_grade);
                    si.putExtra("units",units);
                    startActivity(si);
                }
                else
                {
                    Toast.makeText(this, "The input is illegal!", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "One of the inputs is Empty", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(this, "User Name is Empty!", Toast.LENGTH_SHORT).show();
        }
    }


    public void weddings()
    {
        user_eD = findViewById(R.id.user_eD);
        eD1 = findViewById(R.id.eD1);
        eD2 = findViewById(R.id.eD2);
        eD3 = findViewById(R.id.eD3);
        eD4 = findViewById(R.id.eD4);
        eD5 = findViewById(R.id.eD5);
    }



    public boolean check_legal(int num)
    {

        if(num <= 100)
        {
            return true;
        }
        return false;
    }

}
