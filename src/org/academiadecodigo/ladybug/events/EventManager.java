package org.academiadecodigo.ladybug.events;

import java.util.LinkedList;
import java.util.List;

public class EventManager {

    private List<Event> events;

    public EventManager() {
        events = new LinkedList<>();
    }

    /**
     * Add a new event
     * @param eventType type of event
     */
    public void addEvent(EventType eventType){}

    public Event getEvent(Event event){ return null; }
}
