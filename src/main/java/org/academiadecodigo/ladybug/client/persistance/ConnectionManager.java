package org.academiadecodigo.ladybug.client.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private Connection connection = null;

    public Connection getConnection(){
        String dbURL = "jdbc:mysql://localhost:3306/ladybug";

        try {
            return connection == null ? DriverManager.getConnection(dbURL, "root", "root") : connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public void close(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
