package org.academiadecodigo.ladybug.controller;

import org.academiadecodigo.ladybug.model.User;
import org.academiadecodigo.ladybug.service.AuthService;
import org.academiadecodigo.ladybug.view.RegisterView;
import org.academiadecodigo.ladybug.view.View;

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
