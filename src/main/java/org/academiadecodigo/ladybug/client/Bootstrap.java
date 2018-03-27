package org.academiadecodigo.ladybug.client;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.ladybug.client.controller.*;
import org.academiadecodigo.ladybug.client.model.UserHandler;
import org.academiadecodigo.ladybug.client.service.AuthService;
import org.academiadecodigo.ladybug.client.service.JdbcAuthService;
import org.academiadecodigo.ladybug.client.service.view.MainMenuService;
import org.academiadecodigo.ladybug.client.service.view.MainMenuServiceImpl;
import org.academiadecodigo.ladybug.client.view.*;

public class Bootstrap {

    private UserHandler userHandler = new UserHandler();

    public void wiredObjects() {
        Prompt prompt = new Prompt(System.in, System.out);

        FirstView firstView = new FirstView(prompt);
        RegisterView registerView = new RegisterView(prompt);
        LoginView loginView = new LoginView(prompt);
        MainMenuView mainMenuView = new MainMenuView(prompt);
        GenreView genreView = new GenreView(prompt);

        //Create services
        AuthService authService = new JdbcAuthService();
        MainMenuService mainMenuService = new MainMenuServiceImpl(mainMenuView);

        //Create controllers
        EventGenreController eventGenreController = new EventGenreController(genreView);
        AuthController authController = new AuthController(loginView, authService);
        RegisterController registerController = new RegisterController(registerView);
        FirstController firstController = new FirstController(firstView);
        MainMenuController mainMenuController = new MainMenuController(mainMenuService);
        SelectEventView selectEventView = new SelectEventView(prompt);
        SelectEventController selectEventController = new SelectEventController(selectEventView);

        //Setup views
        registerView.setRegisterController(registerController);
        registerView.setMainMenuController(mainMenuController);
        loginView.setAuthController(authController);
        loginView.setMainMenuController(mainMenuController);
        genreView.setSelectEventView(selectEventView);

        //Setup controllers
        registerController.setAuthService(authService);
        firstController.setAuthController(authController);
        firstController.setRegisterController(registerController);
        firstController.setView(firstView);
        eventGenreController.setUserHandler(userHandler);

        //Client
        mainMenuService.setSelectEventView(selectEventView);
        mainMenuService.setUserHandler(userHandler);
        mainMenuService.setGenreView(genreView);

        firstController.init();
        userHandler.init("localhost", 8080);
    }
}
