package com.gc.cleanarquitecturelearn.ui.main;

import com.gc.cleanarquitecturelearn.data.entity.UsersEntity;
import com.gc.cleanarquitecturelearn.domain.usecase.GetAllUsersUseCase;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by mmosquera on 23/08/2017.
 */
public class UsersPresenter implements MainPresenter {

    private MainView view;
    private GetAllUsersUseCase getAllUsersUseCase;

    @Inject
    public UsersPresenter(GetAllUsersUseCase _getAllUsersUseCase){

        this.getAllUsersUseCase = _getAllUsersUseCase;
    }

    @Override
    public void onResume() {

        getAllUsersUseCase.execute(new GetAllUsersUseCase.CallBack() {
            @Override
            public void onLoadAllUsers(List<UsersEntity> usersEntities) {
                view.getUsers(usersEntities);
            }
        });
    }

    @Override
    public void setView(MainView mainView) {
        this.view = mainView;
    }

}
