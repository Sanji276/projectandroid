package com.example.bit6thsem.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.bit6thsem.R;

public class FragmentHolder extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);
        addFragment();
    }
    private void addFragment(){
        FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.flFragmentContainerRoot, new FragmentOne());
        transaction.commit();
    }
}
