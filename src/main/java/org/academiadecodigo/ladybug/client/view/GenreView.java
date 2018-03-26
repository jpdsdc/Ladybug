package org.academiadecodigo.ladybug.client.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.ladybug.client.model.events.EventType;
import org.academiadecodigo.ladybug.utils.Messages;

public class GenreView extends AbstractView{

	private String[] options;
	int selected;

	public GenreView(Prompt prompt) {
		super(prompt);
		options = new String[]{EventType.MOVIE.toString(), EventType.MUSIC.toString(), EventType.THEATRE.toString()};
	}

	@Override
	public void show() {
		MenuInputScanner menuInputScanner = new MenuInputScanner(options);
		menuInputScanner.setMessage(Messages.SELECTGENRE + "");

		selected = prompt.getUserInput(menuInputScanner);
	}

	public String getSelected(){
		return options[selected - 1];
	}
}
