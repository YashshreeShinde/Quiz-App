package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button asking,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asking=(Button)findViewById(R.id.ask);
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity();
            }
        });
        asking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity();
            }
        });
    }

    public void openactivity()
    {
        Intent intent=new Intent(MainActivity.this,Ask.class);

        startActivity(intent);
    }
    public void mainActivity()
    {
        Intent main_intent=new Intent(MainActivity.this,main_page.class);

        startActivity(main_intent);
    }
    }
