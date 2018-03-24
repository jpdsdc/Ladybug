package org.academiadecodigo.ladybug.client.view;

import org.academiadecodigo.bootcamp.Prompt;

public abstract class AbstractView implements View{

    protected Prompt prompt;

    public AbstractView(Prompt prompt) {
        this.prompt = prompt;
    }


}
