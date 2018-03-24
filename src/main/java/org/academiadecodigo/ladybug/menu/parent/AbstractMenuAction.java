package org.academiadecodigo.ladybug.menu.parent;

import org.academiadecodigo.ladybug.model.UserManager;

public abstract class AbstractMenuAction implements MenuAction {


    protected UserManager userManager;

    public AbstractMenuAction(UserManager userManager){
        this.userManager = userManager;
    }
}
