package com.itacademy.bobkevich.jdbc.dao;

import com.itacademy.bobkevich.jdbc.entity.Person;
import com.itacademy.bobkevich.jdbc.entity.PersonRole;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonDaoTest {

    private PersonDao personDao= PersonDao.getPersonDao();

    @Test
    public void checkSave (){
        Person person = Person.builder()
                .login("Jonny")
                .first_name("Eskabar")
                .last_name("Diego")
                .age(33)
                .mail("www.el-chappo.me")
                .password("liveIsGood")
                .personRole(PersonRole.builder()
                        .id(1)
                        .nameOfRole("Admin")
                        .build())
                .build();
        Person save = personDao.save(person);
        assertNotNull(save.getLogin());
    }
}