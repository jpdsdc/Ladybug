package org.academiadecodigo.ladybug.client.controller;

import org.academiadecodigo.ladybug.client.model.UserHandler;
import org.academiadecodigo.ladybug.client.view.SelectDayView;
import org.academiadecodigo.ladybug.client.view.View;

public class SelectDayController extends AbstractController{

    private UserHandler userHandler;
    public SelectDayController(View view) {
        super(view);
    }

    @Override
    public void init() {
        view.show();

        SelectDayView selectDayView = (SelectDayView) view;

    }

    public void setUserHandler(UserHandler userHandler) {
        this.userHandler = userHandler;
    }
}
