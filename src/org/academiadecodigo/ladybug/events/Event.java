package org.academiadecodigo.ladybug.events;

public class Event {

    private EventType eventType;
    private String name;
    private Location[] locations;
    private String[] sessions;
    private double price;

    public Event(EventType eventType, String name, Location[] locations,
                 String[] sessions, double price) {
        this.eventType = eventType;
        this.name = name;
        this.locations = locations;
        this.sessions = sessions;
        this.price = price;
    }
}
