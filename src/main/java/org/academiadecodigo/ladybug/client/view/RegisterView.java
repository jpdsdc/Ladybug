package org.academiadecodigo.ladybug.client.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.ladybug.client.controller.MainMenuController;
import org.academiadecodigo.ladybug.client.controller.RegisterController;

public class RegisterView extends AbstractView {

    private RegisterController registerController;
    private MainMenuController mainMenuController;

    public RegisterView(Prompt prompt) {
        super(prompt);
    }

    @Override
    public void show() {

        StringInputScanner usernameScanner = new StringInputScanner();
        usernameScanner.setMessage("Choose your username? ");

        PasswordInputScanner passwordScanner = new PasswordInputScanner();
        passwordScanner.setMessage("Choose your password? ");

        String username = prompt.getUserInput(usernameScanner);
        String password = prompt.getUserInput(passwordScanner);


        if(registerController.register(username, password) == null){
            System.err.println("Unable to register, try again.");
            show();
            return;
        }

        System.out.println("Welcome, " + username + "!!");
        mainMenuController.init();
    }

    public void setRegisterController(RegisterController registerController) {
        this.registerController = registerController;
    }

    public void setMainMenuController(MainMenuController mainMenuController) {
        this.mainMenuController = mainMenuController;
    }
}
