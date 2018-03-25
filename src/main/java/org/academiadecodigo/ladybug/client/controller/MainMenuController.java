package org.academiadecodigo.ladybug.client.controller;

import org.academiadecodigo.ladybug.client.service.view.MainMenuService;

public class MainMenuController implements Controller{

    private MainMenuService mainMenuService;

    public MainMenuController(MainMenuService menuService) {
        this.mainMenuService = menuService;
    }

    @Override
    public void init() {
        mainMenuService.execute();
    }
}
