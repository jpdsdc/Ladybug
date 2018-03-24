package org.academiadecodigo.ladybug.client.controller;

import org.academiadecodigo.ladybug.client.view.View;

public abstract class AbstractController implements Controller{

    protected View view;

    public AbstractController(View view) {
        this.view = view;
    }

}
