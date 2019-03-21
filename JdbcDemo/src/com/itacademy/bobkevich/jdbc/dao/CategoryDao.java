package com.itacademy.bobkevich.jdbc.dao;

import com.itacademy.bobkevich.jdbc.entity.Category;
import com.itacademy.bobkevich.jdbc.util.Connectionmanager;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Optional;

public class CategoryDao {

    private static final CategoryDao CATEGORY_DAO = new CategoryDao();
    private static final String FIND_ONE =
            "SELECT " +
                    "c.id AS category_id, " +
                    "c.category_name AS category_name " +
                    "FROM cloud_storage.category c " +
                    "WHERE c.id=?";
    private static final String DELETE = "DELETE FROM cloud_storage.category WHERE id=?";
    private static final String SAVE = "INSERT INTO cloud_storage.category  (category_name) VALUES (?);";
    private static final String UPDATE = "UPDATE cloud_storage.category SET category_name=? WHERE id=?";

    @SneakyThrows
    public Category categorySave(Category category) {
        try (Connection connection = Connectionmanager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(SAVE, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setObject(1, category.getName());

            preparedStatement.executeUpdate();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                category.setId(generatedKeys.getInt(1));
            }
        }
        return category;
    }

    @SneakyThrows
    public Category categoryUpdate(Category category) {
        try (Connection connection = Connectionmanager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
            preparedStatement.setObject(1, category.getName());
            preparedStatement.setObject(2,category.getId());

            preparedStatement.executeUpdate();
        }
        return category;
    }

    @SneakyThrows
    public Optional<Category> categoryFindOne(Integer id) {
        Category category = null;
        try (Connection connection = Connectionmanager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_ONE)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                category = Category.builder()
                        .id(resultSet.getInt("category_id"))
                        .name(resultSet.getString("category_name"))
                        .build();
            }
        }
        return Optional.ofNullable(category);
    }

    @SneakyThrows
    public boolean categoryDelite(Integer id) {
        boolean result = false;
        try (Connection connection = Connectionmanager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE)) {
            preparedStatement.setInt(1, id);

            if (preparedStatement.executeUpdate() == 1) {
                result = true;
            }
        }
        return result;
    }

    public static CategoryDao getCategoryDao() {
        return CATEGORY_DAO;
    }
}
