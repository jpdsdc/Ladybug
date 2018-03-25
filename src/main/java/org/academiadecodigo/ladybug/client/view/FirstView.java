package org.academiadecodigo.ladybug.client.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.ladybug.client.controller.AuthController;
import org.academiadecodigo.ladybug.client.controller.RegisterController;
import org.academiadecodigo.ladybug.utils.Messages;

public class FirstView extends AbstractView {

    private String[] firstMenuOptions;
    private int answerIndex;

    public FirstView(Prompt prompt) {
        super(prompt);

        firstMenuOptions = new String[]{"Login", "Register", "Exit"};
    }

    @Override
    public void show() {
        MenuInputScanner scanner = new MenuInputScanner(firstMenuOptions);
        scanner.setMessage(Messages.INITIALMESSAGE + "");

        answerIndex = prompt.getUserInput(scanner);
    }

    public int getAnswerIndex() {
        return answerIndex;
    }
}
