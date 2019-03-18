package com.itacademy.bobkevich.jdbc.dao;

import com.itacademy.bobkevich.jdbc.entity.Resource;
import com.itacademy.bobkevich.jdbc.util.Connectionmanager;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ResourceDao {

    private static final ResourceDao RESOURCE_DAO = new ResourceDao();
    private static final String FIND_ONE = "SELECT * FROM cloud_storage.resource WHERE id=?";

    @SneakyThrows
    public Optional<Resource> findOne(Integer id) {
        try (Connection connection = Connectionmanager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_ONE)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Resource.builder()
                        .id(resultSet.getInt("id"))
                        .resourceName(resultSet.getString("resource_name"))
                        .
                        .build();
            }
        }
    }

    public static ResourceDao getResourceDao() {
        return RESOURCE_DAO;
    }
}
