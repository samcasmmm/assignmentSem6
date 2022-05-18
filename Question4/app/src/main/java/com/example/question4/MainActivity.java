package com.example.question4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ListView nameOfCountry;
    String[] countries = new String[]
            {
                    "Russia",
                    "India",
                    "Japan",
                    "South Korea",
                    "USA",
                    "Saudi Arabia",
                    "UK",
                    "UAE"
            };
    List<String> countryName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameOfCountry = (ListView) findViewById(R.id.listView);
        countryName = new ArrayList<String>(Arrays.asList(countries));
        imageView = findViewById(R.id.image);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2, android.R.id.text1, countryName) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView ListItemShow = (TextView) view.findViewById(android.R.id.text1);
                ListItemShow.setTextColor(Color.parseColor("#ffffff"));
                return view;
            }
        };
        nameOfCountry.setAdapter(adapter);
        nameOfCountry.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (countries[position] == "Russia"){
                    imageView.setBackgroundResource(R.drawable.russia);
                }
                if (countries[position] == "India"){
                    imageView.setBackgroundResource(R.drawable.india);
                }
                if (countries[position] == "Japan"){
                    imageView.setBackgroundResource(R.drawable.japan);
                }
                if (countries[position] == "South Korea"){
                    imageView.setBackgroundResource(R.drawable.korea);
                }
                if (countries[position] == "USA"){
                    imageView.setBackgroundResource(R.drawable.usa);
                }
                if (countries[position] == "Saudi Arabia"){
                    imageView.setBackgroundResource(R.drawable.southabria);
                }
                if (countries[position] == "UK"){
                    imageView.setBackgroundResource(R.drawable.uk);
                }
                if (countries[position] == "UAE"){
                    imageView.setBackgroundResource(R.drawable.uae);
                }
                Toast.makeText(MainActivity.this, "You Clicked On " +countries[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}