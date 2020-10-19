package com.pucmm.fragments_examenparcial;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.List;

public class FragmentA extends Fragment {

    ListView lv;

    SearchView searchView;
    ArrayAdapter<String> adapter;
    String[] words = new String[]{
            "Android",
            "SDK",
            "NDK",
            "AOSP",
            "Google Play"
    };

    String[] definition = new String[]{
            "Sistema Operativo de código abierto",
            "Software Development Kit",
            "Native Development Kit",
            "Android Open Source Project",
            "Tienda con aplicaciones gratuitas o pagadas"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        lv = (ListView) view.findViewById(R.id.idListView);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, words);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s = definition[position];
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.toFragmentB(s);
            }
        });
        return view;
    }
}