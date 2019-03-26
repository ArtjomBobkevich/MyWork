package com.itacademy.bobkevich.servlet.service;

import com.itacademy.bobkevich.servlet.dao.TypeFileDao;
import com.itacademy.bobkevich.servlet.entity.TypeFile;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TypeFileService {

    private static final TypeFileService TYPE_FILE_SERVICE=new TypeFileService();

    public Optional<TypeFile> findAllresourcesAboutThisTypeFile(Integer id) {
        return TypeFileDao.getTypeFileDao().findAllresourcesAboutThisTypeFile(id);
    }

    public TypeFile save(TypeFile typeFile) {
        return TypeFileDao.getTypeFileDao().save(typeFile);
    }

    public TypeFile update(TypeFile typeFile) {
        return TypeFileDao.getTypeFileDao().update(typeFile);
    }

    public Optional<TypeFile> findOne(Integer id) {
        return TypeFileDao.getTypeFileDao().findOne(id);
    }

    public boolean delete(Integer id) {
        return TypeFileDao.getTypeFileDao().delete(id);
    }

    public static TypeFileService getTypeFileService() {
        return TYPE_FILE_SERVICE;
    }
}