package com.gc.cleanarquitecturelearn.common;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gc.cleanarquitecturelearn.App;
import com.gc.cleanarquitecturelearn.di.component.NetworkComponent;

/**
 * Created by mmosquera on 23/08/2017.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        setupComponent((NetworkComponent) App.get(this).component());
    }

    protected abstract void setupComponent(NetworkComponent appComponent);

}
