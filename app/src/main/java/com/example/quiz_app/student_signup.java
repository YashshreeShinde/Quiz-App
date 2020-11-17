package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class student_signup extends AppCompatActivity {
private Button student_log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_signup);
        student_log=(Button)findViewById(R.id.student_sign);
        student_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                student_log_activity();
            }
        });


    }

    public void student_log_activity()
    {
        Intent studentlog_intent=new Intent(student_signup.this,MainActivity.class);

        startActivity(studentlog_intent);
    }
    }
