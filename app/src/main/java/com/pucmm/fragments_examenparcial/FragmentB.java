package com.pucmm.fragments_examenparcial;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment {

    TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_b, container, false);
        tv = (TextView) view.findViewById(R.id.textFragB);
        Bundle bundle = getArguments();
        if (bundle != null){
            String s = bundle.getString("first");
            tv.setText(s);
        }
        return view;
    }
}