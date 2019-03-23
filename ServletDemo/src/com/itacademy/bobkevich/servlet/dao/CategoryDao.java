package com.itacademy.bobkevich.servlet.dao;

import com.itacademy.bobkevich.servlet.entity.Category;
import com.itacademy.bobkevich.servlet.entity.Comment;
import com.itacademy.bobkevich.servlet.entity.Person;
import com.itacademy.bobkevich.servlet.entity.Resource;
import com.itacademy.bobkevich.servlet.entity.TypeFile;
import com.itacademy.bobkevich.servlet.util.Connectionmanager;
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
    private static final String GET_BY_ID = "SELECT " +
            "cat.id AS id, " +
            "cat.category_name AS category_name, " +
            "r.id AS resource_id, " +
            "r.resource_name AS resource_name, " +
            "r.type_id AS type_id, " +
            "r.login_who_giving AS login_who_giving, " +
            "r.url AS url, " +
            "r.file_size AS file_size, " +
            "t.id AS type_id, " +
            "t.name_of_type AS type_file_name, " +
            "p.login AS person_login " +
            "FROM cloud_storage.category cat " +
            "JOIN cloud_storage.resource r " +
            "ON r.caterory_id=cat.id " +
            "LEFT JOIN cloud_storage.type_file t " +
            "ON r.type_id=t.id " +
            "LEFT JOIN cloud_storage.person p " +
            "ON r.login_who_giving=p.login " +
            "WHERE cat.id=?";

    @SneakyThrows
    public Optional<Category> findAllResourcesAboutThisCategory(Integer id) {
        Category category = null;
        try (Connection connection = Connectionmanager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_ID)) {
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                if (category == null) {
                    category=Category.builder()
                            .id(resultSet.getInt("id"))
                            .name(resultSet.getString("category_name"))
                            .build();
                }
                category.getResources().add(Resource.builder()
                        .id(resultSet.getInt("resource_id"))
                        .resourceName(resultSet.getString("resource_name"))
                        .typeFile(TypeFile.builder()
                                .id(resultSet.getInt("type_id"))
                                .name(resultSet.getString("type_file_name"))
                                .build())
                        .build());

            }
        }
        return Optional.ofNullable(category);
    }

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
