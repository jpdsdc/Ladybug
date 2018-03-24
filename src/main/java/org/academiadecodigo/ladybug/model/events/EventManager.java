package org.academiadecodigo.ladybug.model.events;

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
}
