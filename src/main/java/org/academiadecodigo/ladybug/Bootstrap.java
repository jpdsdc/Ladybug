package org.academiadecodigo.ladybug;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.ladybug.controller.AuthController;
import org.academiadecodigo.ladybug.service.AuthService;
import org.academiadecodigo.ladybug.service.AuthServiceImpl;
import org.academiadecodigo.ladybug.view.LoginView;

public class Bootstrap {


    public void wiredObjects() {

        Prompt prompt = new Prompt(System.in, System.out);
        AuthService authService = new AuthServiceImpl();
        LoginView loginView = new LoginView(prompt);
        AuthController authController = new AuthController(loginView, authService);
        loginView.setAuthController(authController);
        authController.init();


    }
}
