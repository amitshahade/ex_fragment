package com.example.fragment_examples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class softcla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_softcla);

        ListView lv1= (ListView)findViewById(R.id.lv1);

        String[] names= new String[]{"Amit","Amar","Kaushik","Shivam","Aditya","sid","Pranay","Roshan","Raj","Rajnish","Shivam","Aditya","sid","Pranay","Roshan","Raj","Rajnish","Shivam","Aditya","sid","Pranay","Roshan","Raj","Rajnish"};


        ArrayAdapter<String> namesadap = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                names
        );
        lv1.setAdapter(namesadap);
    }
}