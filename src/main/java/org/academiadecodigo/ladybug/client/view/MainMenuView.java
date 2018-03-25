package org.academiadecodigo.ladybug.client.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.ladybug.utils.Messages;

public class MainMenuView extends AbstractView {

    private String[] menuOptions;
    private int answerIndex;

    public MainMenuView(Prompt prompt) {
        super(prompt);
        System.out.println(Messages.WELCOME);
        System.out.println(Messages.LADYBUG);
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
