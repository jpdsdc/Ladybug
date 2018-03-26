package org.academiadecodigo.ladybug.client.controller;

import org.academiadecodigo.ladybug.client.model.UserHandler;
import org.academiadecodigo.ladybug.client.view.GenreView;
import org.academiadecodigo.ladybug.client.view.View;

public class EventGenreController extends AbstractController{

	private UserHandler userHandler;

	public EventGenreController(View view) {
		super(view);
	}

	@Override
	public void init() {
		view.show();

		GenreView genreView = (GenreView) view;
		userHandler.send(genreView.getSelected());
	}

	public void setUserHandler(UserHandler userHandler) {
		this.userHandler = userHandler;
	}
}
