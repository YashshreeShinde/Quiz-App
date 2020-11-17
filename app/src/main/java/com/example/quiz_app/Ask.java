package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ask extends AppCompatActivity {
private Button teacher_signup,student_signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask);
        teacher_signup=(Button)findViewById(R.id.teacher);
        student_signup=(Button)findViewById(R.id.student);
        teacher_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teachersign_activity();
            }
        });
        student_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentsign_activity();
            }
        });
    }

    public void teachersign_activity()
    {
        Intent teacher_intent=new Intent(Ask.this,Teacher_signup.class);

        startActivity(teacher_intent);
    }

    public void studentsign_activity()
    {
        Intent student_intent=new Intent(Ask.this,student_signup.class);
        startActivity(student_intent);
    }
    }
