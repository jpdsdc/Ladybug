package org.academiadecodigo.ladybug.client;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.ladybug.client.controller.*;
import org.academiadecodigo.ladybug.client.service.AuthService;
import org.academiadecodigo.ladybug.client.service.JdbcAuthService;
import org.academiadecodigo.ladybug.client.service.view.MainMenuService;
import org.academiadecodigo.ladybug.client.service.view.MainMenuServiceImpl;
import org.academiadecodigo.ladybug.client.view.*;

public class Bootstrap {

    public void wiredObjects() {
        Prompt prompt = new Prompt(System.in, System.out);

        FirstView firstView = new FirstView(prompt);
        RegisterView registerView = new RegisterView(prompt);
        LoginView loginView = new LoginView(prompt);
        MainMenuView mainMenuView = new MainMenuView(prompt);
        SelectDayView selectDayView = new SelectDayView(prompt);
        GenreView genreView = new GenreView(prompt);
        //Create services
        AuthService authService = new JdbcAuthService();
        MainMenuService mainMenuService = new MainMenuServiceImpl(mainMenuView);

        //Create controllers
        AuthController authController = new AuthController(loginView, authService);
        RegisterController registerController = new RegisterController(registerView);
        FirstController firstController = new FirstController(firstView);
        MainMenuController mainMenuController = new MainMenuController(mainMenuService);
        EventGenreController eventGenreController = new EventGenreController(genreView);
        //Setup views
        registerView.setRegisterController(registerController);
        registerView.setMainMenuController(mainMenuController);
        loginView.setAuthController(authController);
        loginView.setMainMenuController(mainMenuController);
        genreView.setSelectDayView(selectDayView);

        //Setup controllers
        registerController.setAuthService(authService);
        firstController.setAuthController(authController);
        firstController.setRegisterController(registerController);
        firstController.setView(firstView);

        //Client
        mainMenuService.setSelectDayView(selectDayView);
        mainMenuService.setGenreView(genreView);

        firstController.init();
    }
}
