package org.academiadecodigo.ladybug.controller;

import org.academiadecodigo.ladybug.service.AuthService;
import org.academiadecodigo.ladybug.view.View;

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
        authService.register("testeeeee", "tessssste");
        return authService.authenticate(username, password);
    }


}
