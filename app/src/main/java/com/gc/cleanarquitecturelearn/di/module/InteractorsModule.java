package com.gc.cleanarquitecturelearn.di.module;

import com.gc.cleanarquitecturelearn.data.repository.UsersRepository;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mmosquera on 23/08/2017.
 */
@Module
public class InteractorsModule {

    @Provides
    public UsersRepository provideGetAllUsersInteractor(){
        return new UsersRepository();
    }

}
