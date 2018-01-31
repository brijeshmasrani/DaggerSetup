package com.daggersetup.di;

import com.daggersetup.BuildConfig;
import com.daggersetup.datalibrary.di.DataComponent;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

@Module(subcomponents = DataComponent.class)
public class AppModule {

    @Provides
    @Singleton
    @Named("VersionName")
    String providesVersionName(){
        return BuildConfig.VERSION_NAME;
    }

}
