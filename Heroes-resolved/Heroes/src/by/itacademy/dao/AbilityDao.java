package by.itacademy.dao;

import by.itacademy.entity.Ability;
import by.itacademy.connection.ConnectionPool;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1 on 11.03.2018.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class AbilityDao {

    private static final AbilityDao INSTANCE = new AbilityDao();

    private static final String FIND_ALL = "SELECT id, name FROM heroes_storage.ability";

    public List<Ability> findAll() {
        List<Ability> abilities = new ArrayList<>();
        try (Connection connection = ConnectionPool.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(FIND_ALL);
            while (resultSet.next()) {
                Ability ability = Ability.builder()
                        .id(resultSet.getLong("id"))
                        .name(resultSet.getString("name"))
                        .build();
                abilities.add(ability);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return abilities;
    }

    public static AbilityDao getInstance() {
        return INSTANCE;
    }
}
