package org.academiadecodigo.ladybug.client.controller;

import org.academiadecodigo.ladybug.client.view.FirstView;

public class FirstController implements Controller{

    private FirstView view;

    private AuthController authController;
    private RegisterController registerController;

    public FirstController(FirstView view) {
        this.view = view;
    }

    @Override
    public void init() {
        view.show();
        showResults();
    }

    private void showResults() {
        switch (view.getAnswerIndex()) {
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

    public void setView(FirstView view) {
        this.view = view;
    }

    public void setAuthController(AuthController authController) {
        this.authController = authController;
    }

    public void setRegisterController(RegisterController registerController) {
        this.registerController = registerController;
    }
}
