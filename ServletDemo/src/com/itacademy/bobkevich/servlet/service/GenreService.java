package com.itacademy.bobkevich.servlet.service;

import com.itacademy.bobkevich.servlet.dao.GenreDao;
import com.itacademy.bobkevich.servlet.dto.CreateNewGenreDto;
import com.itacademy.bobkevich.servlet.dto.ViewGenreInfoDto;
import com.itacademy.bobkevich.servlet.entity.Genre;
import com.itacademy.bobkevich.servlet.entity.Resource;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GenreService {

    private static final GenreService GENRE_SERVICE=new GenreService();

    public List<ViewGenreInfoDto>findAll () {
        return GenreDao.getGenreDao().findAll().stream()
                .map(it-> new ViewGenreInfoDto(it.getId(),it.getName()))
                .collect(Collectors.toList());
    }

    public Set<Resource> findWhoHaveThisGenre (Long id) {
        return GenreDao.getGenreDao().findWhoHaveThisGenre(id).get().getResources(); /*тут фигачить дто*/
    }

    public ViewGenreInfoDto findOne(Long genreId) {
        return GenreDao.getGenreDao().findOne(genreId)
                .map(it->ViewGenreInfoDto.builder()
                        .name(it.getName())
                        .build())
                .orElse(null);
    }

    public ViewGenreInfoDto save(CreateNewGenreDto genre) {
        Genre savedGenre =GenreDao.getGenreDao().save(
                Genre.builder()
                        .id(genre.getId())
                        .name(genre.getName())
                        .build());

        return new ViewGenreInfoDto(savedGenre.getId(),savedGenre.getName());
    }

    public Genre update(Genre genre){  /*не пашет*/
        return GenreDao.getGenreDao().update(genre);
    }

    public boolean delete(Integer id) {
        return GenreDao.getGenreDao().delete(id);
    }

    public static GenreService getGenreService() {
        return GENRE_SERVICE;
    }
}
