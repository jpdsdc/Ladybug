package org.academiadecodigo.ladybug.menu.parent;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

public abstract class Menu {

    private Prompt prompt;

    private String[] options;
    private MenuInputScanner menuScanner;

    public Menu(Prompt prompt, String message, String[] options){
        this.prompt = prompt;
        this.options = options;
        menuScanner = new MenuInputScanner(options);
        menuScanner.setMessage(message);
    }

    public boolean currentOption(String option){
        return this.options[prompt.getUserInput(menuScanner) - 1].equals(option);
    }

    public Prompt getPrompt() {
        return prompt;
    }

    public abstract void execute();
}
