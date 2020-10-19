package com.pucmm.fragments_examenparcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

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

    @Override
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);

        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            FragmentA fragmentA = new FragmentA();
            transaction.add(R.id.frameTwo, fragmentA);
            Toast.makeText(this, "Frame Two", Toast.LENGTH_SHORT).show();
            transaction.commit();
        }
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