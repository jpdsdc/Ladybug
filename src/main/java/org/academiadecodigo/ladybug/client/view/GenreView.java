package org.academiadecodigo.ladybug.client.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.ladybug.client.model.events.EventType;
import org.academiadecodigo.ladybug.utils.Messages;

public class GenreView extends AbstractView {

	private String[] options;
	private int selected;
	private SelectDayView selectDayView;

	public GenreView(Prompt prompt) {
		super(prompt);
		options = new String[]{"Movie", "Concert", "Theater"};

	}

	@Override
	public void show() {
		MenuInputScanner menuInputScanner = new MenuInputScanner(options);
		menuInputScanner.setMessage(Messages.SELECTGENRE + "");

		selected = prompt.getUserInput(menuInputScanner);

		selectDayView.show();
	}

	public String getSelected() {
		return options[selected - 1];
	}

	public void setSelectDayView(SelectDayView selectDayView) {
		this.selectDayView = selectDayView;
	}
}
