package org.academiadecodigo.ladybug.client.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.ladybug.client.controller.AuthController;
import org.academiadecodigo.ladybug.client.controller.MainMenuController;
import org.academiadecodigo.ladybug.utils.Ansi;
import org.academiadecodigo.ladybug.utils.Messages;

public class LoginView extends AbstractView {

    private AuthController authController;
    private MainMenuController mainMenuController;

    public LoginView(Prompt prompt) {
        super(prompt);
    }

    @Override
    public void show() {

        StringInputScanner usernameScanner = new StringInputScanner();
        PasswordInputScanner passwordScanner = new PasswordInputScanner();

        usernameScanner.setMessage(Messages.ENTERUSERNAME + "");
        passwordScanner.setMessage(Messages.ENTERPASSWORD + "");

        String username = prompt.getUserInput(usernameScanner);
        String password = prompt.getUserInput(passwordScanner);

        if(authController.login(username, password)){
            System.out.println(Ansi.Red.colorize(Ansi.HighIntensity.colorize("Welcome, " + username + ".")));
            mainMenuController.init();
            return;
        }

        System.err.println(Messages.CANTLOGIN);
        show();
    }

    public void setAuthController(AuthController authController) {
        this.authController = authController;
    }

    public void setMainMenuController(MainMenuController mainMenuController) {
        this.mainMenuController = mainMenuController;
    }
}
