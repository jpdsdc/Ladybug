package org.academiadecodigo.ladybug.client.menu.actions;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.ladybug.client.model.UserManager;
import org.academiadecodigo.ladybug.client.menu.parent.AbstractMenuAction;

public class LoginAction extends AbstractMenuAction {

    public LoginAction(UserManager userManager) {
        super(userManager);
    }

    @Override
    public void execute(Prompt prompt) {
        StringInputScanner usernameScanner = new StringInputScanner();
        usernameScanner.setMessage("What's your username? ");

        PasswordInputScanner passwordScanner = new PasswordInputScanner();
        passwordScanner.setMessage("What's your password? ");

        String username = prompt.getUserInput(usernameScanner);
        String password = prompt.getUserInput(passwordScanner);

        userManager.login(username, password);
    }
}