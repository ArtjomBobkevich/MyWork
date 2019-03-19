package com.itacademy.bobkevich.jdbc;

import com.itacademy.bobkevich.jdbc.dao.ResourceDao;
import com.itacademy.bobkevich.jdbc.entity.Category;
import com.itacademy.bobkevich.jdbc.entity.Person;
import com.itacademy.bobkevich.jdbc.entity.Resource;
import com.itacademy.bobkevich.jdbc.entity.TypeFile;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ResourceDaoTest {
    public static void main(String[] args) {
        ResourceDao.getResourceDao().findOne(7)
                .map(peek(it->it.setSize(777)))
                .ifPresent(ResourceDao.getResourceDao()::update);


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
    }

    public static  <T>UnaryOperator<T> peek (Consumer<T> consumer){
        return object -> {
            consumer.accept(object);
            return object;
        };
    }
}
