package com.itacademy.bobkevich.servlet.service;

import com.itacademy.bobkevich.servlet.dao.GenreDao;
import com.itacademy.bobkevich.servlet.dto.ViewGenreInfoDto;
import com.itacademy.bobkevich.servlet.entity.Genre;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GenreService {

    private static final GenreService GENRE_SERVICE=new GenreService();

    public List<ViewGenreInfoDto>findAll () {
        return GenreDao.getGenreDao().findAll().stream()
                .map(it-> new ViewGenreInfoDto(it.getName()))
                .collect(Collectors.toList());
    }

    public Optional<Genre> findWhoHaveThisGenre (Integer id) {
        return GenreDao.getGenreDao().findWhoHaveThisGenre(id);
    }

//    public Optional<Genre> findOne(Integer id) {
//        return GenreDao.getGenreDao().findOne(id);
//    }

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
