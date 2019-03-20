package com.itacademy.bobkevich.jdbc.dao;

import com.itacademy.bobkevich.jdbc.entity.Genre;
import com.itacademy.bobkevich.jdbc.entity.Resource;
import com.itacademy.bobkevich.jdbc.util.ResourceGenre;
import org.junit.Test;
import org.junit.internal.matchers.IsCollectionContaining;

import static org.junit.Assert.*;
import static org.junit.internal.matchers.IsCollectionContaining.*;

public class ResourceDaoTest {

  //  public static void main(String[] args) {
//        ResourceDao.getResourceDao().findOne(7)
//                .map(it -> it.setSize(666))
//                .ifPresent(ResourceDao.getResourceDao()::update);



//        Resource saveResource=ResourceDao.getResourceDao().save(Resource.builder() отработала вставила ресурс id 7
//                .resourceName("Рэмбо")
//                .typeFile(TypeFile.builder()
//                        .id(3)
//                        .build())
//                .category(Category.builder()
//                        .id(3)
//                        .build())
//                .person(Person.builder()
//                        .login("beast")
//                        .build())
//                .url("www.habr.ru")
//                .size(200)
//                .build());
//        System.out.println(saveResource);

//              System.out.println(ResourceDao.getResourceDao().delete(2)); отработала удалила 2 id
        //      ResourceDao.getResourceDao().findOne(2).ifPresent(System.out::println);  отработала посмотрела
//    }

    private ResourceDao resourceDao=ResourceDao.getResourceDao();

    @Test
    public void checkAddGenre () {
        Resource resource = Resource.builder()
                .id(ResourceGenre.RESOURCE_ID7)
                .build();
        Genre genre=Genre.builder()
                .id(ResourceGenre.GENRE_ID1)
                .build();

        Resource savedResource = resourceDao.addGenre(resource,genre);
        assertThat(savedResource.getGenres(),hasItem(genre));
    }
}