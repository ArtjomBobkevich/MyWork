package com.itacademy.bobkevich.jdbc.dao;

import com.itacademy.bobkevich.jdbc.entity.Category;
import com.itacademy.bobkevich.jdbc.entity.Comment;
import com.itacademy.bobkevich.jdbc.entity.Person;
import com.itacademy.bobkevich.jdbc.entity.Resource;
import com.itacademy.bobkevich.jdbc.entity.TypeFile;
import com.itacademy.bobkevich.jdbc.util.Connectionmanager;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Optional;

public class CommentDao {

    private static final CommentDao COMMENT_DAO = new CommentDao();
    private static final String FIND_ONE =
            "SELECT " +
                    "c.id AS comment_id, " +
                    "c.resource_id AS resource_id, " +
                    "c.text AS text, " +
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
                    "FROM cloud_storage.comment c " +
                    "LEFT JOIN cloud_storage.resource r " +
                    "ON c.resource_id=r.id " +                  /*возможно нужно местами переставить*/
                    "LEFT JOIN cloud_storage.type_file t " +
                    "ON r.type_id=t.id " +
                    "LEFT JOIN cloud_storage.category cat " +
                    "ON r.caterory_id=cat.id " +
                    "LEFT JOIN cloud_storage.person p " +
                    "ON r.login_who_giving=p.login " +
                    "WHERE c.id=?";
    private static final String DELETE = "DELETE FROM cloud_storage.comment WHERE id=?";
    private static final String SAVE = "INSERT INTO cloud_storage.comment  (resource_id, text) VALUES (?,?);";
    private static final String UPDATE = "UPDATE cloud_storage.comment SET resource_id=?, text=? WHERE id=?";

    @SneakyThrows
    public Comment commentSave(Comment comment) {
        try (Connection connection = Connectionmanager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(SAVE, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setObject(1, Optional.ofNullable(comment.getResource_id()).map(Resource::getId).orElse(null));
            preparedStatement.setObject(2,comment.getText());

            preparedStatement.executeUpdate();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                comment.setId(generatedKeys.getInt(1));
            }
        }
        return comment;
    }

    @SneakyThrows
    public Comment commentUpdate(Comment comment) {
        try (Connection connection = Connectionmanager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
            preparedStatement.setObject(1, Optional.ofNullable(comment.getResource_id()).map(Resource::getId).orElse(null));
            preparedStatement.setObject(2, comment.getText());
            preparedStatement.setObject(3,comment.getId());

            preparedStatement.executeUpdate();
        }
        return comment;
    }

    @SneakyThrows
    public Optional<Comment> commentFindOne(Integer id) {
        Comment comment = null;
        try (Connection connection = Connectionmanager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_ONE)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                comment = Comment.builder()
                        .id(resultSet.getInt("comment_id"))
                        .resource_id(Resource.builder()
                                .id(resultSet.getInt("id"))
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
                                .build())
                        .text(resultSet.getString("text"))
                        .build();
            }
        }
        return Optional.ofNullable(comment);
    }

    @SneakyThrows
    public boolean commentDelite(Integer id) {
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

    public static CommentDao getCommentDao() {
        return COMMENT_DAO;
    }
}
