package com.itacademy.bobkevich.servlet.dao;

import com.itacademy.bobkevich.servlet.entity.TypeFile;
import com.itacademy.bobkevich.servlet.util.Connectionmanager;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

public class TypeFileDao {

    private static final TypeFileDao TYPE_FILE_DAO = new TypeFileDao();
    private static final String FIND_ONE =
            "SELECT " +
                    "t.id AS type_file_id, " +
                    "t.name_of_type AS type_file_name " +
                    "FROM cloud_storage.type_file t " +
                    "WHERE t.id=?";
    private static final String DELETE = "DELETE FROM cloud_storage.type_file WHERE id=?";
    private static final String SAVE = "INSERT INTO cloud_storage.type_file (name_of_type) VALUES (?);";
    private static final String UPDATE = "UPDATE cloud_storage.type_file SET name_of_type=? WHERE id=?";

    @SneakyThrows
    public TypeFile save(TypeFile typeFile) {
        try (Connection connection = Connectionmanager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(SAVE, RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, typeFile.getName());

            preparedStatement.executeUpdate();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                typeFile.setId(generatedKeys.getInt(1));
            }
        }
        return typeFile;
    }

    @SneakyThrows
    public TypeFile update(TypeFile typeFile) {
        try (Connection connection = Connectionmanager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
            preparedStatement.setString(1, typeFile.getName());
            preparedStatement.setObject(2, typeFile.getId());

            preparedStatement.executeUpdate();
        }
        return typeFile;
    }

    @SneakyThrows
    public Optional<TypeFile> findOne(Integer id) {
        TypeFile typeFile = null;
        try (Connection connection = Connectionmanager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_ONE)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                typeFile = TypeFile.builder()
                        .id(resultSet.getInt("type_file_id"))
                        .name(resultSet.getString("type_file_name"))
                        .build();
            }
        }
        return Optional.ofNullable(typeFile);
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

    public static TypeFileDao getTypeFileDao() {
        return TYPE_FILE_DAO;
    }
}
