package org.academiadecodigo.ladybug.client.service.view;

import org.academiadecodigo.ladybug.client.controller.EventGenreController;
import org.academiadecodigo.ladybug.client.controller.SelectEventController;
import org.academiadecodigo.ladybug.client.model.UserHandler;
import org.academiadecodigo.ladybug.client.view.GenreView;
import org.academiadecodigo.ladybug.client.view.MainMenuView;
import org.academiadecodigo.ladybug.client.view.SelectEventView;

public class MainMenuServiceImpl implements MainMenuService {

    private MainMenuView mainMenuView;
    private SelectEventView selectEventView;
    private GenreView genreView;

    private UserHandler userHandler;

    public MainMenuServiceImpl(MainMenuView mainMenuView) {
        this.mainMenuView = mainMenuView;
    }

    @Override
    public void execute() {
        mainMenuView.show();

        switch (mainMenuView.getAnswerIndex()){
            case 1:
                SelectEventController selectEventController = new SelectEventController(selectEventView);
                selectEventController.init();
                break;
            case 2:
                EventGenreController eventGenreController = new EventGenreController(genreView);
                eventGenreController.setUserHandler(userHandler);
                eventGenreController.init();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }

    @Override
    public void setSelectEventView(SelectEventView selectEventView) {
        this.selectEventView = selectEventView;
    }

    @Override
    public UserHandler getUserHandler() {
        return userHandler;
    }

    public void setUserHandler(UserHandler userHandler) {
        this.userHandler = userHandler;
    }

    @Override
    public void setGenreView(GenreView genreView) {
        this.genreView = genreView;
    }
}
