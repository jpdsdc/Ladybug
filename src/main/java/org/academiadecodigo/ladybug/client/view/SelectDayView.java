package org.academiadecodigo.ladybug.client.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

public class SelectDayView extends AbstractView{

    private String[] options;

    int selected;

    public SelectDayView(Prompt prompt) {
        super(prompt);
        options = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    }

    @Override
    public void show() {
        MenuInputScanner menuInputScanner = new MenuInputScanner(options);
        menuInputScanner.setMessage("Select a day: ");

        selected = prompt.getUserInput(menuInputScanner);
    }

    public String getSelected(){
        return options[selected - 1];
    }
}