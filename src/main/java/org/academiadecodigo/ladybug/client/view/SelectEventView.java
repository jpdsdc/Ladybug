package org.academiadecodigo.ladybug.client.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.ladybug.client.controller.SelectEventController;
import org.academiadecodigo.ladybug.client.model.events.Event;
import org.academiadecodigo.ladybug.client.model.events.EventManager;

import java.util.List;


public class SelectEventView extends AbstractView {

	private String[] options;
	private int selected;

	public SelectEventView(Prompt prompt) {
		super(prompt);
		options = getAllEvents();
	}

	@Override
	public void show() {
		MenuInputScanner menuInputScanner = new MenuInputScanner(options);
		menuInputScanner.setMessage("Select a event: ");

		selected = prompt.getUserInput(menuInputScanner);
	}

	private String[] getAllEvents(){
	    EventManager eventManager = new EventManager();
        String[] names = new String[eventManager.getEvents().size()];

        int i = 0;
        for(Event stock : eventManager.getEvents()){
            names[i] += stock.getName();
            i++;
        }

        return names;
    }

	public String getSelected() {
		return options[selected - 1];
	}

}
