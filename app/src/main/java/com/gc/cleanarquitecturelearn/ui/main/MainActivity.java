package com.gc.cleanarquitecturelearn.ui.main;

import android.util.Log;
import android.widget.TextView;

import com.gc.cleanarquitecturelearn.R;
import com.gc.cleanarquitecturelearn.common.BaseActivity;
import com.gc.cleanarquitecturelearn.data.entity.UsersEntity;
import com.gc.cleanarquitecturelearn.di.component.DaggerUsersComponent;
import com.gc.cleanarquitecturelearn.di.component.NetworkComponent;
import com.gc.cleanarquitecturelearn.di.module.UsersModule;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.List;

import javax.inject.Inject;

@EActivity(R.layout.activity_main)
public class MainActivity extends BaseActivity implements MainView {

    @ViewById(R.id.tvUserName)
    TextView mUserName;

    @Inject
    MainPresenter mainPresenter;

    @AfterViews
    void setupView(){
        mainPresenter.setView(this);
    }

    @Override
    protected void setupComponent(NetworkComponent appComponent){
        DaggerUsersComponent.builder().networkComponent(appComponent).usersModule(new UsersModule(this)).build().inject(this);
    }

    @Override
    public void onResume(){
        super.onResume();
        mainPresenter.onResume();
    }

    @Override
    public void getUsers(List<UsersEntity> users) {
        Log.d("#","Selected once: "+users.get(5).getUsername());
        mUserName.setText(users.get(5).getUsername());
    }
}
