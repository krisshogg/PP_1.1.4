package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    //private static final String DRIVER = "org.h2.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/users_pp";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    /*public static Connection getConnection() {
        Connection connection = null;
        try{
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Соединение установлено!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("ОШИБКА: Соединение НЕ установлено!");
        }
        return connection;
    }
    public static Connection getConnection() {
        Connection connection = null;
        try {
            //Driver driver = new com.mysql.cj.jdbc.Driver();
            //DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Соединение с БД установлено");
            }
            //connection.close();
        } catch (SQLException e) {
            System.out.println("Соединение с БД не установлено");
        }
        return connection;
    }*/

    private static Connection connection;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Соединение с БД установлено");
            }
        } catch (SQLException e) {
            System.out.println("Соединение с БД не установлено");
        }
        return connection;
    }
}
