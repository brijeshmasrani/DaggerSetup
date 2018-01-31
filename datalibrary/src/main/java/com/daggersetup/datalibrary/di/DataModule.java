package com.daggersetup.datalibrary.di;

import dagger.Module;
import dagger.Provides;
import javax.inject.Named;

@Module
public class DataModule {

    @Provides
    @LibraryScope
    @Named("SampleString")
    String providesSampleString(){
        return "This is from DataModule";
    }
}
