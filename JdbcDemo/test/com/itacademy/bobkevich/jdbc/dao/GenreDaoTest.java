package com.itacademy.bobkevich.jdbc.dao;

import com.itacademy.bobkevich.jdbc.entity.Genre;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class GenreDaoTest {

    private GenreDao genreDao = GenreDao.getGenreDao();

    @Test
    public void checkSave() {
        Genre genre = Genre.builder()
                .name("Instance")
                .build();
        Genre save = genreDao.save(genre);
        Assert.assertNotNull(save.getId());
    }

    @Test
    public void checkById() {
        Optional<Genre> genre = genreDao.findWhoHaveThisGenre(41);
        assertTrue(genre.isPresent());
        System.out.println(genre.get());
    }

    @Test
    public void checkFindOne() {
        Optional<Genre> genre = genreDao.findOne(42);
        assertTrue(genre.isPresent());
    }

    @Test
    public void checkDelite() {
        boolean delete = GenreDao.getGenreDao().delete(42);
        assertTrue(delete);
    }

    @Test
    public void checkUpdate() {
        Genre update = GenreDao.getGenreDao().update(Genre.builder()
                .id(42)
                .name("Instance Update")
                .build());
        assertNotNull(update.getId());
    }
}