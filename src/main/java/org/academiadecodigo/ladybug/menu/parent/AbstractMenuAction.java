package org.academiadecodigo.ladybug.menu.parent;

import org.academiadecodigo.ladybug.client.UserManager;

public abstract class AbstractMenuAction implements MenuAction {


    protected UserManager userManager;

    public AbstractMenuAction(UserManager userManager){
        this.userManager = userManager;
    }
}
