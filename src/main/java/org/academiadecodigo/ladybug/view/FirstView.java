package org.academiadecodigo.ladybug.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.ladybug.controller.FirstController;

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
        scanner.setMessage("Choose one option: ");

        answerIndex = prompt.getUserInput(scanner);

    }

    public int getAnswerIndex() {
        return answerIndex;
    }
}
