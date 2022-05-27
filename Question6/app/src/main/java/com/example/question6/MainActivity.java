package com.example.question6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_Username, et_Passwd;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Username = findViewById(R.id.et_Username);
        et_Passwd = findViewById(R.id.et_Passwd);
        submitBtn = findViewById(R.id.sumbitBtn);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = et_Username.getText().toString().trim();
                String passwd = et_Passwd.getText().toString().trim();

                Intent intent = new Intent(MainActivity.this,resultActivity.class);
                intent.putExtra("Key",user);
                intent.putExtra("value",passwd);
                startActivity(intent);

            }
        });
    }
}