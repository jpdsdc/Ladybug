package org.academiadecodigo.ladybug.client.model;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

/**
 * Created by Catarina Canto on 13/03/2018.
 */
public class UserManager {

    private final String USERS_PATH = "resources/users.data";
    private Map<String, User> users;

    public UserManager() {
        users = Collections.synchronizedMap(new HashMap<>());
    }

    public void login(String username, String password) {
        if (isUser(username, password)) {
            System.out.println("Logged in");
            return;
        }

        System.out.println("Failed to log in!");
    }

    public void register(User user) {
        List<String> lines;
        Path file;

        if(users.containsKey(user.getUsername())){
            System.out.println("User already exists.");
            return;
        }

        lines = Arrays.asList(user.toString());
        file = Paths.get(USERS_PATH);

        users.put(user.getUsername(), user);

        try {
            Files.write(file, lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean isUser(String username, String password) {
        FileReader fileReader;
        BufferedReader bReader;
        String log;

        try {
            fileReader = new FileReader(USERS_PATH);
            bReader = new BufferedReader(fileReader);

            while ((log = bReader.readLine()) != null) {

                if (log.equals(username + ":" + password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }


}
