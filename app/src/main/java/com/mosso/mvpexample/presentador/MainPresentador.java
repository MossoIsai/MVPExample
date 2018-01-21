package com.mosso.mvpexample.presentador;

import com.mosso.mvpexample.interaptor.PreferenceManager;

/**
 * Created by isaigarciamoso on 21/01/18.
 */

public class MainPresentador {

    private static final String ACTIVITY_RESUME =  "activityResumed";
    private final PreferenceManager preferenceManager;

    public MainPresentador(PreferenceManager preferenceManager) {
        this.preferenceManager = preferenceManager;
    }

    public void onResume(){
        preferenceManager.salvardBooleanPreferences("ACTIVITY_RESUMED",true);
    }
    public  void onPause(){
        preferenceManager.recuperarBooleanPreferences("ACTIVITY_RESUMED");
    }


}
