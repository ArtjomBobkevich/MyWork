package com.itacademy.bobkevich.servlet.dao;

import com.itacademy.bobkevich.servlet.connection.ConnectionPool;
import com.itacademy.bobkevich.servlet.entity.Person;
import com.itacademy.bobkevich.servlet.entity.PersonRole;
//import com.itacademy.bobkevich.servlet.util.Connectionmanager;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PersonDao {

    private static final PersonDao PERSON_DAO=new PersonDao();
    private static final String SAVE ="INSERT INTO cloud_storage.person (login, first_name, last_name, age, mail, password, role)  VALUES (?,?,?,?,?,?,?);";
    private static final String FIND_ONE =
            "SELECT " +
                    "p.login AS login, " +
                    "p.first_name AS first_name, " +
                    "p.last_name AS last_name, " +
                    "p.age AS age, " +
                    "p.mail AS mail, " +
                    "p.password AS password, " +
                    "p.role AS role, " +
                    "pr.id AS id, " +
                    "pr.role AS role_name " +
                    "FROM cloud_storage.person p " +
                    "LEFT JOIN cloud_storage.person_role pr " +
                    "ON p.role=pr.id " +
                    "WHERE p.login=?";
    private static final String DELETE = "DELETE FROM cloud_storage.person WHERE login=?";
    private static final String UPDATE = "UPDATE cloud_storage.person SET first_name=?, last_name=?, age=?,mail=?,password=?,role=? WHERE login=?";

    @SneakyThrows
    public Person save (Person entity) {
        try (Connection connection = ConnectionPool.getConnection();
             PreparedStatement preparedStatement=connection.prepareStatement(SAVE, Statement.RETURN_GENERATED_KEYS)){
            preparedStatement.setString(1,entity.getLogin());
            preparedStatement.setString(2,entity.getFirst_name());
            preparedStatement.setString(3,entity.getLast_name());
            preparedStatement.setObject(4,entity.getAge());
            preparedStatement.setString(5,entity.getMail());
            preparedStatement.setString(6,entity.getPassword());
            preparedStatement.setObject(7,Optional.ofNullable(entity.getPersonRole()).map(PersonRole::getId).orElse(null));

            preparedStatement.executeUpdate();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()){
                entity.setLogin(generatedKeys.getString(1));
            }
        }
        return entity;
    }

    @SneakyThrows
    public Person update(Person person){
        try (Connection connection = ConnectionPool.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
            preparedStatement.setString(1,person.getFirst_name());
            preparedStatement.setString(2,person.getLast_name());
            preparedStatement.setObject(3,person.getAge());
            preparedStatement.setString(4,person.getMail());
            preparedStatement.setString(5,person.getPassword());
            preparedStatement.setObject(6,Optional.ofNullable(person.getPersonRole()).map(PersonRole::getId).orElse(null));
            preparedStatement.setObject(7,person.getLogin());

            preparedStatement.executeUpdate();
        }
        return person;
    }

    @SneakyThrows
    public Optional<Person> findOne(String login) {
        Person person = null;
        try (Connection connection = ConnectionPool.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_ONE)) {
            preparedStatement.setString(1, login);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                person=Person.builder()
                        .login(resultSet.getString("login"))
                        .first_name(resultSet.getString("first_name"))
                        .last_name(resultSet.getString("last_name"))
                        .age(resultSet.getLong("age"))
                        .mail(resultSet.getString("mail"))
                        .password(resultSet.getString("password"))
                        .personRole(PersonRole.builder()
                                .id(resultSet.getLong("id"))
                                .nameOfRole(resultSet.getString("role_name"))
                                .build())
                        .build();
            }
        }
        return Optional.ofNullable(person);
    }

    @SneakyThrows
    public Optional<Person> findById (String login){
        Optional<Person> person=Optional.empty();
        try (Connection connection=ConnectionPool.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(FIND_ONE)){
            preparedStatement.setString(1,login);

            ResultSet resultSet=preparedStatement.executeQuery();
            if (resultSet.next()){
                person=Optional.of(getPersonFromResultSet(resultSet));
            }
        }
        return person;
    }

    @SneakyThrows
    private Person getPersonFromResultSet (ResultSet resultSet){
        return Person.builder()
                .login(resultSet.getString("login"))
                .first_name(resultSet.getString("first_name"))
                .last_name(resultSet.getString("last_name"))
                .age(resultSet.getLong("age"))
                .mail(resultSet.getString("mail"))
                .password(resultSet.getString("password"))
                .personRole(PersonRole.builder()
                        .id(resultSet.getLong("id"))
                        .nameOfRole(resultSet.getString("role_name"))
                        .build())
                .build();
    }

    @SneakyThrows
    public boolean delete(String login) {
        boolean result = false;
        try (Connection connection = ConnectionPool.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE)) {
            preparedStatement.setString(1, login);

            if (preparedStatement.executeUpdate() == 1) {
                result = true;
            }
        }

        return result;
    }

    public static PersonDao getPersonDao() {
        return PERSON_DAO;
    }
}