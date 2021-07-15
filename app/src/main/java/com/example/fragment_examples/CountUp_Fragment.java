package com.example.fragment_examples;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class CountUp_Fragment extends Fragment {


    int count=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View fragmentview = inflater.inflate(R.layout.fragment_count_up_, container, false);
        TextView tv1 = (TextView)fragmentview.findViewById(R.id.tv1);
        Button b1 = (Button)fragmentview.findViewById(R.id.b1);

//        Bundle bundle = this.getArguments();
//        String strtext =bundle.getString("key");
//        System.out.println(""+strtext);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String con=String.valueOf(++count);
                tv1.setText(con);

            }
        });

        return fragmentview;
    }
}