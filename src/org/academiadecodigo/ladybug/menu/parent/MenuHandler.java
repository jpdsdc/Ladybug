package org.academiadecodigo.ladybug.menu.parent;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.ladybug.menu.MainMenu;

public class MenuHandler {

    private Prompt prompt;

    public MenuHandler(){
        prompt = new Prompt(System.in, System.out);
    }

    /**
     * Setup in an action order
     */
    public void setup(){
        new MainMenu(prompt).execute();
    }
}
