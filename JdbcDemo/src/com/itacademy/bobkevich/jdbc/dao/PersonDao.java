package com.itacademy.bobkevich.jdbc.dao;

import com.itacademy.bobkevich.jdbc.entity.Person;
import com.itacademy.bobkevich.jdbc.entity.PersonRole;
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
public class PersonDao {

    private static final PersonDao PERSON_DAO=new PersonDao();
    private static final String SAVE ="INSERT INTO cloud_storage.person (login, first_name, last_name, age, mail, password, role)  VALUES (?,?,?,?,?,?,?);";

    @SneakyThrows
    public Person save (Person entity) {
        try (Connection connection = Connectionmanager.get();
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

    public static PersonDao getPersonDao() {
        return PERSON_DAO;
    }
}
