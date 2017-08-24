package com.gc.cleanarquitecturelearn.domain.usecase;

import com.gc.cleanarquitecturelearn.data.entity.UsersEntity;

import java.util.List;

/**
 * Created by mmosquera on 23/08/2017.
 */

public interface GetAllUsersUseCase {

    interface CallBack{
        void onLoadAllUsers(List<UsersEntity> usersEntities);
    }

    void execute(CallBack callBack);

}
