package org.academiadecodigo.ladybug.client.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

public class MainMenuView extends AbstractView {

    private String[] menuOptions;
    private int answerIndex;

    public MainMenuView(Prompt prompt) {
        super(prompt);
        menuOptions = new String[]{"Select a day", "Select a event genre", "Exit"};
    }

    @Override
    public void show() {
        MenuInputScanner scanner = new MenuInputScanner(menuOptions);
        scanner.setMessage("Choose one option: ");

        answerIndex = prompt.getUserInput(scanner);
    }

    public int getAnswerIndex() {
        return answerIndex;
    }
}
