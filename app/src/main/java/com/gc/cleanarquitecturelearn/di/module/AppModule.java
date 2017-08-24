package com.gc.cleanarquitecturelearn.di.module;

import android.app.Application;

import com.gc.cleanarquitecturelearn.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mmosquera on 23/08/2017.
 * TODO: Application module implementation
 */

@Module
public class AppModule {

    private App application;

    public AppModule(App _application){
        this.application = _application;
    }

    @Provides
    @Singleton
    Application provideApplication(){
        return application;
    }

}
