package ca.cbc.daggerpresentation;

import dagger.Component;

@AppScope
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(MainActivity mainActivity);
}
