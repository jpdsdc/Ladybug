package org.academiadecodigo.ladybug.client.controller;

import org.academiadecodigo.ladybug.client.service.AuthService;
import org.academiadecodigo.ladybug.client.view.View;

public class AuthController extends AbstractController {

    private AuthService authService;

    public AuthController(View view, AuthService authService) {
        super(view);
        this.authService = authService;
    }

    @Override
    public void init() {
        view.show();
    }

    public boolean login(String username, String password) {
        return authService.authenticate(username, password);
    }


}
