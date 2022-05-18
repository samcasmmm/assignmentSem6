package com.example.question6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {
    TextView tv_username, tv_Passwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tv_username = findViewById(R.id.tv_username1);
        tv_Passwd = findViewById(R.id.tv_Passwd1);

        String text1 = getIntent().getStringExtra("Key");
        String text2 = getIntent().getStringExtra("value");
        tv_username.setText(text1);
        tv_Passwd.setText(text2);
    }
}