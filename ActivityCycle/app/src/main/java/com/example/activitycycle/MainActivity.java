package com.example.activitycycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btcall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"hé nhô - onCreat()",Toast.LENGTH_SHORT).show();
        btcall =(Button) findViewById(R.id.btcall);
        btcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,subactivity2.class);
                startActivity(intent1);
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"tớ đây - on Destroy()",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this," lại là tớ đây - onPause", Toast.LENGTH_SHORT).show();}
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this," lại là mềnh đêy - onRestart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this," đây - onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this," ok tớ lại đây - onStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this," xì tốp đây - onStop", Toast.LENGTH_SHORT).show();
    }

    }
