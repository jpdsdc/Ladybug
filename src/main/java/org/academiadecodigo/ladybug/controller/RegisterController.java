package org.academiadecodigo.ladybug.controller;

import org.academiadecodigo.ladybug.service.RegisterService;
import org.academiadecodigo.ladybug.view.View;

public class RegisterController extends AbstractController {


    private RegisterService registerService;

    public RegisterController(View view) {
        super(view);
    }

    @Override
    public void init() {

    }

    public boolean register(String username, String password) {
        return registerService.registration(username, password);
    }
}
