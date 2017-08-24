package com.gc.cleanarquitecturelearn;

import android.app.Application;
import android.content.Context;

import com.gc.cleanarquitecturelearn.di.component.DaggerNetworkComponent;
import com.gc.cleanarquitecturelearn.di.component.NetworkComponent;
import com.gc.cleanarquitecturelearn.di.module.AppModule;
import com.gc.cleanarquitecturelearn.di.module.NetworkModule;

/**
 * Created by mmosquera on 23/08/2017.
 */

public class App extends Application {

    private NetworkComponent component;

    public static App get(Context context){
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate(){
        super.onCreate();
        setupGraph();
    }

    /**
     * TODO: inyectamos los modulos a la aplicación
     * */
    private void setupGraph(){
        component = DaggerNetworkComponent.builder().appModule(new AppModule(this)).networkModule(new NetworkModule("https://jsonplaceholder.typicode.com/")).build();
        component.inject(this);
    }

    public NetworkComponent component(){
        return  component;
    }

}
