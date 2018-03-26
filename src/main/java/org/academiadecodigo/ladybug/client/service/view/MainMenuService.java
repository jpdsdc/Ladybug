package org.academiadecodigo.ladybug.client.service.view;

import org.academiadecodigo.ladybug.client.view.GenreView;
import org.academiadecodigo.ladybug.client.view.SelectDayView;

public interface MainMenuService {

    void execute();
    void setSelectDayView(SelectDayView selectDayView);
    void setGenreView(GenreView genreView);
}
