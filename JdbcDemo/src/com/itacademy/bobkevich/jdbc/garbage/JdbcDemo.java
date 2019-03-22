package com.itacademy.bobkevich.jdbc.garbage;

import com.itacademy.bobkevich.jdbc.util.Connectionmanager;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

    private static final String GET_ALL_GENRE = "SELECT * FROM cloud_storage.genre";
    // private static final String GET_BY_TYPE_FILE_NAME = "SELECT r.* FROM cloud_storage.resource r JOIN cloud_storage.category c ON r.caterory_id=c.category_name AND c.id=?";
    private static final String SAVE_RESOURCE = "INSERT INTO cloud_storage.resource (resource_name, type_id, caterory_id, login_who_giving, url, file_size)" +
            " values " +
            "(?," +
            "(SELECT id FROM cloud_storage.type_file WHERE name_of_type=?)," +
            "(SELECT id FROM cloud_storage.category WHERE category_name=?)," +
            "?," +
            "?," +
            "?);";

    @SneakyThrows
    private static void saveResource( String name, String typeId, String  categoryId, String login, String url, Integer size) {
        try (Connection connection = Connectionmanager.get();
            PreparedStatement preparedStatement=connection.prepareStatement(SAVE_RESOURCE)){
               preparedStatement.setString(1,name);
               preparedStatement.setString(2,typeId);
               preparedStatement.setString(3,categoryId);
               preparedStatement.setString(4,login);
               preparedStatement.setString(5,url);
               preparedStatement.setInt(6,size);

               int insertUpdated=preparedStatement.executeUpdate();
            System.out.println(insertUpdated==1);
            }
        }

    public static void main(String[] args) throws SQLException {
        //       prepareStatementTest("Entertainment");
        //       test1();
        saveResource("smeshariki","Film","Entertainment","hunter","www.pirojok.net",354);
    }

//    private static void prepareStatementTest(String categoryName) throws SQLException {
//        try (Connection connection = Connectionmanager.get();
//             PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_TYPE_FILE_NAME)) {
//            preparedStatement.setString(1, categoryName);
//            ResultSet resultSet=preparedStatement.executeQuery();
//            while (resultSet.next()){
//                System.out.println(resultSet.getInt(1)+" " + resultSet.getString(2));
//            }
//        }
//    }

    private static void test1() throws SQLException {
        loadDriver();
        try (Connection connection = Connectionmanager.get();
             Statement statment = connection.createStatement()) {
            ResultSet resultSet = statment.executeQuery(GET_ALL_GENRE);
            while (resultSet.next()) {
                String string2 = resultSet.getString("id");
                String string1 = resultSet.getString("name_of_genre");
                System.out.println(string2 + ": " + string1);
            }
        }
    }

    @SneakyThrows
    private static void loadDriver() {
        Class.forName("org.postgresql.Driver");
    }
}