package com.daggersetup;

import android.app.Application;
import com.daggersetup.di.AppComponent;
import com.daggersetup.di.DaggerAppComponent;

public class MainApplication extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public AppComponent getAppComponent() {
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder().build();
        }
        return appComponent;
    }
}
