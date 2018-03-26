package org.academiadecodigo.ladybug.client.model.events;

import java.util.LinkedList;
import java.util.List;

public class EventManager {

    private List<Event> events;

    public EventManager() {
        events = new LinkedList<>();
    }

    public void addEvent(EventType eventType){
        events.add(EventFactory.createEvent(eventType));
    }

    public Event getEvent(Event event){ return null; }

    // returns events based on the day of the week they're taking place
    public void getEventByWeekday(int weekdayOrdinal){

    }
}
