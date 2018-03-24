package org.academiadecodigo.ladybug.client.menu.parent;

import org.academiadecodigo.ladybug.client.model.UserManager;

public abstract class AbstractMenuAction implements MenuAction {


    protected UserManager userManager;

    public AbstractMenuAction(UserManager userManager){
        this.userManager = userManager;
    }
}
