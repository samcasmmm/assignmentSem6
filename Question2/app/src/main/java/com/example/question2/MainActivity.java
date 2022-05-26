package com.example.question2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText et_Text;
    Button submitBTN;
    RadioButton rbUpper, rbLower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_Text = findViewById(R.id.et_Text);
        submitBTN = findViewById(R.id.sumbitBtn);
        rbUpper = findViewById(R.id.rb_Upper);
        rbLower = findViewById(R.id.rb_Lower);

        submitBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String inputText = et_Text.getText().toString().trim();
            String str = "";

            if (rbUpper.isChecked()){
                str = inputText.toUpperCase(Locale.ROOT);
            }
            if (rbLower.isChecked()){
                str = inputText.toLowerCase(Locale.ROOT);
            }
                Toast.makeText(MainActivity.this, "Original : "+inputText+" Changed : "+str, Toast.LENGTH_SHORT).show();

            }
        });
    }
}