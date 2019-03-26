package com.itacademy.bobkevich.servlet.service;

import com.itacademy.bobkevich.servlet.dao.PersonDao;
import com.itacademy.bobkevich.servlet.entity.Person;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PersonService {

    private static final PersonService PERSON_SERVICE=new PersonService();

    public Person save (Person entity) {
        return PersonDao.getPersonDao().save(entity);
    }

    public Person update(Person person){
        return PersonDao.getPersonDao().update(person);
    }

    public Optional<Person> findOne(String login) {
        return PersonDao.getPersonDao().findOne(login);
    }

    public boolean delete(String login) {
        return PersonDao.getPersonDao().delete(login);
    }

    public static PersonService getPersonService() {
        return PERSON_SERVICE;
    }
}
