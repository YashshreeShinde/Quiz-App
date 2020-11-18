package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Teacher_signup extends AppCompatActivity {
private Button teacher_log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_signup);
        teacher_log=(Button)findViewById(R.id.teacher_sign);
        teacher_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teacher_log_activity();
            }
        });


    }

    public void teacher_log_activity()
    {
        Intent studentlog_intent=new Intent(Teacher_signup.this,MainActivity.class);

        startActivity(studentlog_intent);
    }
    }
