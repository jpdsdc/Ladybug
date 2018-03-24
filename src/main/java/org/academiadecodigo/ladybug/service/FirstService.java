package org.academiadecodigo.ladybug.service;

import org.academiadecodigo.ladybug.controller.FirstController;
import org.academiadecodigo.ladybug.view.FirstView;

public class FirstService {

    private FirstView firstView;
    private FirstController firstController;
    private int option;

    public void execute() {

        option = firstView.getAnswerIndex();

    }
}
