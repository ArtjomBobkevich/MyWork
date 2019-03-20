package com.itacademy.bobkevich.jdbc.dao;

import com.itacademy.bobkevich.jdbc.entity.Genre;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class GenreDaoTest {

    private GenreDao genreDao=GenreDao.getGenreDao();

    @Test
    public void checkSave () {
        Genre genre= Genre.builder()
                .name("Amazing")
                .build();
        Genre save = genreDao.save(genre);
        Assert.assertNotNull(save.getId());
    }

    @Test
    public void checkById () {
        Optional<Genre> genre = genreDao.findOne(1);
        assertTrue(genre.isPresent());
        System.out.println(genre.get());
    }

}