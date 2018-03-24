package org.academiadecodigo.ladybug.controller;

import org.academiadecodigo.ladybug.view.View;

public abstract class AbstractController implements Controller{

    protected View view;

    public AbstractController(View view) {
        this.view = view;
    }

}
