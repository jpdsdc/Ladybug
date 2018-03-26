package org.academiadecodigo.ladybug.client.controller;

import org.academiadecodigo.ladybug.client.view.GenreView;
import org.academiadecodigo.ladybug.client.view.View;

public class EventGenreController extends AbstractController{


	public EventGenreController(View view) {
		super(view);
	}

	@Override
	public void init() {
		view.show();
	}


}
