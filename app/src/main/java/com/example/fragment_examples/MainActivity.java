package com.example.fragment_examples;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {


    Button b2;
    FrameLayout flcontainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b2= findViewById(R.id.b2);
        flcontainer=findViewById(R.id.flcontainer);


        Fragment countUp_fragment= new CountUp_Fragment();
        Bundle bundle = new Bundle();
        bundle.putString("data", "This is Argument Fragment");

        countUp_fragment.setArguments(bundle);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flcontainer, LstFragment.class, null)
                        .addToBackStack(null)
                        .commit();
            }
        });

    }
}