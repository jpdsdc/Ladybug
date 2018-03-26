package org.academiadecodigo.ladybug.client.model.events;

import org.academiadecodigo.ladybug.client.view.SelectDayView;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class EventManager {

    private List<Event> events;

    public EventManager() {
        events = new LinkedList<>();
    }

    public void addEvent(EventType eventType) {
        events.add(EventFactory.createEvent(eventType));
    }

    public Event getEvent(Event event) {
        return null;
    }

    // returns events based on the day of the week they're taking place
    Calendar calendar = Calendar.getInstance();
    Date today = new Date();
    SelectDayView selectDayView = new SelectDayView();

    public void getWeekdayofEvent(int month, int day) {
        switch (month) {
            case 1:
                break;
            case 2:
                day += JANUARY;
                break;
            case 3:
                day += JANUARY + FEBRUARY;
                break;
            case 4:
                day += JANUARY + FEBRUARY + MARCH;
                break;
            case 5:
                day += JANUARY + FEBRUARY + MARCH + APRIL;
                break;
            case 6:
                day += JANUARY + FEBRUARY + MARCH + APRIL + MAY;
                break;
            case 7:
                day += JANUARY + FEBRUARY + MARCH + APRIL + MAY + JUNE;
                break;
            case 8:
                day += JANUARY + FEBRUARY + MARCH + APRIL + MAY + JUNE + JULY;
                break;
            case 9:
                day += JANUARY + FEBRUARY + MARCH + APRIL + MAY + JUNE + JULY + AUGUST;
                break;
            case 10:
                day += JANUARY + FEBRUARY + MARCH + APRIL + MAY + JUNE + JULY + AUGUST + SEPTEMBER;
                break;
            case 11:
                day += JANUARY + FEBRUARY + MARCH + APRIL + MAY + JUNE + JULY + AUGUST + SEPTEMBER + OCTOBER;
                break;
            case 12:
                day += JANUARY + FEBRUARY + MARCH + APRIL + MAY + JUNE + JULY + AUGUST + SEPTEMBER + OCTOBER + NOVEMBER;
                break;
        }
        calendar.set(Calendar.YEAR, 2018);
        calendar.set(Calendar.DAY_OF_YEAR, day);
        String weekday = selectDayView.setWeekdays(calendar.get(Calendar.DAY_OF_WEEK));
    }

    private final int JANUARY = 31;
    private final int FEBRUARY = 28;
    private final int MARCH = 31;
    private final int APRIL = 30;
    private final int MAY = 31;
    private final int JUNE = 30;
    private final int JULY = 31;
    private final int AUGUST = 31;
    private final int SEPTEMBER = 30;
    private final int OCTOBER = 31;
    private final int NOVEMBER = 30;
    private final int DECEMBER = 31;
}
