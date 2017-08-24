package com.gc.cleanarquitecturelearn.di.component;

import com.gc.cleanarquitecturelearn.di.module.UsersModule;
import com.gc.cleanarquitecturelearn.ui.ActivityScope;
import com.gc.cleanarquitecturelearn.ui.main.MainActivity;
import com.gc.cleanarquitecturelearn.ui.main.MainPresenter;

import dagger.Component;

/**
 * Created by mmosquera on 23/08/2017.
 */
@ActivityScope
@Component(dependencies = NetworkComponent.class, modules = UsersModule.class)
public interface UsersComponent {

    void inject(MainActivity mainActivity);

    MainPresenter getMainPresenter();
}
