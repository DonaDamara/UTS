package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1,number2;
    Button btntambah,btnkurang,btnkali,btnbagi;
    TextView tvhasil;
    String num1,num2;
    Integer Total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btntambah= findViewById(R.id.btn_tambah);
        btnkurang = findViewById(R.id.btn_kurang);
        btnkali = findViewById(R.id.btn_kali);
        btnbagi = findViewById(R.id.btn_bagi);
        tvhasil = findViewById(R.id.tv_hasil);
        number1 = findViewById(R.id.num_1);
        number2 = findViewById(R.id.num_2);

        btntambah.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();
                Total = Integer.parseInt(num1)+Integer.parseInt(num2);
                tvhasil.setText(String.valueOf(Total));
            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();
                Total = Integer.parseInt(num1)-Integer.parseInt(num2);
                tvhasil.setText(String.valueOf(Total));

            }
        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();
                Total = Integer.parseInt(num1)*Integer.parseInt(num2);
                tvhasil.setText(String.valueOf(Total));

            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();
                Total = Integer.parseInt(num1)/Integer.parseInt(num2);
                tvhasil.setText(String.valueOf(Total));

            }
        });


    }
}