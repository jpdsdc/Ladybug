package org.academiadecodigo.ladybug.client.model.events;

import java.util.Arrays;
import java.util.Date;

public class Event {

    private EventType eventType;
    private String name;
    private String description;
    private Location[] locations;
    private Date date;
    private double price;


    public Event(EventType eventType, String name, String description, Location[] locations, Date date, double price) {
        this.eventType = eventType;
        this.name = name;
        this.description = description;
        this.locations = locations;
        this.date = date;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventType=" + eventType +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", locations=" + Arrays.toString(locations) +
                ", date=" + date +
                ", price=" + price +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //TODO: Buy event
}
