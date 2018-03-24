package org.academiadecodigo.ladybug.client;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.ladybug.client.controller.AuthController;
import org.academiadecodigo.ladybug.client.controller.RegisterController;
import org.academiadecodigo.ladybug.client.service.AuthService;
import org.academiadecodigo.ladybug.client.service.JdbcAuthService;
import org.academiadecodigo.ladybug.client.view.FirstView;
import org.academiadecodigo.ladybug.client.view.LoginView;
import org.academiadecodigo.ladybug.client.view.RegisterView;

public class Bootstrap {

    public void wiredObjects() {
        Prompt prompt = new Prompt(System.in, System.out);

        AuthService authService = new JdbcAuthService();
        FirstView firstView = new FirstView(prompt);
        RegisterView registerView = new RegisterView(prompt);
        LoginView loginView = new LoginView(prompt);

        AuthController authController = new AuthController(loginView, authService);
        RegisterController registerController = new RegisterController(registerView);

        firstView.setAuthController(authController);
        firstView.setRegisterController(registerController);
        registerView.setRegisterController(registerController);
        loginView.setAuthController(authController);

        registerController.setAuthService(authService);
        firstView.show();
    }
}
