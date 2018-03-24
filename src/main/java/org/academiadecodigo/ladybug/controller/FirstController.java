package org.academiadecodigo.ladybug.controller;

import org.academiadecodigo.ladybug.view.View;

public class FirstController extends AbstractController {

    public FirstController(View view) {
        super(view);
    }

    @Override
    public void init() {
        view.show();

    }

}
