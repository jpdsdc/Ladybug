package org.academiadecodigo.ladybug.menu;

public abstract class Menu {

    private String[] options;
    //TODO: input scanner

    public Menu(String[] options){
        this.options = options;
    }

    public abstract void create();
}
