package org.academiadecodigo.ladybug.client.controller;

import org.academiadecodigo.ladybug.client.model.User;
import org.academiadecodigo.ladybug.client.service.AuthService;
import org.academiadecodigo.ladybug.client.view.View;

public class RegisterController extends AbstractController {

    private AuthService authService;

    public RegisterController(View view) {
        super(view);
    }

    @Override
    public void init() {
        view.show();
    }

    public User register(String username, String password) {
        return authService.register(username, password);
    }

    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }
}
