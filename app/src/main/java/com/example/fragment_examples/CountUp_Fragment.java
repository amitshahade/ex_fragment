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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)

    {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_count_up_, container, false);
        TextView tv1 = (TextView)view.findViewById(R.id.tv1);
        TextView tv2 = (TextView)view.findViewById(R.id.tv2);

        Button b1 = (Button)view.findViewById(R.id.b1);


        String subtext = getArguments().getString("key");
        tv2.setText(subtext);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String con=String.valueOf(++count);
                tv1.setText(con);

            }
        });

        return view;
    }
}