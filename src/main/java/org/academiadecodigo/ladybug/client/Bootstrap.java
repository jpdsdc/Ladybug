package org.academiadecodigo.ladybug.client;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.ladybug.client.controller.AuthController;
import org.academiadecodigo.ladybug.client.controller.FirstController;
import org.academiadecodigo.ladybug.client.controller.RegisterController;
import org.academiadecodigo.ladybug.client.model.UserHandler;
import org.academiadecodigo.ladybug.client.service.AuthService;
import org.academiadecodigo.ladybug.client.service.JdbcAuthService;
import org.academiadecodigo.ladybug.client.service.SimpleAuthService;
import org.academiadecodigo.ladybug.client.view.FirstView;
import org.academiadecodigo.ladybug.client.view.LoginView;
import org.academiadecodigo.ladybug.client.view.RegisterView;

public class Bootstrap {

    public void wiredObjects() {
        Prompt prompt = new Prompt(System.in, System.out);
        AuthService authService = new SimpleAuthService();

        //Create views
        FirstView firstView = new FirstView(prompt);
        RegisterView registerView = new RegisterView(prompt);
        LoginView loginView = new LoginView(prompt);

        //Create controllers
        AuthController authController = new AuthController(loginView, authService);
        RegisterController registerController = new RegisterController(registerView);
        FirstController firstController = new FirstController(firstView);

        //Setup views
        registerView.setRegisterController(registerController);
        loginView.setAuthController(authController);

        //Setup controllers
        registerController.setAuthService(authService);
        firstController.setAuthController(authController);
        firstController.setRegisterController(registerController);
        firstController.setView(firstView);

        //Client
        UserHandler userHandler = new UserHandler();
        userHandler.init("localhost", 8080);
    }
}
