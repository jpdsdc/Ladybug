package org.academiadecodigo.ladybug.menu;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.ladybug.menu.parent.Menu;

public class MainMenu extends Menu {

    public MainMenu(Prompt prompt) {
        super(prompt, "", new String[]{"Login", "Register", "Exit"});
    }

    @Override
    public void execute() {
        System.out.println("\n" +
                " __          ___       _______  ____    ____    .______    __    __    _______ \n" +
                "|  |        /   \\     |       \\ \\   \\  /   /    |   _  \\  |  |  |  |  /  _____|\n" +
                "|  |       /  ^  \\    |  .--.  | \\   \\/   /     |  |_)  | |  |  |  | |  |  __  \n" +
                "|  |      /  /_\\  \\   |  |  |  |  \\_    _/      |   _  <  |  |  |  | |  | |_ | \n" +
                "|  `----./  _____  \\  |  '--'  |    |  |        |  |_)  | |  `--'  | |  |__| | \n" +
                "|_______/__/     \\__\\ |_______/     |__|        |______/   \\______/   \\______| \n" +
                "                                                                               \n");

        if(currentOption("Login")){
            askLogin();
        }else if(currentOption("Register")){
            askRegister();
            System.out.println("Register");
        }else if(currentOption("Exit")){
            System.exit(0);
        }
    }


    private void askLogin(){
        StringInputScanner usernameScanner = new StringInputScanner();
        usernameScanner.setMessage("What's your username? ");

        StringInputScanner passwordScanner = new StringInputScanner();
        passwordScanner.setMessage("What's your password? ");

        String username = getPrompt().getUserInput(usernameScanner);
        String password = getPrompt().getUserInput(passwordScanner);

        //TODO: login user logic, UserManager.tryLogin(username, password)?
    }

    private void askRegister(){
        StringInputScanner usernameScanner = new StringInputScanner();
        usernameScanner.setMessage("What's your username? ");

        StringInputScanner passwordScanner = new StringInputScanner();
        passwordScanner.setMessage("What's your password? ");

        String username = getPrompt().getUserInput(usernameScanner);
        String password = getPrompt().getUserInput(passwordScanner);

        //TODO: login register logic, UserManager.register(username, password)?
    }
}
