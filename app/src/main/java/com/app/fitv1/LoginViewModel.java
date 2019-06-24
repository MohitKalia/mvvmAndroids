package com.app.fitv1;

import android.view.View;

import com.app.fitv1.Features.ForgotPassword.ForgotPassword;
import com.app.fitv1.Features.Register.Register;

import java.util.HashMap;
import java.util.Map;

public class LoginViewModel {
    private String email = "";
    private String password = "";


    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvRegister:
                Register.start(view.getContext());

                break;
            case R.id.tvForgotPassword:
                ForgotPassword.start(view.getContext());
                break;
            case R.id.btnLogin:
                //LoginActivity.start(view.getContext());
                Map<String, String> map = new HashMap<>();
                map.put("email", getEmail());
                map.put("password", getPassword());
                break;
        }
    }
}