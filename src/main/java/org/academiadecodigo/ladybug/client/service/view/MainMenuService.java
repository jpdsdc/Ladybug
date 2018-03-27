package org.academiadecodigo.ladybug.client.service.view;

import org.academiadecodigo.ladybug.client.model.UserHandler;
import org.academiadecodigo.ladybug.client.view.GenreView;
import org.academiadecodigo.ladybug.client.view.SelectEventView;

public interface MainMenuService {

    void execute();
    void setSelectEventView(SelectEventView selectEventView);
    UserHandler getUserHandler();
    void setUserHandler(UserHandler userHandler);
    void setGenreView(GenreView genreView);
}
