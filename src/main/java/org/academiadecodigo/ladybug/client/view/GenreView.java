package org.academiadecodigo.ladybug.client.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.ladybug.utils.Messages;

public class GenreView extends AbstractView {

	private String[] options;
	private int selected;
	private SelectEventView selectEventView;

	public GenreView(Prompt prompt) {
		super(prompt);
		options = new String[]{"Movie", "Concert", "Theater"};

	}

	@Override
	public void show() {
		MenuInputScanner menuInputScanner = new MenuInputScanner(options);
		menuInputScanner.setMessage(Messages.SELECTGENRE + "");

		selected = prompt.getUserInput(menuInputScanner);

		selectEventView.show();
	}

	public String getSelected() {
		return options[selected - 1];
	}

	public void setSelectEventView(SelectEventView selectEventView) {
		this.selectEventView = selectEventView;
	}
}
