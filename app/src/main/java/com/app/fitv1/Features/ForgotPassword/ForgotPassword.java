package com.app.fitv1.Features.ForgotPassword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.app.fitv1.Base.BaseActivity;
import com.app.fitv1.ForgetPasswordViewModel;
import com.app.fitv1.R;
import com.app.fitv1.RegisterViewModel;
import com.app.fitv1.databinding.ActivityForgotPasswordBinding;

public class ForgotPassword extends BaseActivity<ActivityForgotPasswordBinding, ForgotPasswordPresenter> implements ForgotPasswordView {

    public static void start(Context context) {
        Intent starter = new Intent(context, ForgotPassword.class);
        context.startActivity(starter);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_forgot_password;
    }

    @Override
    protected void onCreateActivityG() {
        injectPresenter(new ForgotPasswordPresenter());
        getPresenter().attachView(this);
        ForgetPasswordViewModel forgetPasswordViewModel = new ForgetPasswordViewModel();
        binding.setHandler(forgetPasswordViewModel);
        binding.setData(forgetPasswordViewModel);
    }

    @Override
    public void initViews() {

    }

    @Override
    public Context getActivityG() {
        return ForgotPassword.this;
    }
}
