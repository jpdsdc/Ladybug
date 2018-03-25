package org.academiadecodigo.ladybug.client.controller;

import org.academiadecodigo.ladybug.client.view.AfterLoginView;

public class AfterLoginController implements Controller{

    private AfterLoginView afterLoginView;

    public AfterLoginController(AfterLoginView loginView) {
        this.afterLoginView = loginView;
    }

    @Override
    public void init() {
        afterLoginView.show();

    }
}
