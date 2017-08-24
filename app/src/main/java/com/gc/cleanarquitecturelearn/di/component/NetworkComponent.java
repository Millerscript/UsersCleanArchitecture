package com.gc.cleanarquitecturelearn.di.component;

import com.gc.cleanarquitecturelearn.App;
import com.gc.cleanarquitecturelearn.data.repository.UsersRepository;
import com.gc.cleanarquitecturelearn.di.module.AppModule;
import com.gc.cleanarquitecturelearn.di.module.InteractorsModule;
import com.gc.cleanarquitecturelearn.di.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by mmosquera on 23/08/2017.
 */
@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface NetworkComponent {

    void inject(App app);
    Retrofit retrofit();

}
