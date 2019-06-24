package com.app.fitv1;

import android.view.View;

public class ForgetPasswordViewModel {
    private String email = "";

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void onClick(final View view) {
        view.getId();// TODO: 2019-06-21 hit api to forgot password
    }
}
