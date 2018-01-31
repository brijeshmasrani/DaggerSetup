package com.daggersetup.datalibrary;

import com.daggersetup.datalibrary.di.DataComponent;
import javax.inject.Inject;
import javax.inject.Named;

public class TestClass {

    @Inject
    @Named("VersionName")
    String versionName;

    @Inject
    @Named("SampleString")
    String string;

    public TestClass(){
    }

    public String getTheData(){
        //return versionName + " from TestClass " + string;
        return null;
    }

}
