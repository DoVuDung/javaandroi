package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textDL, textAL;
    Button btnchuyen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textAL = findViewById(R.id.);
        textDL = findViewById(R.id.textDL);
        btnchuyen = findViewById(R.id.chuyendoi);
        btnchuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int namduong = Integer.parseInt(editTextTextPersonName.getText().toString());
                String can = "";
                String chi = "";
                switch (namduong % 10){
                    case 0:
                        can = "Canh";
                        break;
                    case 1:
                        can = "Tân";
                        break;
                    case 2:
                        can = "Nhâm";
                        break;
                    case 3:
                        can = "Quý";
                        break;
                    case 4 :
                        can = "Giáp";
                        break;
                    case 5 :
                        can = "At";
                        break;
                    case 6:
                        can = "Binh";
                        break;
                    case 7:
                        can = "Dinh";
                        break;
                    case 8:
                        can = "Mau";
                        break;
                    case 9:
                        can = "Ky";
                        break;

                }

                switch (namduong % 12){
                    case 0:
                        chi = "Than";
                        break;
                    case 1:
                        chi = "Dau";
                        break;
                    case 2:
                        chi = "Tuat";
                        break;
                    case 3:
                        chi = "Hoi";
                        break;
                    case 4 :
                        chi = "Ty";
                        break;
                    case 5 :
                        chi = "Suu";
                        break;
                    case 6:
                        chi = "Dan";
                        break;
                    case 7:
                        chi = "Meo";
                        break;
                    case 8:
                        chi = "Thin";
                        break;
                    case 9:
                        chi = "Ty";
                        break;
                    case 10:
                        chi = "Ngo";
                        break;
                    case 11:
                        chi = "Mui";
                        break;

                }
                editTextTextPersonName2.setText(can +" "+ chi);

            }
        });





    }
}