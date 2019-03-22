package com.itacademy.bobkevich.servlet.util;

import lombok.experimental.UtilityClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

@UtilityClass
public class Propertiesmanager {

    private static Properties properties = new Properties();


    static {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("resources", "application.properties"))) {
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
