package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_Username, et_Passwd;
    Button registerBtn;
    RadioButton rb_Male, rb_Female;
    CheckBox cb_Web,cb_Android;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Username = findViewById(R.id.et_Username);
        et_Passwd = findViewById(R.id.et_Passwd);
        registerBtn = findViewById(R.id.registerBtn);
        rb_Male = findViewById(R.id.rb_Male);
        rb_Female = findViewById(R.id.rb_Female);
        cb_Web = findViewById(R.id.cb_Web);
        cb_Android = findViewById(R.id.cb_Android);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = et_Username.getText().toString().trim();
                String passwd = et_Passwd.getText().toString().trim();
                String course = "";
                String gender = "";

                if (cb_Web.isChecked()){ course = "Web"; }

                if (cb_Android.isChecked()){ course = "Android"; }

                if (cb_Android.isChecked() && cb_Web.isChecked()){
                    course = "Web + Android";
                }

                if (rb_Male.isChecked()){ gender = "Male"; }

                if (rb_Female.isChecked()){ gender = "Female"; }

                String toast_text = "Username : "+user+" Passwd : "+passwd+" Course : "+course+" Gender : "+gender;

                Toast.makeText(MainActivity.this, toast_text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}