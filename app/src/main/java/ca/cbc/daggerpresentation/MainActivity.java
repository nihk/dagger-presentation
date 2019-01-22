package ca.cbc.daggerpresentation;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.Lazy;

public class MainActivity extends AppCompatActivity {

    @Inject
    LocalDatabase localDatabase;

    @Inject
    TableMetadata tableMetadata;

    @Inject
    TableMetadata tableMetadata2;

    @Inject @First
    SharedPreferences sharedPreferencesFirst;

    @Inject @Second
    SharedPreferences sharedPreferencesSecond;

    @Inject
    Provider<ExoPlayer> exoPlayer;

    ExoPlayer exo;

    @Inject
    Lazy<ExoPlayer> lazyExo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.component(this)
                .inject(this);

        ExoPlayer e = exoPlayer.get();
        ExoPlayer e2 = exoPlayer.get();

        lazyExo.get();

        localDatabase.doSomething();
    }

    @Override
    protected void onStart() {
        super.onStart();
        exo = exoPlayer.get();
    }


}
