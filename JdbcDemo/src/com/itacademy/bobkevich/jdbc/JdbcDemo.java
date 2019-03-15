package com.itacademy.bobkevich.jdbc;

import com.itacademy.bobkevich.jdbc.util.Connectionmanager;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

    private static final String GET_ALL_GENRE ="SELECT * FROM cloud_storage.genre";
    private static final String GET_BY_TYPE_FILE_NAME = "SELECT * FROM cloud_storage.category JOIN cloud_storage.category c ON";

    public static void main(String[] args) throws SQLException {
        loadDriver();
        try (Connection connection=Connectionmanager.get();
             Statement statment=connection.createStatement()) {
            ResultSet resultSet = statment.executeQuery(GET_ALL_GENRE);
            while (resultSet.next()){
                String string2 = resultSet.getString("id");
                String string1 = resultSet.getString("name_of_genre");
                System.out.println(string2+": "+string1);
            }
        }
    }

    @SneakyThrows
    private static void loadDriver() {
            Class.forName("org.postgresql.Driver");
    }
}
