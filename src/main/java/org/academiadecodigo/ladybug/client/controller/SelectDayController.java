package org.academiadecodigo.ladybug.client.controller;

import org.academiadecodigo.ladybug.client.view.SelectDayView;
import org.academiadecodigo.ladybug.client.view.View;

public class SelectDayController extends AbstractController{

    public SelectDayController(View view) {
        super(view);
    }

    @Override
    public void init() {
        view.show();
    }

}
