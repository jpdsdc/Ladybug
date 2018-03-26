package org.academiadecodigo.ladybug.client.service.view;

import org.academiadecodigo.ladybug.client.controller.EventGenreController;
import org.academiadecodigo.ladybug.client.controller.SelectDayController;
import org.academiadecodigo.ladybug.client.view.GenreView;
import org.academiadecodigo.ladybug.client.view.MainMenuView;
import org.academiadecodigo.ladybug.client.view.SelectDayView;

public class MainMenuServiceImpl implements MainMenuService {

    private MainMenuView mainMenuView;
    private SelectDayView selectDayView;
    private GenreView genreView;

    public MainMenuServiceImpl(MainMenuView mainMenuView) {
        this.mainMenuView = mainMenuView;
    }

    @Override
    public void execute() {
        mainMenuView.show();

        switch (mainMenuView.getAnswerIndex()){
            case 1:
                SelectDayController selectDayController = new SelectDayController(selectDayView);
                selectDayController.init();
                break;
            case 2:
                EventGenreController eventGenreController = new EventGenreController(genreView);
                eventGenreController.init();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }

    @Override
    public void setSelectDayView(SelectDayView selectDayView) {
        this.selectDayView = selectDayView;
    }

    @Override
    public void setGenreView(GenreView genreView) {
        this.genreView = genreView;
    }
}
