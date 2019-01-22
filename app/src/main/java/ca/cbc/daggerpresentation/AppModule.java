package ca.cbc.daggerpresentation;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @AppScope
    @Provides
    @First
    public SharedPreferences sharedPreferencesFirst() {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @AppScope
    @Provides
    @Second
    public SharedPreferences sharedPreferencesSecond() {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public int aNumber() {
        return 1;
    }
}
