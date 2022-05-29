package com.example.fragmentcommunicationuserjava;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fragmentcommunicationuserjava.Fragment.FirstFragment;
import com.example.fragmentcommunicationuserjava.Fragment.SecondFragment;
import com.example.fragmentcommunicationuserjava.Model.User;

import java.util.ArrayList;
import java.util.List;

public class RuntimeActivity extends AppCompatActivity implements FirstFragment.FirtListener, SecondFragment.SecondListener {

    FirstFragment firstFragment;
    SecondFragment secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runtime);
        initViews();
    }

    @Override
    public void onFirstSend(String str) {
        secondFragment.updateSecondtext(str);
    }

    @Override
    public void onSecondSend(String str) {
        firstFragment.updateFirstText(str);
    }

    void initViews() {
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.firstfragnent, firstFragment).
                replace(R.id.secondfragment, secondFragment).
                commit();


    }


}