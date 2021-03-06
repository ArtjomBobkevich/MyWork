package com.itacademy.bobkevich.jdbc.util;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import java.sql.Connection;
import java.sql.DriverManager;

@UtilityClass
public class Connectionmanager {

    private static final String URL_KEY = "db.url";
    private static final String USERNAME_KEY = "db.user";
    private static final String PASSWORD_KEY = "db.password";

    @SneakyThrows
    public static Connection get() {
        return DriverManager.getConnection(Propertiesmanager.get(URL_KEY),
                Propertiesmanager.get(USERNAME_KEY),
                Propertiesmanager.get(PASSWORD_KEY));
    }
}
