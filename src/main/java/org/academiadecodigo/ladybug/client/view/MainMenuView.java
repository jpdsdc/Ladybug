package org.academiadecodigo.ladybug.client.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

public class AfterLoginView extends AbstractView {

    private String[] menuOptions;
    private int answerIndex;

    public AfterLoginView(Prompt prompt) {
        super(prompt);
        menuOptions = new String[]{"Select a day", "Select a event genre", "Return"};
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
