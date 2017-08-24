package com.gc.cleanarquitecturelearn.data.repository;

import android.util.Log;

import com.gc.cleanarquitecturelearn.data.entity.UsersEntity;
import com.gc.cleanarquitecturelearn.domain.usecase.GetAllUsersUseCase;
import com.gc.cleanarquitecturelearn.rest.RestApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by mmosquera on 23/08/2017.
 */

public class UsersRepository {

    public void getAllUser(final GetAllUsersUseCase.CallBack getAllUsersUseCase, Retrofit retrofit){

        Log.d("#","EXECUTING...");
        Call<List<UsersEntity>> users = retrofit.create(RestApi.class).downloadUsers();
        users.enqueue(new Callback<List<UsersEntity>>() {
            @Override
            public void onResponse(Call<List<UsersEntity>> call, Response<List<UsersEntity>> response) {
                if(response.isSuccessful()){
                    Log.d("#","EXECUTING SUCCESSFUL...");
                    getAllUsersUseCase.onLoadAllUsers(response.body());

                }
            }

            @Override
            public void onFailure(Call<List<UsersEntity>> call, Throwable t) {
                Log.e("#","ERROR EXECUTING...");
            }
        });
    }



}
