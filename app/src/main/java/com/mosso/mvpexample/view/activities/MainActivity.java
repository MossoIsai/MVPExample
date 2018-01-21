package com.mosso.mvpexample.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mosso.mvpexample.R;
import com.mosso.mvpexample.interaptor.AndroidPreferencesManager;
import com.mosso.mvpexample.interaptor.PreferenceManager;
import com.mosso.mvpexample.presentador.MainPresentador;

public class MainActivity extends AppCompatActivity {

    private MainPresentador mainPresentador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        PreferenceManager preferenceManager = new AndroidPreferencesManager(this);
        preferenceManager = (PreferenceManager) new MainPresentador(preferenceManager);
    }

    @Override
    protected void onResume() {
        super.onResume();

        mainPresentador.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        
        mainPresentador.onPause();
    }
}
