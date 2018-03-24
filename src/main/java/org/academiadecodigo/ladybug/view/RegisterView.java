package org.academiadecodigo.ladybug.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.ladybug.controller.RegisterController;

public class RegisterView extends AbstractView {

    private RegisterController registerController;

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

        registerController.register(username, password);
    }

    public void setRegisterController(RegisterController registerController) {
        this.registerController = registerController;
    }
}
