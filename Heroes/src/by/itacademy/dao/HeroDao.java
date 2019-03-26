package by.itacademy.dao;

import by.itacademy.entity.Ability;
import by.itacademy.entity.Gender;
import by.itacademy.entity.Hero;
import by.itacademy.connection.ConnectionPool;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by 1 on 11.03.2018.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class HeroDao {

    private static final HeroDao INSTANCE = new HeroDao();

    private static final String FIND_ALL =
            "SELECT " +
                    "h.id AS hero_id, " +
                    "a.id AS ability_id, " +
                    "a.name AS ability_name, " +
                    "h.name AS hero_name, " +
                    "h.identity, " +
                    "h.gender, " +
                    "h.age " +
                    "FROM heroes_storage.hero h " +
                    "INNER JOIN heroes_storage.ability a " +
                    "ON h.ability_id = a.id";

    private static final String SAVE =
            "INSERT INTO heroes_storage.hero (name, identity, age, gender, ability_id) " +
            "VALUES (?, ?, ?, ?, ?)";

    private static final String FIND_BY_ID = FIND_ALL + " WHERE h.id = ?";

    public Hero save(Hero hero) {
        try (Connection connection = ConnectionPool.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SAVE, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, hero.getName());
            preparedStatement.setString(2, hero.getIdentity());
            preparedStatement.setInt(3, hero.getAge());
            preparedStatement.setString(4, hero.getGender().name());
            preparedStatement.setLong(5, hero.getAbility().getId());

            preparedStatement.executeUpdate();

            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                hero.setId(generatedKeys.getLong("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return hero;
    }

    public List<Hero> findAll() {
        List<Hero> heroes = new ArrayList<>();
        try (Connection connection = ConnectionPool.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(FIND_ALL);
            while (resultSet.next()) {
                Hero hero = getHeroFromResultSet(resultSet);
                heroes.add(hero);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return heroes;
    }

    public Optional<Hero> findById(Long heroId) {
        Optional<Hero> hero = Optional.empty();
        try (Connection connection = ConnectionPool.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID)) {
            preparedStatement.setLong(1, heroId);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                hero = Optional.of(getHeroFromResultSet(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return hero;
    }

    private Hero getHeroFromResultSet(ResultSet resultSet) throws SQLException {
        return Hero.builder()
                .id(resultSet.getLong("hero_id"))
                .name(resultSet.getString("hero_name"))
                .identity(resultSet.getString("identity"))
                .age(resultSet.getInt("age"))
                .gender(Gender.valueOf(resultSet.getString("gender")))
                .ability(Ability.builder()
                        .id(resultSet.getLong("ability_id"))
                        .name(resultSet.getString("ability_name"))
                        .build())
                .build();
    }

    public static HeroDao getInstance() {
        return INSTANCE;
    }
}
