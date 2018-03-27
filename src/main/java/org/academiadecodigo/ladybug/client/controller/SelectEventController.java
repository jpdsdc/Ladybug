package org.academiadecodigo.ladybug.client.controller;

import org.academiadecodigo.ladybug.client.model.events.Event;
import org.academiadecodigo.ladybug.client.model.events.EventManager;
import org.academiadecodigo.ladybug.client.view.SelectEventView;
import org.academiadecodigo.ladybug.client.view.View;

import java.util.Collections;
import java.util.List;

public class SelectEventController extends AbstractController{

    private EventManager eventManager;

    public SelectEventController(View view) {
        super(view);
        this.eventManager = new EventManager();
    }

    @Override
    public void init() {
        view.show();

        SelectEventView selectEventView = (SelectEventView) view;

        for(Event e : eventManager.getEvents()){
            if(selectEventView.getSelected() == null){
                continue;
            }
            
            if(selectEventView.getSelected().contains(e.getName())){
                System.out.println(e.getName());
            }
        }
    }

    public List<Event> getEvents() {
        return eventManager.getEvents();
    }
}
