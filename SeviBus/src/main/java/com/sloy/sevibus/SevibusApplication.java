package com.sloy.sevibus;

import android.app.Application;

import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.answers.Answers;
import com.facebook.stetho.Stetho;
import com.sloy.sevibus.resources.Debug;
import com.sloy.sevibus.resources.StuffProvider;

import io.fabric.sdk.android.Fabric;

public class SevibusApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics(), new Answers());

        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this);
        }
    }
}
