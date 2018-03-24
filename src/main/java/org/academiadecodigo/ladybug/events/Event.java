package org.academiadecodigo.ladybug.events;

import java.util.Arrays;
import java.util.Calendar;

public class Event {

    private EventType eventType;
    private String name;
    private String description;
    private Location locations;
    private int day;
    private int month;
    private String[] sessions;
    private double price;

    public Event(EventType eventType, String name, String description, Location locations, int day, int month,
                 String[] sessions, double price) {
        this.eventType = eventType;
        this.name = name;
        this.description = description;
        this.locations = locations;
        this.day = day;
        this.month = month;
        this.sessions = sessions;
        this.price = price;
    }

    @Override
    public String toString() {
        return "" +
                "" + eventType +
                ": \'" + name + '\'' +
                "\n\'" + description + '\'' +
                "\nLocation: " + locations +
                "\nDate: " + day + "/" + month +
                "\nAvailable Sessions: " + Arrays.toString(sessions) +
                "\n$" + price;
    }

    //TODO: Buy event
}
