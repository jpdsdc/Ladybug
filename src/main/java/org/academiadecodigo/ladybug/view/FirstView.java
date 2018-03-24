package org.academiadecodigo.ladybug.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.ladybug.controller.AuthController;
import org.academiadecodigo.ladybug.controller.FirstController;
import org.academiadecodigo.ladybug.controller.RegisterController;

public class FirstView extends AbstractView {

    private String[] firstMenuOptions;
    private int answerIndex;

    private AuthController authController;
    private RegisterController registerController;

    public FirstView(Prompt prompt) {
        super(prompt);
        firstMenuOptions = new String[]{"Login", "Register", "Exit"};
    }

    @Override
    public void show() {

        MenuInputScanner scanner = new MenuInputScanner(firstMenuOptions);
        scanner.setMessage("Choose one option: ");

        answerIndex = prompt.getUserInput(scanner);

        switch (answerIndex) {
            case 1:
                authController.init();
                break;
            case 2:
                registerController.init();
                break;
            case 3:
                System.exit(0);
                break;

        }
    }

    public void setAuthController(AuthController authController) {
        this.authController = authController;
    }

    public void setRegisterController(RegisterController registerController) {
        this.registerController = registerController;
    }

    public int getAnswerIndex() {
        return answerIndex;
    }
}
