package com.daggersetup.datalibrary.di;

import com.daggersetup.datalibrary.TestClass;
import dagger.Subcomponent;

@LibraryScope
@Subcomponent(modules = DataModule.class)
public interface DataComponent {

    void inject(TestClass testClass);

    @Subcomponent.Builder
    interface Builder {
        DataComponent build();

        Builder dataModule(DataModule dataModule);
    }
}
