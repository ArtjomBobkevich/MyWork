package com.itacademy.bobkevich.servlet.dao;

import com.itacademy.bobkevich.servlet.entity.Category;
import com.itacademy.bobkevich.servlet.entity.Genre;
import com.itacademy.bobkevich.servlet.entity.Person;
import com.itacademy.bobkevich.servlet.entity.Resource;
import com.itacademy.bobkevich.servlet.entity.TypeFile;
import com.itacademy.bobkevich.servlet.util.ResourceCategory;
import com.itacademy.bobkevich.servlet.util.ResourceGenre;
import com.itacademy.bobkevich.servlet.util.ResourceType;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;
import static org.junit.internal.matchers.IsCollectionContaining.*;

public class ResourceDaoTest {

    private ResourceDao resourceDao = ResourceDao.getResourceDao();

    @Test
    public void checkAddGenre() {
        Resource resource = Resource.builder()
                .id(1L)
                .build();
        Genre genre1 = Genre.builder()
                .id(ResourceGenre.ACTION)
                .build();
        Genre genre2 = Genre.builder()
                .id(ResourceGenre.AMAIZING)
                .build();
        Genre genre3 = Genre.builder()
                .id(ResourceGenre.CLASSIC)
                .build();

        Resource savedResource = resourceDao.addGenre(resource, genre1);
        assertThat(savedResource.getGenres(), hasItem(genre1));
        Resource savedResource2 = resourceDao.addGenre(resource, genre2);
        assertThat(savedResource2.getGenres(), hasItem(genre2));
        Resource savedResource3 = resourceDao.addGenre(resource, genre3);
        assertThat(savedResource3.getGenres(), hasItem(genre3));
    }

    @Test
    public void checkById() {
        Optional<Resource> resource = resourceDao.findAllCommentsAboutThisResource(1);
        assertTrue(resource.isPresent());
        System.out.println(resource.get());
    }

    @Test
    public void checkSave() {
        Resource saveResource = ResourceDao.getResourceDao().save(Resource.builder()
                .resourceName("Рэмбо 2")
                .typeFile(TypeFile.builder()
                        .id(ResourceType.FILM)
                        .build())
                .category(Category.builder()
                        .id(ResourceCategory.ENTERTAINMENT)
                        .build())
                .person(Person.builder()
                        .login("beast")
                        .build())
                .url("www.habr.ru")
                .size(200)
                .build());
        assertNotNull(saveResource.getId());
    }

    @Test
    public void checkFindOne() {
        Optional<Resource> resource = resourceDao.findById(1L);
        assertTrue(resource.isPresent());
    }

    @Test
    public void checkDelite() {
        boolean delete = ResourceDao.getResourceDao().delete(2);
        assertTrue(delete);
    }

    @Test
    public void checkUpdate() {
        Resource update = ResourceDao.getResourceDao().update(Resource.builder()
                .id(1L)
                .resourceName("Рэмбо 22")
                .typeFile(TypeFile.builder()
                        .id(ResourceType.FILM)
                        .build())
                .category(Category.builder()
                        .id(ResourceCategory.ENTERTAINMENT)
                        .build())
                .person(Person.builder()
                        .login("beast")
                        .build())
                .url("www.habr.ru")
                .size(222)
                .build());
        assertNotNull(update.getId());
    }
}