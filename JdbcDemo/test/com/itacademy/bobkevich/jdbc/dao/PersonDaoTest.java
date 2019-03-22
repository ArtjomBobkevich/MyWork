package com.itacademy.bobkevich.jdbc.dao;

import com.itacademy.bobkevich.jdbc.entity.Person;
import com.itacademy.bobkevich.jdbc.entity.PersonRole;
import com.itacademy.bobkevich.jdbc.util.Role;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class PersonDaoTest {

    private PersonDao personDao = PersonDao.getPersonDao();

    @Test
    public void checkSave() {
        Person person = Person.builder()
                .login("Jonny")
                .first_name("Eskabar")
                .last_name("Diego")
                .age(33)
                .mail("www.el-chappo.me")
                .password("liveIsGood")
                .personRole(PersonRole.builder()
                        .id(Role.ADMIN)
                        .build())
                .build();
        Person save = personDao.save(person);
        assertNotNull(save.getLogin());
    }

    @Test
    public void checkFindOne() {
        Optional<Person> person = personDao.findOne("beast");
        assertTrue(person.isPresent());
    }

    @Test
    public void checkDelite() {
        boolean delete = PersonDao.getPersonDao().delete("Jonny");
        assertTrue(delete);
    }

    @Test
    public void checkUpdate() {
        Person update = PersonDao.getPersonDao().update(Person.builder()
                .login("Jonny")
                .first_name("Eskabar")
                .last_name("Diego")
                .age(33)
                .mail("www.el-chappo.me")
                .password("liveIsGood")
                .personRole(PersonRole.builder()
                        .id(Role.USER)
                        .build())
                .build());
        assertNotNull(update.getLogin());
    }
}