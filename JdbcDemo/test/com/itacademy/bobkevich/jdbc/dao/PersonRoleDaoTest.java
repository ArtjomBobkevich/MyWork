package com.itacademy.bobkevich.jdbc.dao;

import com.itacademy.bobkevich.jdbc.entity.PersonRole;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class PersonRoleDaoTest {

    private PersonRoleDao personRoleDao = PersonRoleDao.getPersonRoleDao();

    @Test
    public void checkSave() {
        PersonRole savePersonRole = PersonRoleDao.getPersonRoleDao().save(PersonRole.builder()
                .nameOfRole("Instance")
                .build());


        assertNotNull(savePersonRole.getId());
    }

    @Test
    public void checkFindOne() {
        Optional<PersonRole> personRole = personRoleDao.findOne(4);
        assertTrue(personRole.isPresent());
    }

    @Test
    public void checkDelite() {
        boolean delete = PersonRoleDao.getPersonRoleDao().delete(4);
        assertTrue(delete);
    }

    @Test
    public void checkUpdate() {
        PersonRole update = PersonRoleDao.getPersonRoleDao().update(PersonRole.builder()
                .id(4)
                .nameOfRole("Instance update")
                .build());
        assertNotNull(update.getId());
    }


}