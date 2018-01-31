package com.daggersetup.di;

import com.daggersetup.MainActivity;
import com.daggersetup.datalibrary.di.DataComponent;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);

    DataComponent.Builder dataComponentBuilder();

    @Component.Builder
    interface Builder {
        AppComponent build();
        Builder appModule(AppModule appModule);
    }
}
