package com.itacademy.bobkevich.jdbc.dao;

import com.itacademy.bobkevich.jdbc.entity.Category;
import com.itacademy.bobkevich.jdbc.entity.Person;
import com.itacademy.bobkevich.jdbc.entity.Resource;
import com.itacademy.bobkevich.jdbc.entity.TypeFile;
import com.itacademy.bobkevich.jdbc.util.Connectionmanager;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ResourceDao {

    private static final ResourceDao RESOURCE_DAO = new ResourceDao();
    private static final String FIND_ONE =
            "SELECT " +
                    "r.id AS resource_id, " +
                    "r.resource_name AS resource_name, " +
                    "r.type_id AS type_id, " +
                    "r.caterory_id AS category_id, " +
                    "r.login_who_giving AS login_who_giving, " +
                    "r.url AS url, " +
                    "r.file_size AS file_size, " +
                    "t.id AS type_file_id, " +
                    "t.name_of_type AS type_file_name, " +
                    "c.id AS category_id, " +
                    "c.category_name AS category_name, " +
                    "p.login AS person_login " +
                    "FROM cloud_storage.resource r " +
                    "LEFT JOIN cloud_storage.type_file t " +
                    "ON r.type_id=t.id " +
                    "LEFT JOIN cloud_storage.category c " +
                    "ON r.caterory_id=c.id " +
                    "LEFT JOIN cloud_storage.person p " +
                    "ON r.login_who_giving=p.login " +
                    "WHERE r.id=?";
    private static final String DELETE = "DELETE FROM cloud_storage.resource WHERE id=?";
    private static final String SAVE = "INSERT INTO cloud_storage.resource (resource_name, type_id, caterory_id, login_who_giving, url, file_size) VALUES (?,?,?,?,?,?);";
    private static final String UPDATE = "UPDATE cloud_storage.resource SET resource_name=?, type_id=?, caterory_id=?, login_who_giving=?, url=?,file_size=? WHERE id=?";

    @SneakyThrows
    public Resource save(Resource resource) {
        try (Connection connection = Connectionmanager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(SAVE, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, resource.getResourceName());
            preparedStatement.setObject(2, Optional.ofNullable(resource.getTypeFile()).map(TypeFile::getId).orElse(null));
            preparedStatement.setObject(3, Optional.ofNullable(resource.getCategory()).map(Category::getId).orElse(null));
            preparedStatement.setObject(4, Optional.ofNullable(resource.getPerson()).map(Person::getLogin).orElse(null));
            preparedStatement.setObject(5, resource.getUrl());
            preparedStatement.setObject(6, resource.getSize());

            preparedStatement.executeUpdate();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                resource.setId(generatedKeys.getInt(1));
            }
        }
        return resource;
    }

    @SneakyThrows
    public Resource update(Resource resource){
        try (Connection connection = Connectionmanager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
            preparedStatement.setString(1, resource.getResourceName());
            preparedStatement.setObject(2, Optional.ofNullable(resource.getTypeFile()).map(TypeFile::getId).orElse(null));
            preparedStatement.setObject(3, Optional.ofNullable(resource.getCategory()).map(Category::getId).orElse(null));
            preparedStatement.setObject(4, Optional.ofNullable(resource.getPerson()).map(Person::getLogin).orElse(null));
            preparedStatement.setObject(5, resource.getUrl());
            preparedStatement.setObject(6, resource.getSize());
            preparedStatement.setObject(7,resource.getId());

            preparedStatement.executeUpdate();
        }
        return resource;
    }

    @SneakyThrows
    public Optional<Resource> findOne(Integer id) {
        Resource resource = null;
        try (Connection connection = Connectionmanager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_ONE)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                resource = Resource.builder()
                        .id(resultSet.getInt("resource_id"))
                        .resourceName(resultSet.getString("resource_name"))
                        .typeFile(TypeFile.builder()
                                .id(resultSet.getInt("type_id"))
                                .name(resultSet.getString("type_file_name"))
                                .build())
                        .category(Category.builder()
                                .id(resultSet.getInt("category_id"))
                                .name(resultSet.getString("category_name"))
                                .build())
                        .person(Person.builder()
                                .login(resultSet.getString("person_login"))
                                .build())
                        .url(resultSet.getString("url"))
                        .size(resultSet.getInt("file_size"))
                        .build();
            }
        }
        return Optional.ofNullable(resource);
    }

    @SneakyThrows
    public boolean delete(Integer id) {
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

    public static ResourceDao getResourceDao() {
        return RESOURCE_DAO;
    }
}
