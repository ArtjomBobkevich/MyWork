package com.itacademy.bobkevich.servlet.dao;

import com.itacademy.bobkevich.servlet.connection.ConnectionPool;
import com.itacademy.bobkevich.servlet.entity.*;
//import com.itacademy.bobkevich.servlet.util.Connectionmanager;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GenreDao {

    private static final GenreDao GENRE_DAO = new GenreDao();
    private static final String FIND_ALL =
            "SELECT " +
                    "g.id AS id, " +
                    "g.name_of_genre AS name " +
                    "FROM cloud_storage.genre g ";
    private static final String FIND_ONE =
            "SELECT " +
                    "g.id AS id, " +
                    "g.name_of_genre AS name " +
                    "FROM cloud_storage.genre g " +
                    "WHERE g.id=?";
    private static final String SAVE = "INSERT INTO cloud_storage.genre (name_of_genre) VALUES (?)";
    private static final String GET_BY_ID = "SELECT " +
            "g.id AS genre_id," +
            "g.name_of_genre AS genre_name," +
            "r.id AS id, " +
            "r.resource_name AS resource_name, " +
            "r.type_id AS type_id, " +
            "r.caterory_id AS category_id, " +
            "r.login_who_giving AS login_who_giving, " +
            "r.url AS url, " +
            "r.file_size AS file_size, " +
            "t.id AS type_file_id, " +
            "t.name_of_type AS type_file_name, " +
            "cat.id AS category_id, " +
            "cat.category_name AS category_name, " +
            "p.login AS person_login " +
            "FROM cloud_storage.genre g " +
            "JOIN cloud_storage.resource_genre rg " +
            "ON rg.genre_id=g.id " +
            "JOIN cloud_storage.resource r " +
            "ON r.id=rg.resources_id " +
            "LEFT JOIN cloud_storage.type_file t " +
            "ON r.type_id=t.id " +
            "LEFT JOIN cloud_storage.category cat " +
            "ON r.caterory_id=cat.id " +
            "LEFT JOIN cloud_storage.person p " +
            "ON r.login_who_giving=p.login " +
            "WHERE g.id=?";
    private static final String DELETE = "DELETE FROM cloud_storage.genre WHERE id=?";
    private static final String UPDATE = "UPDATE cloud_storage.genre SET name_of_genre=? WHERE id(SELECT id FROM cloud_storage.genre)=?";

    @SneakyThrows
    public Optional<Genre> findWhoHaveThisGenre (Long id) {
        Genre genre=null;
        try (Connection connection=ConnectionPool.getConnection();
             PreparedStatement preparedStatement=connection.prepareStatement(GET_BY_ID)){
            preparedStatement.setLong(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                if (genre==null){
                    genre=Genre.builder()
                            .id(resultSet.getLong("genre_id"))
                            .name(resultSet.getString("genre_name"))
                            .build();
                }
                genre.getResources().add(Resource.builder()
                        .id(resultSet.getLong("resource_id"))
                        .resourceName(resultSet.getString("resource_name"))
                        .typeFile(TypeFile.builder()
                                .id(resultSet.getLong("type_file_id"))
                                .name(resultSet.getString("type_file_name"))
                                .build())
                        .category(Category.builder()
                                .id(resultSet.getLong("category_id"))
                                .name(resultSet.getString("category_name"))
                                .build())
                        .person(Person.builder()
                                .login(resultSet.getString("person_login"))
                                .build())
                        .url(resultSet.getString("url"))
                        .size(resultSet.getInt("file_size"))
                        .build());
            }
        }
        return Optional.ofNullable(genre);
    }

    public List<Genre> findAll() {
        List<Genre>genres =new ArrayList<>();
        try (Connection connection=ConnectionPool.getConnection();
        Statement statement=connection.createStatement()){
            ResultSet resultSet=statement.executeQuery(FIND_ALL);
            while (resultSet.next()){
                Genre genre=getGenreFromResultSet(resultSet);
                genres.add(genre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return genres;
    }

    private Genre getGenreFromResultSet (ResultSet resultSet) throws SQLException {
        return Genre.builder()
                .id(resultSet.getLong("id"))
                .name(resultSet.getString("name"))
                .build();
    }

    @SneakyThrows
    public Optional<Genre> findOne(Long id) {
        Optional<Genre>genre=Optional.empty();
        try (Connection connection = ConnectionPool.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_ONE)) {
            preparedStatement.setLong(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                genre = Optional.of(getGenreFromResultSet(resultSet));
            }
        }
        return genre;
    }

    @SneakyThrows
    public Genre save(Genre genre) {
        try (Connection connection = ConnectionPool.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SAVE, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, genre.getName());

            preparedStatement.executeUpdate();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                genre.setId(generatedKeys.getLong(1));
            }
        }
        return genre;
    }

    @SneakyThrows
    public Genre update(Genre genre){
        try (Connection connection = ConnectionPool.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
            preparedStatement.setString(1, genre.getName());
            preparedStatement.setObject(2,genre.getId());

            preparedStatement.executeUpdate();
        }
        return genre;
    }

    @SneakyThrows
    public boolean delete(Integer id) {
        boolean result = false;
        try (Connection connection = ConnectionPool.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE)) {
            preparedStatement.setInt(1, id);

            if (preparedStatement.executeUpdate() == 1) {
                result = true;
            }
        }
        return result;
    }

    public static GenreDao getGenreDao() {
        return GENRE_DAO;
    }
}
