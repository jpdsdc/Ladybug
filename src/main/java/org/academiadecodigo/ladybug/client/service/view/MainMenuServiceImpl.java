package org.academiadecodigo.ladybug.client.service.view;

import org.academiadecodigo.ladybug.client.controller.SelectDayController;
import org.academiadecodigo.ladybug.client.view.MainMenuView;
import org.academiadecodigo.ladybug.client.view.SelectDayView;

public class MainMenuServiceImpl implements MainMenuService {

    private MainMenuView mainMenuView;
    private SelectDayView selectDayView;

    public MainMenuServiceImpl(MainMenuView mainMenuView) {
        this.mainMenuView = mainMenuView;
    }

    @Override
    public void execute() {
        mainMenuView.show();

        switch (mainMenuView.getAnswerIndex()){
            case 1:
                new SelectDayController(selectDayView).init();
                break;
            case 2:
                //dispatch new sub view - select a event genre
                //TODO: ricardo, diverte-te
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
}
