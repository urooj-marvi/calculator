package com.urooj.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etFirstValue, etSecondValue ;
    TextView tvResult;
    Button Add, Sub, Mul,Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);

        tvResult= findViewById(R.id.tvResult);

        Add= findViewById(R.id.buttonAdd);
        Sub =findViewById(R.id.buttonSUB);
        Mul= findViewById(R.id.buttonMul);
        Div=findViewById(R.id.buttonDiv);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int FirstValue, SecondValue, Result;

                FirstValue= Integer.parseInt(etFirstValue.getText().toString());
                SecondValue = Integer.parseInt(etSecondValue.getText().toString());
                Result= FirstValue + SecondValue;
                tvResult.setText("Result is = "+Result);

            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int FirstValue, SecondValue, Result;

                FirstValue= Integer.parseInt(etFirstValue.getText().toString());
                SecondValue = Integer.parseInt(etSecondValue.getText().toString());
                Result= FirstValue - SecondValue;
                tvResult.setText("Result is = "+Result);

            }
        });


        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int FirstValue, SecondValue, Result;

                FirstValue= Integer.parseInt(etFirstValue.getText().toString());
                SecondValue = Integer.parseInt(etSecondValue.getText().toString());
                Result= FirstValue * SecondValue;
                tvResult.setText("Result is = "+Result);


            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int FirstValue, SecondValue, Result;

                FirstValue= Integer.parseInt(etFirstValue.getText().toString());
                SecondValue = Integer.parseInt(etSecondValue.getText().toString());
                Result= FirstValue / SecondValue;
                tvResult.setText("Result is = "+Result);

            }
        });

    }
}