package org.academiadecodigo.ladybug.client.model.events;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class EventManager {

    private List<Event> events;

    public EventManager() {
        events = new ArrayList<>();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");

        try {
            addEvent(EventType.MOVIE, "Avengers - Infinity War",
                    "super heroes movie",
                    new Location[]{Location.LISBOA}, formatter.parse("7-Jun-2019"), 10);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void addEvent(EventType type, String name, String description,
                         Location[] locations, Date date, double price){
        events.add(new Event(type, name, description, locations, date, price));
    }

    public Event findByDate(Date date){
        Event found = null;

        for(Event e : events){
            if(e.getDate().compareTo(new Date()) == 0){
                found = e;
            }
        }
        return found;
    }

    public List<Event> getEvents() {
        return events;
    }
}
