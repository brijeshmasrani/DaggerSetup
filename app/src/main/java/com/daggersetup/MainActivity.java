package com.daggersetup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.daggersetup.datalibrary.TestClass;
import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @Inject
    @Named("VersionName")
    String versionName;

   /* @Inject
    @Named("SampleString") */
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MainApplication)getApplication()).getAppComponent().inject(this);

        TextView textView = findViewById(R.id.text_view);

        textView.setText(String.format("%s And %s", versionName, string));

        TestClass testClass = new TestClass();

        String theData = testClass.getTheData();
        System.out.println("=== === === === === === === === === ");
        System.out.println(theData);
        System.out.println("=== === === === === === === === === ");
    }
}
