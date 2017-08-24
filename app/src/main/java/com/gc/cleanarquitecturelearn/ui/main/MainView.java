package com.gc.cleanarquitecturelearn.ui.main;

import com.gc.cleanarquitecturelearn.data.entity.UsersEntity;

import java.util.List;

/**
 * Created by mmosquera on 23/08/2017.
 */

public interface MainView {

    void getUsers(List<UsersEntity> users);

}
