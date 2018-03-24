package org.academiadecodigo.ladybug.client.menu.parent;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class Menu {

    private Prompt prompt;

    private MenuInputScanner menuScanner;
    private Map<Integer, MenuAction> actions;

    public Menu(Prompt prompt, String message, String[] options){
        this.prompt = prompt;
        actions = new HashMap<>();

        menuScanner = new MenuInputScanner(options);
        menuScanner.setMessage(message);
    }

    /**
     * Executes the selection option
     */
    public void execute(){
        int option = prompt.getUserInput(menuScanner);

        if(!actions.containsKey(option)){
            throw new NoSuchElementException("No action to option " + option);
        }

        actions.get(option).execute(prompt);
    }

    /**
     * Creates a new action to a selected option
     * @param option menu option
     * @param action menu action
     */
    public void createAction(int option, MenuAction action){
        actions.put(option, action);
    }

}
