package org.academiadecodigo.ladybug.menu;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.ladybug.model.UserManager;
import org.academiadecodigo.ladybug.model.events.EventManager;
import org.academiadecodigo.ladybug.menu.actions.LoginAction;
import org.academiadecodigo.ladybug.menu.actions.RegisterAction;
import org.academiadecodigo.ladybug.menu.parent.Menu;
import org.academiadecodigo.ladybug.menu.parent.MenuAction;


public class MainMenu extends Menu {

    private UserManager userManager;
    private EventManager eventManager;

    public MainMenu(Prompt prompt) {
        super(prompt, "", new String[]{"Login", "Register", "Exit"});
        userManager = new UserManager();
        eventManager = new EventManager();


        System.out.println("\n" +
                " __          ___       _______  ____    ____    .______    __    __    _______ \n" +
                "|  |        /   \\     |       \\ \\   \\  /   /    |   _  \\  |  |  |  |  /  _____|\n" +
                "|  |       /  ^  \\    |  .--.  | \\   \\/   /     |  |_)  | |  |  |  | |  |  __  \n" +
                "|  |      /  /_\\  \\   |  |  |  |  \\_    _/      |   _  <  |  |  |  | |  | |_ | \n" +
                "|  `----./  _____  \\  |  '--'  |    |  |        |  |_)  | |  `--'  | |  |__| | \n" +
                "|_______/__/     \\__\\ |_______/     |__|        |______/   \\______/   \\______| \n" +
                "                                                                               \n");

        createAction(1, new LoginAction(userManager));
        createAction(2, new RegisterAction(userManager));

        createAction(3, new MenuAction() {
            @Override
            public void execute(Prompt prompt) {
                System.exit(0);
            }
        });
    }
}
