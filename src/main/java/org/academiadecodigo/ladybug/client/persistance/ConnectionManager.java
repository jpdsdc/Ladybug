package org.academiadecodigo.ladybug.client.persistance;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private Connection connection = null;

    public Connection getConnection(){
        String dbURL = "jdbc:mysql://localhost:3306/ladybug?user=root&password=root&useUnicode=true&characterEncoding=UTF-8";
        try {
            if(connection == null){
               connection = DriverManager.getConnection(dbURL);
            }
        } catch (SQLException e) {
            System.err.println("Could not connect, cause: " + e.getMessage());
        }

        return connection;
    }

    public void close(){
        try {
            connection.close();
        } catch (SQLException e) {
            System.err.println("Could not close connection, cause: " + e.getMessage());
        }
    }
}
