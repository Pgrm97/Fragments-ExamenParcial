package com.pucmm.fragments_examenparcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        FragmentA fragmentA = new FragmentA();
        transaction.add(R.id.frameOne, fragmentA);
        transaction.commit();
    }

    public void toFragmentB(String s) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        FragmentB fragmentB = new FragmentB();
        Bundle bundle = new Bundle();
        bundle.putString("first", s);
        fragmentB.setArguments(bundle);
        transaction.replace(R.id.frameOne, fragmentB);
        transaction.commit();
    }
}