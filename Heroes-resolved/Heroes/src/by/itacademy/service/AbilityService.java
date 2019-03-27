package by.itacademy.service;

import by.itacademy.dao.AbilityDao;
import by.itacademy.entity.Ability;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by 1 on 11.03.2018.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class AbilityService {

    private static final AbilityService INSTANCE = new AbilityService();

    public List<Ability> findAll() {
        return AbilityDao.getInstance().findAll();
    }

    public static AbilityService getInstance() {
        return INSTANCE;
    }
}
