package com.itacademy.bobkevich.jdbc.dao;

import com.itacademy.bobkevich.jdbc.entity.Genre;
import com.itacademy.bobkevich.jdbc.entity.PersonRole;
import com.itacademy.bobkevich.jdbc.entity.Resource;
import com.itacademy.bobkevich.jdbc.util.Connectionmanager;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Optional;

public class GenreDao {

    private static final GenreDao GENRE_DAO = new GenreDao();
    private static final String SAVE = "INSERT INTO cloud_storage.genre (name_of_genre) VALUES (?)";
    private static final String GET_BY_ID = "SELECT " +
            "g.id AS genre_id," +
            "g.name_of_genre AS genre_name," +
            "r.id AS resource_id, " +
            "r.resource_name AS resource_name, " +
            "r.type_id AS type_id, " +
            "r.caterory_id AS category_id, " +
            "r.login_who_giving AS login_who_giving, " +
            "r.url AS url, " +
            "r.file_size AS file_size " +
            "FROM cloud_storage.genre g " +
            "JOIN cloud_storage.resource_genre rg " +
            "ON rg.genre_id=g.id " +
            "JOIN cloud_storage.resource r " +
            "ON r.id=rg.resources_id " +
            "WHERE g.id=?";

    @SneakyThrows
    public Optional<Genre> findOne (Integer id) {
        Genre genre=null;
        try (Connection connection=Connectionmanager.get();
        PreparedStatement preparedStatement=connection.prepareStatement(GET_BY_ID)){
            preparedStatement.setInt(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                if (genre==null){
                    genre=Genre.builder()
                            .id(resultSet.getInt("genre_id"))
                            .name(resultSet.getString("genre_name"))
                            .build();
                }
                genre.getResources().add(Resource.builder()
                        .id(resultSet.getInt("resource_id"))
                        .resourceName(resultSet.getString("resource_name"))
                        .build());
            }
        }
        return Optional.ofNullable(genre);
    }

    @SneakyThrows
    public Genre save(Genre genre) {
        try (Connection connection = Connectionmanager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(SAVE, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, genre.getName());

            preparedStatement.executeUpdate();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                genre.setId(generatedKeys.getInt(1));
            }
        }
        return genre;
    }

    public static GenreDao getGenreDao() {
        return GENRE_DAO;
    }
}
