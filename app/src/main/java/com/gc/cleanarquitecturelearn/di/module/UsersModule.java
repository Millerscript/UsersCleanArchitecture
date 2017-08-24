package com.gc.cleanarquitecturelearn.di.module;

import com.gc.cleanarquitecturelearn.data.repository.UsersRepository;
import com.gc.cleanarquitecturelearn.domain.usecase.GetAllUsers;
import com.gc.cleanarquitecturelearn.domain.usecase.GetAllUsersUseCase;
import com.gc.cleanarquitecturelearn.ui.main.MainPresenter;
import com.gc.cleanarquitecturelearn.ui.main.MainView;
import com.gc.cleanarquitecturelearn.ui.main.UsersPresenter;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by mmosquera on 23/08/2017.
 */

@Module
public class UsersModule {

    private MainView mainView;

    public UsersModule(MainView _mainView){
        this.mainView = _mainView;
    }

    @Provides
    public MainView provideView(){
        return mainView;
    }

    @Provides
    public UsersRepository provideUsersRepository(){
       return new UsersRepository();
    }

    @Provides
    public GetAllUsersUseCase provideUseCase(Retrofit retrofit, UsersRepository usersRepository){
        return new GetAllUsers(retrofit, usersRepository);
    }

    @Provides
    public MainPresenter providePresenter(GetAllUsersUseCase getAllUsersUseCase){
        return new UsersPresenter(getAllUsersUseCase);
    }

}
