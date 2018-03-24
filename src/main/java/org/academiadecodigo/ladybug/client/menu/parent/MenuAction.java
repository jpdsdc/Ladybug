package org.academiadecodigo.ladybug.client.menu.parent;

import org.academiadecodigo.bootcamp.Prompt;

public interface MenuAction {

    /**
     * Execute an action
     * @param prompt menu prompt
     */
    void execute(Prompt prompt);
}
