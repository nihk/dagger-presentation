package ca.cbc.daggerpresentation;

import android.app.Application;
import android.content.Context;

public class App extends Application {

    private AppComponent appComponent;

    public TableMetadata tableMetadata;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static AppComponent component(Context context) {
        return ((App) context.getApplicationContext()).appComponent;
    }
}
