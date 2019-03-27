package com.itacademy.bobkevich.servlet.dao;

import com.itacademy.bobkevich.servlet.entity.Category;
import com.itacademy.bobkevich.servlet.entity.TypeFile;
import com.itacademy.bobkevich.servlet.util.ResourceCategory;
import com.itacademy.bobkevich.servlet.util.ResourceType;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class TypeFileDaoTest {

    private TypeFileDao typeFileDao=TypeFileDao.getTypeFileDao();

    @Test
    public void checkById() {
        Optional<TypeFile> typeFile = typeFileDao.findAllresourcesAboutThisTypeFile(ResourceType.FILM);
        assertTrue(typeFile.isPresent());
        System.out.println(typeFile.get());
    }

    @Test
    public void checkSave () {
        TypeFile saveTypeFile = TypeFileDao.getTypeFileDao().save(TypeFile.builder()
                .name("Instance")
                .build());

        assertNotNull(saveTypeFile.getId());
    }

    @Test
    public void checkFindOne () {
        Optional<TypeFile> typeFile = typeFileDao.findOne(9);
        assertTrue(typeFile.isPresent());
    }

    @Test
    public void checkDelite () {
        boolean delete = TypeFileDao.getTypeFileDao().delete(9);
        assertTrue(delete);
    }

    @Test
    public void checkUpdate () {
        TypeFile update = TypeFileDao.getTypeFileDao().update(TypeFile.builder()
                .id(9L)
                .name("Instance update")
                .build());
        assertNotNull(update.getId());
    }
}