package com.itacademy.bobkevich.servlet.service;

import com.itacademy.bobkevich.servlet.dao.CategoryDao;
import com.itacademy.bobkevich.servlet.entity.Category;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CategoryService {

    private static final CategoryService CATEGORY_SERVICE=new CategoryService();

    public Optional<Category> findAllResourcesAboutThisCategory(Long id) {
        return CategoryDao.getCategoryDao().findAllResourcesAboutThisCategory(id);
    }

    public Category categorySave(Category category) {
        return CategoryDao.getCategoryDao().categorySave(category);
    }

    public Category categoryUpdate(Category category) {
        return CategoryDao.getCategoryDao().categoryUpdate(category);
    }

    public Optional<Category> categoryFindOne(Integer id) {
        return CategoryDao.getCategoryDao().categoryFindOne(id);
    }

    public boolean categoryDelite(Integer id) {
        return CategoryDao.getCategoryDao().categoryDelite(id);
    }

    public static CategoryService getCategoryService() {
        return CATEGORY_SERVICE;
    }
}
