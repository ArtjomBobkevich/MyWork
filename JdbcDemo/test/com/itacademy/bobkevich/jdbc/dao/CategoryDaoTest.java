package com.itacademy.bobkevich.jdbc.dao;

import com.itacademy.bobkevich.jdbc.entity.Category;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class CategoryDaoTest {

    private CategoryDao categoryDao=CategoryDao.getCategoryDao();

    @Test
    public void checkSave () {
        Category category= CategoryDao.getCategoryDao().categorySave(Category.builder()
                .name("Instance")
                .build());
        assertNotNull(category.getId());
    }

    @Test
    public void checkUpdate () {
        Category updateCategory = CategoryDao.getCategoryDao().categoryUpdate(Category.builder()
                .id(6)
                .name("Instance2")
                .build());
        assertNotNull(updateCategory.getId());
    }

    @Test
    public void checkFindOne () {
        Optional<Category> category = categoryDao.categoryFindOne(6);
        assertTrue(category.isPresent());
    }

    @Test
    public void checkDelite () {
        boolean delite = CategoryDao.getCategoryDao().categoryDelite(6);
        assertTrue(delite);
    }
}