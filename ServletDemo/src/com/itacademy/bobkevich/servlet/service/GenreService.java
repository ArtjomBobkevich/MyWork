package com.itacademy.bobkevich.servlet.service;

import com.itacademy.bobkevich.servlet.dao.GenreDao;
import com.itacademy.bobkevich.servlet.entity.Genre;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GenreService {

    private static final GenreService GENRE_SERVICE=new GenreService();

    public Optional<Genre> findWhoHaveThisGenre (Integer id) {
        return GenreDao.getGenreDao().findWhoHaveThisGenre(id);
    }

    public Optional<Genre> findOne(Integer id) {
        return GenreDao.getGenreDao().findOne(id);
    }

    public Genre save(Genre genre) {
        return GenreDao.getGenreDao().save(genre);
    }

    public Genre update(Genre genre){
        return GenreDao.getGenreDao().update(genre);
    }

    public boolean delete(Integer id) {
        return GenreDao.getGenreDao().delete(id);
    }

    public static GenreService getGenreService() {
        return GENRE_SERVICE;
    }
}
