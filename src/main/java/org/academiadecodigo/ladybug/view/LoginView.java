package org.academiadecodigo.ladybug.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.ladybug.controller.AuthController;

public class LoginView extends AbstractView{


    private AuthController authController;

    public LoginView(Prompt prompt) {
        super(prompt);
    }

    @Override
    public void show() {

        StringInputScanner usernameScanner = new StringInputScanner();
        usernameScanner.setMessage("What's your username? ");

        PasswordInputScanner passwordScanner = new PasswordInputScanner();
        passwordScanner.setMessage("What's your password? ");

        String username = prompt.getUserInput(usernameScanner);
        String password = prompt.getUserInput(passwordScanner);

        if(authController.login(username, password)){
            System.out.println("Welcome.");
            return;
        }

        System.out.println("Ups!? Try again.");
        show();
    }

    public void setAuthController(AuthController authController) {
        this.authController = authController;
    }
}
