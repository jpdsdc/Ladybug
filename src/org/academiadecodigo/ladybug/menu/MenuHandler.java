package org.academiadecodigo.ladybug.menu;

import org.academiadecodigo.ladybug.events.EventManager;

public class MenuHandler {

    //TODO: add prompt library
    private EventManager eventManager;

    public MenuHandler(){
        eventManager = new EventManager();
    }

    /**
     * Setup in an action order
     */
    public void setup(){
        new MainMenu();
    }
}
