package com.example.fragment_examples;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

public class LstFragment extends Fragment {

     String[] names = new String[]{"Amit","Amar","Kaushik","Shivam","Aditya","sid","Pranay","Roshan","Raj","Rajnish"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView =   inflater.inflate(R.layout.fragment_list, container, false);
        ListView lv12 = (ListView) fragmentView.findViewById(R.id.lv12);


        ArrayAdapter<String> namesadapter = new ArrayAdapter<>(
                getActivity().getBaseContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                names
                );

        lv12.setAdapter(namesadapter);

        // Inflate the layout for this fragment
        return fragmentView;
    }
}