package org.academiadecodigo.ladybug.client.service.view;

import org.academiadecodigo.ladybug.client.view.MainMenuView;

public class MainMenuServiceImpl implements MainMenuService {

    private MainMenuView mainMenuView;

    public MainMenuServiceImpl(MainMenuView mainMenuView) {
        this.mainMenuView = mainMenuView;
    }

    @Override
    public void execute() {
        mainMenuView.show();

        switch (mainMenuView.getAnswerIndex()){
            case 0:
                break;
            case 1:
                //dispatch new sub view - select a event genre
                break;
            case 2:
                System.exit(0);
                break;
        }
    }
}
