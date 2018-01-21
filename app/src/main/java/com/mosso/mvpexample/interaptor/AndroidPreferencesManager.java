package com.mosso.mvpexample.interaptor;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by isaigarciamoso on 21/01/18.
 */

public class AndroidPreferencesManager implements PreferenceManager {
    private final SharedPreferences sharedPreferences;

    public AndroidPreferencesManager(Context context) {
        sharedPreferences = context.getSharedPreferences("preferencias",context.MODE_PRIVATE);
    }

    @Override
    public void salvardBooleanPreferences(String key, boolean value) {
       sharedPreferences.edit().putBoolean(key,value).apply();
    }

    @Override
    public boolean recuperarBooleanPreferences(String key) {
       return sharedPreferences.getBoolean(key,false);
    }
}
