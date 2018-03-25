package org.academiadecodigo.ladybug.client.service.view;

import org.academiadecodigo.ladybug.client.model.UserHandler;
import org.academiadecodigo.ladybug.client.view.SelectDayView;

public interface MainMenuService {

    void execute();
    void setSelectDayView(SelectDayView selectDayView);
    UserHandler getUserHandler();
    void setUserHandler(UserHandler userHandler);
}
