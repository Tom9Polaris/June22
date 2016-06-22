package com.example.administrator.myapplication001;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    android.support.v7.app.ActionBar actionBar;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionBar = getSupportActionBar();
        button1 = (Button)findViewById(R.id.Button1);
        button2 = (Button)findViewById(R.id.Button2);
        button3 = (Button)findViewById(R.id.Button3);
        button4 = (Button)findViewById(R.id.Button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //actionBar.show();
                showActionBar(view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //actionBar.hide();
                hideActionBar(view);
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
            }
        });
    }
    public void showActionBar(View source){
        actionBar.show();
    }
    public void hideActionBar(View source){
        actionBar.hide();
    }
}
