package com.app.fitv1.Features.Login;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.app.fitv1.Base.BaseActivity;
import com.app.fitv1.LoginViewModel;
import com.app.fitv1.ProjectUtils.BaseCallBack;
import com.app.fitv1.R;
import com.app.fitv1.databinding.ActivityLoginBinding;

public class LoginActivity extends BaseActivity<ActivityLoginBinding, LoginPresenter> implements LoginView {
    public static void start(Context context) {
        Intent starter = new Intent(context, LoginActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void onCreateActivityG() {
        injectPresenter(new LoginPresenter());
        getPresenter().attachView(this);
        LoginViewModel loginViewModel = new LoginViewModel();
        binding.setHandler(loginViewModel);
        binding.setData(loginViewModel);
    }

    @Override
    public void initViews() {
    }

    @Override
    public Context getActivityG() {
        return LoginActivity.this;
    }
}
