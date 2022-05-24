package com.example.question1;

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
    Button submitBtn;
    RadioButton rbMale, rbFemale, rbOther;
    CheckBox cb_bca,cb_btech,cb_bsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Username = findViewById(R.id.et_Username);
        et_Passwd = findViewById(R.id.et_Passwd);
        submitBtn = findViewById(R.id.sumbitBtn);
        rbMale = findViewById(R.id.rb_male);
        rbFemale = findViewById(R.id.rb_female);
        rbOther = findViewById(R.id.rb_others);
        cb_bca = findViewById(R.id.cbBCA);
        cb_btech = findViewById(R.id.cbBTECH);
        cb_bsc = findViewById(R.id.cbBSC);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = et_Username.getText().toString().trim();
                String passwd = et_Passwd.getText().toString().trim();
                String course = "";
                String gender = "";

                if (cb_bca.isChecked()){
                    course = "BCA";
                }
                if (cb_bsc.isChecked()){
                    course = "BSC-IT";
                }
                if (cb_btech.isChecked()) {
                    course = "B.TECH";
                }
                if (rbMale.isChecked()){
                    gender = "Male";
                }
                if (rbFemale.isChecked()){
                    gender = "Female";
                }
                if (rbOther.isChecked()){
                    gender = "Other";
                }
                Toast.makeText(MainActivity.this, "Username : "+user+" Passwd : "+passwd+" Course : "+course+" Gender : "+gender, Toast.LENGTH_SHORT).show();
            }
        });


    }
}