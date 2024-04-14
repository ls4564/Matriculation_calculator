package com.example.matriculation_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 69;
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
        String st1 = eD1.getText().toString();
        String st2 = eD1.getText().toString();
        String st3 = eD1.getText().toString();
        String st4 = eD1.getText().toString();
        String st5 = eD1.getText().toString();
        String st6 = user_eD.getText().toString();
        if(!st6.isEmpty())
        {
            if (!st1.isEmpty() & !st2.isEmpty() & !st3.isEmpty() & !st4.isEmpty() & !st5.isEmpty()) {
                int num1 = Integer.parseInt(st1);
                int num2 = Integer.parseInt(st2);
                int num3 = Integer.parseInt(st3);
                int num4 = Integer.parseInt(st4);
                int num5 = Integer.parseInt(st5);
                if (check_legal(num1) & check_legal(num2) & check_legal(num3) & check_legal(num4) & check_legal(num5)) {
                    Intent si = new Intent(this, Second_screen.class);
                    double sum = (num1 + num2 + num3 + num4 + num5) / 5;
                    si.putExtra("sum",sum);
                    startActivity(si);
                } else {
                    Toast.makeText(this, "The input is illegal!", Toast.LENGTH_SHORT);
                }
            } else {
                Toast.makeText(this, "One of the inputs is Empty", Toast.LENGTH_SHORT);
            }
        }
        else
        {
            Toast.makeText(this, "User Name is Empty!", Toast.LENGTH_SHORT);
        }
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


/*
 @Override
    protected void onActivityResult(int source, int result, @Nullable Intent data_back){
        super.onActivityResult(source, result, data_back);
        if (source == REQUEST_CODE) {
            if (result == Activity.RESULT_OK) {
                if (data_back != null) {
                    b3 = data_back.getBooleanExtra("b1",false);
                    b4 = data_back.getBooleanExtra("b2",false);
                    tv1.setText("");
                    tv4.setText("");

                    if(b4)
                    {
                        ans2 = data_back.getDoubleExtra("X2", -1);
                        tv4.setText(String.format("X: %.1f",ans2));
                    }


                    if(b3)
                    {
                        ans1 = data_back.getDoubleExtra("X1", -1);
                        tv1.setText(String.format("X: %.1f",ans1));
                    }
                    if(b4 || b3)
                    {
                        iV.setVisibility(View.VISIBLE);
                        if(a > 0)//+a  u
                        {
                            if (check_variation(a,b,c) > 0)
                            {
                                iV.setImageResource(R.drawable.abc_a_minus_b);
                            }
                            else if (check_variation(a,b,c) == 0)
                            {
                                iV.setImageResource(R.drawable.abc_a);
                            }
                            else
                            {
                                iV.setImageResource(R.drawable.abc_nox_a);
                            }
                        }
                        else if (a < 0)//-a h
                        {
                            if (check_variation(a,b,c) > 0)
                            {
                                iV.setImageResource(R.drawable.abc_ninus_a_b);
                            }
                            else if (check_variation(a,b,c) == 0)
                            {
                                iV.setImageResource(R.drawable.abc_minus_a);
                            }
                            else
                            {
                                iV.setImageResource(R.drawable.abc_nox_minus_a);
                            }
                        }
                        else //-----
                        {
                            iV.setImageResource(R.drawable.abc);
                        }
                    }
                    else
                    {
                        iV.setVisibility(View.INVISIBLE);
                    }
                }
            }
        }
    }
 */