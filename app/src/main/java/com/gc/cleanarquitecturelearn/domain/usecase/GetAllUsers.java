package com.gc.cleanarquitecturelearn.domain.usecase;

import android.util.Log;

import com.gc.cleanarquitecturelearn.data.repository.UsersRepository;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * Created by mmosquera on 23/08/2017.
 */

public class GetAllUsers implements GetAllUsersUseCase{

    Retrofit retrofit;
    private UsersRepository usersRepository;


    @Inject
    public GetAllUsers(Retrofit retrofit, UsersRepository _usersRepository){
        this.usersRepository = _usersRepository;
        this.retrofit = retrofit;
    }

    @Override
    public void execute(CallBack callBack) {
        this.usersRepository.getAllUser(callBack, retrofit);
        Log.d("#","Executing use case");
    }

}
