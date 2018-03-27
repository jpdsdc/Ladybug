package org.academiadecodigo.ladybug.client.model.events;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.ladybug.client.view.SelectDayView;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class EventManager {

	private final int JANUARY = 31;
	private final int FEBRUARY = 28 + JANUARY;
	private final int MARCH = 31 + FEBRUARY;
	private final int APRIL = 30 + MARCH;
	private final int MAY = 31 + APRIL;
	private final int JUNE = 30 + MAY;
	private final int JULY = 31 + JUNE;
	private final int AUGUST = 31 + JULY;
	private final int SEPTEMBER = 30 + AUGUST;
	private final int OCTOBER = 31 + SEPTEMBER;
	private final int NOVEMBER = 30 + OCTOBER;

    private List<Event> events;

    public EventManager() {
        events = new LinkedList<>();
    }

    public void addEvent(EventType eventType){
        events.add(EventFactory.createEvent(eventType));
    }

    public Event getEvent(Event event){ return null; }
    // returns events based on the day of the week they're taking place
	Calendar calendar = Calendar.getInstance();
	Date today = new Date();
	Prompt prompt;
	private SelectDayView selectDayView = new SelectDayView(prompt);

	public void getWeekdayofEvent(int month, int day) {
		switch (month) {
			case 1:
				break;
			case 2:
				day += JANUARY;
				break;
			case 3:
				day += FEBRUARY;
				break;
			case 4:
				day += MARCH;
				break;
			case 5:
				day += APRIL;
				break;
			case 6:
				day += MAY;
				break;
			case 7:
				day += JUNE;
				break;
			case 8:
				day += JULY;
				break;
			case 9:
				day += AUGUST;
				break;
			case 10:
				day += SEPTEMBER;
				break;
			case 11:
				day += OCTOBER;
				break;
			case 12:
				day += NOVEMBER;
				break;
		}

		calendar.set(Calendar.YEAR, 2018);
		calendar.set(Calendar.DAY_OF_YEAR, day);

		String weekday = selectDayView.setWeekdays(calendar.get(Calendar.DAY_OF_WEEK));
	}

	public void setPrompt(Prompt prompt) {
		this.prompt = prompt;
	}
}
