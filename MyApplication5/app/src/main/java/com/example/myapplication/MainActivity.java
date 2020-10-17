package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextView text_F, text_C;
    Button btn_clear, btn_c, btn_f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tham chieu id
        text_C = findViewById(R.id.text_C);
        text_F = findViewById(R.id.text_F);
        btn_c = findViewById(R.id.btn_c);
        btn_f = findViewById(R.id.btn_f);
        btn_clear = findViewById(R.id.btn_clear);
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DecimalFormat dcf = new DecimalFormat( "#00");
                String doF = text_F.getText().toString();
                int F = Integer.parseInt(doF);
                text_C.setText(dcf.format((F-32)/1.8)+"");
            }
        });

        btn_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DecimalFormat dcf = new DecimalFormat( "#00");
                String doC = text_C.getText().toString();
                int C = Integer.parseInt(doC);
                text_F.setText(dcf.format(C*1.8+32)+"");

            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_C.setText("");
                text_F.setText("");
            }
        });

    }
}