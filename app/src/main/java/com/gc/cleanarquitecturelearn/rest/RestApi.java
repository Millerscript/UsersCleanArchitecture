package com.gc.cleanarquitecturelearn.rest;

import com.gc.cleanarquitecturelearn.data.entity.UsersEntity;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mmosquera on 23/08/2017.
 */

public interface RestApi {

    @GET("/users")
    Call<List<UsersEntity>> downloadUsers();

}
