package com.mosso.mvpexample.interaptor;

/**
 * Created by isaigarciamoso on 21/01/18.
 */

public interface PreferenceManager {

    void salvardBooleanPreferences(String key,boolean value);
    boolean recuperarBooleanPreferences(String key);
}
